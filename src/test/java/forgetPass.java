import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class forgetPass {


	
	@Test
	public void login() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.manage().window().maximize();
		
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      
      driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		
    String text=driver.findElement(By.xpath("//h6[normalize-space()='Reset Password']")).getText();
    
    Assert.assertEquals(text, "Reset Password");
}

}