//package stepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//import pages.LoginPage_POM;
//
//public class LoginSteps_POM {
//
//	WebDriver driver = null;
//	
//	LoginPage_POM login;
//	
//	@Given("^Open chrome and start application$")
//	public void Open_chrome_and_start_application() throws Throwable {
//	    
//		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://example.testproject.io/web/");
//		
//	}
//
//	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
//	public void I_enter_valid_username_and_valid_password(String uid, String pwd) throws Throwable {
//	    
//		login = new LoginPage_POM(driver);
//		
//		login.enterUsername(uid);
//		
//		login.enterPassword(pwd);
//			
//	}
//
//	@Then("^user should be able to login successfully$")
//	public void user_should_be_able_to_login_successfully() throws Throwable {
//	   
//		login.clickLoginButton();
//		
//		login.checkLogoutButtonDisplayed();
//		
//	}
//	
//	@Then("^the application should be closed$")
//	public void the_application_should_be_closed() throws Throwable {
//		
//		Thread.sleep(3000);
//		
//		driver.quit();
//		
//	}
//	
//}
