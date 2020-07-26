package stepDefinition;

import net.thucydides.core.annotations.Step;
import pages.OrangeHRMLoginPage;

public class OrangeHRMLoginSteps {

OrangeHRMLoginPage home;
	
	@Step("This step will verify the title")
	public void verifyTitle() {
		
		home.checkTitle();
		
	}
	
	@Step("This step will allow us to login to the application")
	public void validLogin() {
		
		home.enterCredentials();
		
	}
	
	@Step("This step will verify the dashboard")
	public void verifyDashboard() {
	
		home.checkDashboard();
	
	}
	
}
