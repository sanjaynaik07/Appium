package com.appium.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	public static AndroidDriver  driver;
	public static ExtentReports _extent_report;
	public static ExtentTest _test_logger;
	

	
	public  TestBase() 
	{
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "32085c3010e5710b");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		URL u=null;
		try {
			u = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver=new AndroidDriver(u,capabilities);
		
		
}
	
	public static void Extentreports() {
	
		_extent_report= new ExtentReports(System.getProperty("user.dir") + File.separator
				+"AppiumExtentReport.html"); 
		
		
	    	_extent_report.loadConfig(new File( 
    			System.getProperty("user.dir") + "\\src\\main\\java\\com\\appium\\config\\extentconfig.xml"));
    
	}
   





	public static void driverinit() {
		// TODO Auto-generated method stub
		driver.get("https://www.amazon.in/");
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	}
	
}