package synchronizationDemo;

import java.util.concurrent.TimeUnit;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_Wait {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver> (driver);
		
		wait.pollingEvery(400, TimeUnit.MILLISECONDS);
		
		wait.withTimeout(20, TimeUnit.SECONDS);
		
		Function<WebDriver,Boolean> function = new Function<WebDriver,Boolean>(){
			
			@Override
			public Boolean apply(WebDriver arg0){
				
				WebElement element = arg0.findElement(By.id("dynamicColor"));
				
				String color = element.getAttribute("style");
				
				System.out.println("The color of the button is : " +color);
				
				if (color.contains("red")){
					
					return true;
					
				}
				
				return false;
				
			}
			
		};
		
		try {
		
			wait.until(function);
			
		} catch(TimeoutException e) {
			
			System.out.println("The element is not found");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
