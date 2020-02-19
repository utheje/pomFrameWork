package com.uthej.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uthej.base.testbase;

public class NavigatedPageAmazon extends testbase{

	@FindBy(xpath = "//*[@class='a-size-medium a-color-base a-text-normal' and contains(.,'Apple iPhone XR (64GB) - Yellow')][1]")  
	WebElement iphone64a;
	
	@FindBy(id="priceblock_ourprice" )
	WebElement pricea;
	
	
	public NavigatedPageAmazon() {
		PageFactory.initElements(driver, this);
	
	}
	
	public void iphone() throws Exception {
		iphone64a.click();
	}
		
	public String price() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String priceIphonea = pricea.getText();
		return priceIphonea;
	}
}
