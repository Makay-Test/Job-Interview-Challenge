package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features={"src/test/resources/Features"},
		glue={"steps_Definitions"},
		plugin= {"pretty","html:target/Reports_HTML/report.html"})

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
