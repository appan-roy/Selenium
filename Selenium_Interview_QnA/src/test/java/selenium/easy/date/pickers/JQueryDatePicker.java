package selenium.easy.date.pickers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JQueryDatePicker {

	WebDriver driver;
	String driverProp = "webdriver.chrome.driver";
	String driverPath = ".\\src\\main\\resources\\webdriver\\chromedriver.exe";
	
	@BeforeTest
	public void testSetup() {
		System.setProperty(driverProp, driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		if(driver.findElements(By.cssSelector("a[href='#'][id='at-cv-lightbox-close']")).size() != 0) {
			driver.findElement(By.cssSelector("a[href='#'][id='at-cv-lightbox-close']")).click();
		}
	}
	
	@AfterTest
	public void testTeardown() {
		driver.quit();
	}
	
	@Test
	public void dateRangePicker() {
		
		WebElement startDate = driver.findElement(By.cssSelector("input[name='from']"));
		startDate.click();
		
		List<WebElement> rows = driver.findElements(By.cssSelector("table[class='ui-datepicker-calendar']>tbody>tr"));
		System.out.println("Total no. of rows : " + rows.size());
		
		List<WebElement> cols = driver.findElements(By.cssSelector("table[class='ui-datepicker-calendar']>tbody>tr:nth-child(1)>td"));
		System.out.println("Total no. of columns : " + cols.size());
		
		String str1 = "table[class='ui-datepicker-calendar']>tbody>tr:nth-child(";
		String str2 = ")>td:nth-child(";
		String str3 = ")";
		
		for(int i = 1; i <= rows.size(); i++) {
			for(int j = 1; j <= cols.size(); j++) {
				WebElement start_date = driver.findElement(By.cssSelector(str1+i+str2+j+str3));
				if(start_date.getText().equals("1")) {
					start_date.click();
					break;
				}
			}
		}
		
		WebElement endDate = driver.findElement(By.cssSelector("input[name='to']"));
		endDate.click();
		
		for(int i = 1; i <= rows.size(); i++) {
			for(int j = 1; j <= cols.size(); j++) {
				WebElement end_date = driver.findElement(By.cssSelector(str1+i+str2+j+str3));
				if(end_date.getText().equals("31")) {
					end_date.click();
					break;
				}
			}
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
