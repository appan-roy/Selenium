package stepDef;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginPageSteps {

	LoginPage lpage;
	
	@Step
	public void openApp() {
		
		lpage.open();
		
	}
	
	@Step
	public void enterUname() {
		
		lpage.enterUsername();
		
	}
	
	@Step
	public void enterPwd() {
		
		lpage.enterPassword();
		
	}
	
	@Step
	public void hitLogin() {
		
		lpage.clickLoginButton();
		
	}
	
}
