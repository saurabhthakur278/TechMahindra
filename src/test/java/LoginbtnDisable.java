import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginbtnDisable {

	
	
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
		
		email.clear();
		pass.clear();
		loginbtn.click();
	
		boolean actualvalue=loginbtn.isDisplayed();
		
		
		if(actualvalue) {
			System.out.println("button is enable");
		}else {
			System.out.println("button is disables");
		}
	
	
}
}