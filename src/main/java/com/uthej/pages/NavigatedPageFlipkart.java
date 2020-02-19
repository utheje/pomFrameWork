package com.uthej.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uthej.base.testbase;

public class NavigatedPageFlipkart extends testbase {

	@FindBy(xpath ="//*[@class='_1vC4OE _2rQ-NK']")
	WebElement price;
	
	public NavigatedPageFlipkart() {
		PageFactory.initElements(driver, this);
	
	}
	
	public String iphone() {
		String pri = price.getText();
		System.out.println(pri);
		return pri;
	}
}
