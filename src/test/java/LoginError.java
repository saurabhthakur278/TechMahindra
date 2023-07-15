import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginError {

	@Test
	public void login() 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		driver.get("https://itera-qa.azurewebsites.net/Login");
		
		WebElement email=	driver.findElement(By.cssSelector("#Username"));
		
		WebElement pass= driver.findElement(By.cssSelector("#Password"));

		WebElement loginbtn = driver.findElement(By.xpath("//input[@name='login']"));
		
		email.sendKeys("Sthakur");
		pass.sendKeys("Qwerty@");
		loginbtn.click();
		
		String errortext = driver.findElement(By.cssSelector(".alert-danger")).getText();
      
		 System.out.println(errortext);
	
	Assert.assertEquals(errortext, "Wrong username or password");
	
	
	}
	
	
	
}
