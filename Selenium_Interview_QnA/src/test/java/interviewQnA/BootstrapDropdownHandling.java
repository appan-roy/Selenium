package interviewQnA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownHandling {
	
	static WebDriver driver;
	static String driverProp = "webdriver.chrome.driver";
	static String driverPath = "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe";
	
	public static void main(String[] args) {

		System.setProperty(driverProp, driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		
		List<WebElement> dd_list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		for(WebElement ele:dd_list) {
			if(ele.getText().equals("JavaScript"))
				ele.click();
		}
		
		driver.quit();

	}

}
