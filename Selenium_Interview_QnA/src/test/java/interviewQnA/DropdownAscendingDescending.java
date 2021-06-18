package interviewQnA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAscendingDescending {

	static WebDriver driver;
	static String driverProp = "webdriver.chrome.driver";
	static String driverPath = "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe";
	
	public static void main(String[] args) {
		
		System.setProperty(driverProp, driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select ele = new Select(driver.findElement(By.id("select-demo")));
		List<WebElement> dd_list = ele.getOptions();
		List<String> myList = new ArrayList<String>();
		
		for (WebElement el : dd_list) {
			myList.add(el.getText());
		}
		
		// sort ascending
		Collections.sort(myList);
		System.out.println(myList);
		
		// sort descending
		Collections.reverse(myList);
		System.out.println(myList);
		
		driver.quit();

	}

}
