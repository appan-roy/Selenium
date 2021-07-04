package selenium.easy.date.pickers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BootstrapDatePicker {

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
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		if(driver.findElements(By.cssSelector("a[href='#'][id='at-cv-lightbox-close']")).size() != 0) {
			driver.findElement(By.cssSelector("a[href='#'][id='at-cv-lightbox-close']")).click();
		}
	}
	
	@AfterTest
	public void testTeardown() {
		driver.quit();
	}
	
	@Test
	public void dateExample() {

		WebElement calendarIcon = driver.findElement(By.cssSelector("i[class='glyphicon glyphicon-th']"));
		calendarIcon.click();
		
		WebElement todayDate = driver.findElement(By.cssSelector(".table-condensed>tbody>tr>td[class='today day']"));
		todayDate.click();
		
	}
	
	@Test
	public void dateRangeExample() {
		
		WebElement startDate = driver.findElement(By.cssSelector("input[placeholder='Start date']"));
		startDate.click();
		
		WebElement firstDate = driver.findElement(By.cssSelector("table[class='table-condensed']>tbody>tr>td:nth-child(5)"));
		firstDate.click();
		
		WebElement endDate = driver.findElement(By.cssSelector("input[placeholder='End date']"));
		endDate.click();
		
		WebElement lastDate = driver.findElement(By.cssSelector("table[class='table-condensed']>tbody>tr>td:nth-child(7)"));
		lastDate.click();
		
	}
	
}
