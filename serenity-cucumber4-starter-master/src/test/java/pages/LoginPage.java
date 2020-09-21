package pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	public void enterUsername() {
		
		$(By.id("txtUsername")).type("Admin");
		
	}
	
	public void enterPassword() {
		
		$(By.id("txtPassword")).type("admin123");
		
	}
	
	public void clickLoginButton() {
		
		$(By.id("btnLogin")).click();
		
	}

}
