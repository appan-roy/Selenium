package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import stepDef.HomePageSteps;
import stepDef.LoginPageSteps;

public class LoginTestOrangeHRM {

	@Steps
	LoginPageSteps login;
	
	@Steps
	HomePageSteps home;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    
		login.openApp();
		
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
	    
		login.enterUname();
		
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
	    
		login.enterPwd();
		
		login.hitLogin();
		
	}

	@Then("user is able to login to the application")
	public void user_is_able_to_login_to_the_application() {
	    
		home.verifyAdmin();
		
	}
	
}
