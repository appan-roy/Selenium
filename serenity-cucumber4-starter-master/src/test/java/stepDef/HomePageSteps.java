package stepDef;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomePageSteps {

	HomePage hpage;
	
	@Step
	public void verifyAdmin() {
		
		hpage.loginVerified();
		
	}
	
}