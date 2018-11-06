package com.appium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appium.base.TestBase;

public class HomePage extends TestBase {

	
	//*[@id="twotabsearchtextbox"]	@FindBy(xpath = "//*[@id='nav-search-keywords']")
	
	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	public WebElement searchbar;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
}
