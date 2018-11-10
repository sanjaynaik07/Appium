package com.appium.testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.base.TestBase;
import com.appium.pages.HomePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase extends TestBase{
	
	ExtentTest child1;
	ExtentTest child2;
	ExtentTest child3;

//	HomePage h;
	
	TestCase()  {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void init()
	{
	
		driverinit();
		Extentreports();
//	 h=new HomePage();
	}
	
	@Test(priority=0,enabled=true)
	public void extent(){
		_test_logger = _extent_report.startTest("Test Scenario 1 : Validate Homepage Title ,  Add a product to cart ,  Enter login credentials");
		
		
	

		
	}
	
	
		
		@Test(priority=1,enabled=true, description="verify Title of the HomePage")
		public void verifyTitleoftheHomePage()
		{
			
			 child1 = _extent_report.startTest("verify Title of the HomePage.");
			 String Actualtitle=		driver.getTitle();
				
             String ExpTitle="Amazon India";
			 if(Actualtitle.equals(ExpTitle))
			 {
				 child1.log(LogStatus.PASS, "Page title validated");
			 }
			 else
				 child1.log(LogStatus.FAIL, "Page title validation failed because expected title was : " +ExpTitle +"and actual was :" +Actualtitle );		
			
	}
		
		@Test(priority=2,enabled=true, description="Adding to the cart")
		public void addcart()
		{
			
			child2 = _extent_report.startTest("Adding to the cart");
			
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("java 8 books");
			
					
					driver.findElement(By.xpath("//input[@value='Go']")).click();
				
					driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'][1])")).click();
					
					
					
					
					 WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
					addtocart.click();	
					
					driver.findElement(By.xpath("//button[@type='button']")).click();
					child2.log(LogStatus.PASS, "added to cart susscefully");
					
					
					 			
				
		}
				
		@Test(priority=3,enabled=true, description="Enter login details")
		public void login()
		{
			child3 = _extent_report.startTest("Enter login details");
			
			driver.findElement(By.xpath("//input[@id='ap_email_login']")).sendKeys("8099064073");
			
			driver.findElement(By.xpath("(//input[@id='continue'])[2]")).click();
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sanjay");
			
			driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
			
			//div[@class='a-container']/h1
			String s1="Select a delivery address";

			
			
			
String s=driver.findElement(By.xpath("//div[@class='a-container']/h1")).getText();

if(s.equals(s))
{
	child3.log(LogStatus.PASS, "Login succesfull");
		}
		}
		
		
		@AfterTest
		public void teardown()
		{
		
			_test_logger
		    .appendChild(child1).appendChild(child2).appendChild(child3);

			_extent_report.endTest(_test_logger);
			_extent_report.flush(); 

		}
		
			
	}
		
		

