package serenityDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {

	@Managed
	WebDriver driver;
	
	@Test
	public void loginToOrangeHRM() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().fullscreen();
		
		WebElementFacade username = $(By.id("txtUsername"));
		
		username.shouldBeVisible();
		
		username.shouldBeEnabled();
		
		username.typeAndTab("Admin");
		
		WebElementFacade password = $(By.name("txtPassword"));
		
		password.shouldBeVisible();
		
		password.shouldBeEnabled();
		
		password.typeAndEnter("admin123");
		
	}
	
}
