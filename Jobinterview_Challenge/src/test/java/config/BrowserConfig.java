package config;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import steps_Definitions.SignIn;

public class BrowserConfig extends SignIn{
	// Initialize browser setup.
	public static void browserLaunch() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	// Terminate browser instance.
	public static void browserTerminate() {
		driver.quit();
	}
}
