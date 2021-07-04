package selenium.easy.input.forms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleFormDemo {

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
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		if(driver.findElements(By.cssSelector("a[href='#'][id='at-cv-lightbox-close']")).size() != 0) {
			driver.findElement(By.cssSelector("a[href='#'][id='at-cv-lightbox-close']")).click();
		}
	}
	
	@AfterTest
	public void testTeardown() {
		driver.quit();
	}
	
	@Test
	public void singleInputField() {

		WebElement msgBox = driver.findElement(By.cssSelector("#user-message"));
		msgBox.clear();
		msgBox.sendKeys("Selenium");

		WebElement showMsgBtn = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
		showMsgBtn.click();
		
		String output = driver.findElement(By.cssSelector("#display")).getText();
		Assert.assertEquals(output, "Selenium");
		
	}
	
	@Test
	public void twoInputFields() {
		
		WebElement a = driver.findElement(By.cssSelector("#sum1"));
		a.clear();
		a.sendKeys("7");
		
		WebElement b = driver.findElement(By.cssSelector("#sum2"));
		b.clear();
		b.sendKeys("3");

		WebElement getTotalBtn = driver.findElement(By.cssSelector("button[onclick='return total()']"));
		getTotalBtn.click();
		
		String output = driver.findElement(By.cssSelector("#displayvalue")).getText();
		Assert.assertEquals(output, "10");
		
	}
	
}
