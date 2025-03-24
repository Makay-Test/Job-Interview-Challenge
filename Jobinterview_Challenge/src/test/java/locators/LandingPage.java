package locators;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import steps_Definitions.SignIn;

public class LandingPage extends SignIn {

	// Variable declaration
	private static By txtbox_username = By.id("user-name");
	private static By txtbox_password = By.id("password");
	private static By btn_login = By.id("login-button");
	private static By header_products = By.xpath("//*[text()='Products']");
	private static By bg_icon = By.id("react-burger-menu-btn");
	private static By btn_logout = By.id("logout_sidebar_link");

//Functions:

	// Step 1 and Step 9
	public static void verifyLandingPage() {
		Boolean expected = true, actual;
		actual = driver.findElement(btn_login).isDisplayed();
		Assert.assertEquals(actual, expected);
	}

	// Step 2
	public static void verifyLoginFields() {
		Boolean expected = true, actual;
		actual = driver.findElement(By.id("user-name")).isDisplayed();
		Assert.assertEquals(actual, expected);

		actual = driver.findElement(By.id("password")).isDisplayed();
		Assert.assertEquals(actual, expected);
	}

	// Step 3
	public static void sendUserCredentials(String data_username, String data_password) {
		driver.findElement(txtbox_username).sendKeys(data_username);
		driver.findElement(txtbox_password).sendKeys(data_password);
	}

	// Step 4
	public static void clickLogin() {
		driver.findElement(btn_login).click();
	}

	// Step 5
	public static void verifyProductsPage() {
		Boolean expected = true, actual;
		actual = driver.findElement(header_products).isDisplayed();
		Assert.assertEquals(actual, expected);
	}

	// Step 6
	public static void bgIcon() {
		driver.findElement(bg_icon).click();
	}

	// Step 7
	public static void userLogout() {
		driver.findElement(btn_logout).click();
	}
	
	//Explicit wait
	public static void forAwhile() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_logout));
	}

}
