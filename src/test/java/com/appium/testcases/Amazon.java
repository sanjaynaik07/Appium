package com.appium.testcases;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Amazon {
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		AndroidDriver driver;
		DesiredCapabilities capabilities1 = new DesiredCapabilities();
		capabilities1.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities1.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		capabilities1.setCapability(MobileCapabilityType.DEVICE_NAME, "32085c3010e5710b");
		capabilities1.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome"); 
		
		
		

				URL u=new URL("http://127.0.0.1:4723/wd/hub");
				 driver= new AndroidDriver(u,capabilities1);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id='nav-search-keywords']")).sendKeys("java8 books");
		
	}

}
