package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import stepDefinition.OrangeHRMLoginSteps;

@RunWith(SerenityRunner.class)
public class OrangeHRMLoginTest extends PageObject {

	@Managed
	WebDriver driver;
	
	@Steps
	OrangeHRMLoginSteps home;
	
	@Test
	public void loginTest() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		home.verifyTitle();
		
		home.validLogin();
		
		home.verifyDashboard();
		
	}
	
}
