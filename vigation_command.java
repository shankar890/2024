package lounch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class vigation_command {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.gecko.driver", "./Softy/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/selenium/newtours/");
		
		driver.navigate().to("https://www.selenium.dev/");
		
		
		driver.navigate().back();
		

		Thread.sleep(3000);
		
		
		driver.navigate().forward();
		
		driver.close();
		
		
	}

}
