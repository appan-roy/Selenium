package pages;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject{

	public void loginVerified() {
		
		System.out.println(getDriver().getTitle());
				
	}

}
