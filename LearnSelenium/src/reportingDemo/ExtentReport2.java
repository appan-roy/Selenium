package reportingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import lib.Utility;

public class ExtentReport2 {
	
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	//THIS TEST IS NOT WORKING DUE TO SOME ISSUES OF EXTENT REPORT VERSION 2//
	
	@Test
	public void verifyTitle(){
		
		//report = new ExtentReports("E:\\Softwares\\My PC Apps\\Selenium\\Report\\Extent Reports\\LearnAutomation.html");
		
		report = new ExtentReports();
		
		report.init("E:\\Softwares\\My PC Apps\\Selenium\\Report\\Extent Reports\\ExtentReport2.html", true);
		
		//logger = report.startTest("VerifyPageTitle");
		
		report.startTest("VerifyPageTitle");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		logger.log(LogStatus.INFO, "Browser is up and running");
		
		driver.get("https://www.facebook.com/"); 
		
		logger.log(LogStatus.INFO, "Application is up and running");
		
		String title = driver.getTitle();
		
		Assert.assertTrue(title.contains("Selenium"));
		
		logger.log(LogStatus.PASS, "Title is verified");
		
	}
	
	public void tearDown(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			
			String snap_path = Utility.captureSnap(driver, result.getName());
			
			logger.log(LogStatus.FAIL, snap_path);
			
		}
		
		report.endTest();
		
	}
	
}
