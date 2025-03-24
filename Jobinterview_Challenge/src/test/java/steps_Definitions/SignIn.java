package steps_Definitions;

import org.openqa.selenium.WebDriver;


import config.BrowserConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.LandingPage;

public class SignIn {

	public static WebDriver driver;
	@Given("user is in suacedemo landing page")
	public static void step1() {
		BrowserConfig.browserLaunch();
		
		LandingPage.verifyLandingPage();
	}

	@And("user is able to see email and password input field")
	public void step2() {
		LandingPage.verifyLoginFields();
	}

	@When("^user placed his or her (.*) and (.*)$")
	public static void step3(String email, String password) {
		LandingPage.sendUserCredentials(email, password);
	}

	@And("user clicks Login button")
	public static void step4() {
		LandingPage.clickLogin();
	}

	@Then("user is navigated to Products page")
	public static void step5() {
		LandingPage.verifyProductsPage();
	}

	@When("user clicks burger icon")
	public static void step6(){
		LandingPage.bgIcon();
	}
	
	@And("clicks logout")
	public static void step7(){
		LandingPage.forAwhile();
		LandingPage.userLogout();
	}
	
	@Then("user is navigated back to login page")
	public static void step8(){
		LandingPage.verifyLandingPage();
	}
	
	@And("user close the application")
	public static void step9() {
		BrowserConfig.browserTerminate();
	}

}
