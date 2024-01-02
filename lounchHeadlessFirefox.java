package lounch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class lounchHeadlessFirefox {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver", "./Softy/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/selenium/newtours/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sqeshankar");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shankar");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		System.out.println("TC pass");
		
		driver.close();
		
		
		
	
		
		

	}

}
