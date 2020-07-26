package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMLoginPage extends PageObject {

	public void checkTitle() {
		
		String title = getDriver().getTitle();
		
		Assert.assertTrue(title.contains("OrangeHRM"));
		
	}
	
	public void enterCredentials() {
		
		$(By.id("txtUsername")).typeAndTab("Admin");
		
		$(By.id("txtPassword")).typeAndEnter("admin123");
		
	}
	
	public void checkDashboard() {
		
		String curr_url = getDriver().getCurrentUrl();
		
		Assert.assertTrue(curr_url.contains("dashboard"));
		
	}
	
}
