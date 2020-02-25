package com.uthej.pages;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uthej.base.testbase;

public class HomePageTripAdvisor extends testbase {

	@FindBy(xpath = "//input[@title='Search']")
	WebElement searcht ;
	
	@FindBy (xpath ="//div[@class='result-title'][1]")
	WebElement firstoption;
	
	public HomePageTripAdvisor() {
		
		PageFactory.initElements(driver, this);
		driver.get(prop.getProperty("urltripadvisor"));
	}

	public String VerifyPageTitleTripAdvisor() {
		return driver.getTitle();
	}
	
	
	public WebElement search(String search )
	{
		searcht.sendKeys(search);
		searcht.sendKeys(Keys.ENTER);
		return firstoption;
		
		
	}
	
	
}
