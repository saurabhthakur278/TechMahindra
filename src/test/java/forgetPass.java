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
		
      driver.get("https://resumegenius.com/dashboard/app/account/login");
      
      driver.findElement(By.cssSelector(".text-link")).click();
       
      
      driver.findElement(By.cssSelector(".EMAI")).sendKeys("st0851097@gmail.com");
      
      driver.findElement(By.cssSelector(".reset-button button")).click();
      
      
      String SuccessMassage = driver.findElement(By.cssSelector(".builder-form-layout-title")).getText();
      
      Assert.assertEquals("Success", SuccessMassage);
      
     
      
      
      
      
      
}
	
	
	
	@Test
	public void loginAgain() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.manage().window().maximize();
		
      driver.get("https://resumegenius.com/dashboard/app/account/login");
	
      
      driver.findElement(By.cssSelector(".EMAI")).sendKeys("st0851097@gmail.com");
      
      driver.findElement(By.cssSelector(".PSWD")).sendKeys("Qwerty@1234");
      
      driver.findElement(By.cssSelector(".btn-group-footer button")).click();
      
      
	
	}
}