import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	@Test
	public void login() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.manage().window().maximize();
		
      driver.get("https://itera-qa.azurewebsites.net/Login");
		
		WebElement email=	driver.findElement(By.cssSelector("#Username"));
		
		WebElement pass= driver.findElement(By.cssSelector("#Password"));

		WebElement loginbtn = driver.findElement(By.xpath("//input[@name='login']"));
		
		email.sendKeys("Sthakur");
		pass.sendKeys("Qwerty@");
		loginbtn.click();
		
		
      
	String HomepageName=driver.findElement(By.cssSelector("div[class='container body-content'] div h3")).getText();
		
	Assert.assertEquals("Welcome Sthakur", HomepageName);
	
	
	
	
	}

}
