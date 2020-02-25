package com.uthej.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uthej.base.testbase;

public class NavigatedPageTripAdvisor extends testbase{

	@FindBy (xpath ="//div[@class='result-title'][1]")
	WebElement firstoption;
	
	@FindBy (xpath = "//a[contains(.,'Write a review')]")
	WebElement writeareview;
	
	
	public NavigatedPageTripAdvisor() {
		PageFactory.initElements(driver, this);
	
	}
	public WebElement selectfirstoption() {
		firstoption.click();
		return writeareview;
	}
	
	public void writereview() {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click();", writeareview);
	}
	
	
}
