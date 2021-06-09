package interviewQnA;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Synchronization {
	
	static WebDriver driver;
	static String driverProp = "webdriver.chrome.driver";
	static String driverPath = "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe";
	
	public static void main(String[] args) {
		
		System.setProperty(driverProp, driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// driver level sync
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
		// element level sync
		// implicit wait / global wait for all elements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		// explicit wait / webdriver wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		
		// fluent wait
		FluentWait<WebDriver> f_wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(Exception.class);
		
		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>(){
			@Override
			public Boolean apply(WebDriver driver) {
				WebElement element = driver.findElement(By.name("q"));
				if(element != null)
					return true;
				else
					return false;
			}
		};
		
		try {
			f_wait.until(function);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}