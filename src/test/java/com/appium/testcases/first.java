package com.appium.testcases;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class first {

	
/*public static void takescreenshot(WebDriver driver) throws IOException
{

    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    File DestFile=new File("C:\\Users\\sdhanavath\\Desktop\\Appium\\img.png");
    
    FileUtils.copyFile(SrcFile, DestFile);

}*/
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	  
		
		AndroidDriver driver;
						
			 
			  DesiredCapabilities capabilities = new DesiredCapabilities();
				/*capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G (5S) Plus");*/
			  /*
			  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G (4)");
				
				capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");*/
				/*capabilities.setCapability("unicodeKeyboard", "true");                                     
				capabilities.setCapability("resetKeyboard", "true");
				*/
			//	capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "50");
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
							
							driver.findElement(By.xpath("//input[@type='submit']")).click();
							
					int countofbooks=		driver.findElements(By.xpath("//h5[@class='sx-title']")).size();
				
					System.out.println(countofbooks);
							
				//			Thread.sleep(3000);
							
				//	driver.findElement(By.id ( "globalSearchInput")).sendKeys("Red Lion Hotel Port Angeles");
					//((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
				//	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
					
			//		((AndroidDeviceActionShortcuts) driver.findElement(By.id ( "globalSearchInput"))).pressKeyCode(AndroidKeyCode.ACTION_DOWN);
				//	Thread.sleep(5000);
					//((AndroidDeviceActionShortcuts) driver.findElement(By.id ( "globalSearchInput"))).pressKeyCode(AndroidKeyCode.ENTER);
			  /*	WebElement e=findElement(By.id ( "globalSearchInput"));
			  e.sendKeys("Red Lion Hotel Port Angeles");
				    	*/
			
		/*
		((AndroidDeviceActionShortcuts) e).pressKeyCode(AndroidKeyCode.ACTION_DOWN);
				((AndroidDeviceActionShortcuts) e).pressKeyCode(AndroidKeyCode.ENTER);*/
		
				    
				    /*	WebElement e1 = driver.findElement(By.xpath("//input[@id='searchStartDate']"));
						System.out.println(e1.isDisplayed());
						WebElement e2 = driver.findElement(By.xpath("//input[@id='searchEndDate']"));
						System.out.println(e2.isDisplayed());
						e1.clear();
						e1.sendKeys("Jan 03,2019");
						e2.clear();
						e2.sendKeys("Jan 04,2019");
						
						
					//	a.moveToElement(driver.findElement(By.xpath("//div/child::a/child::span"))).click().build().perform();
						//a.moveToElement(driver.findElement(By.xpath("//li/child::a[@title='Government']"))).click().build().perform();
						driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
				    	
				        
				        String exptitle="Affordable Hotels | Red Lion Hotel";
				        if(title.equals(exptitle))
				        {
				        	System.out.println("title valited");
				        }
				        else 
				        {
				        	first.takescreenshot(driver);
				        }
				      System.out.println(title);
				
				

						 driver.findElement(By.id("globalSearchInput")).sendKeys("sanjay");
						 driver.findElement(By.id("searchStartDate")).sendKeys("Oct 17,2018");
						
						 
						
					
						Thread.sleep(3000); 
		
			 



	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
}
