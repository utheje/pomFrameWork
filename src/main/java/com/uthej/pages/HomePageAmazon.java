package com.uthej.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.uthej.base.testbase;

public class HomePageAmazon extends testbase {

	@FindBy(id="twotabsearchtextbox")  
	WebElement searchboxa;
	
	@FindBy(xpath ="//div[2]/div/input[@class='nav-input']" )
	WebElement searchbuttona;
	

		
	// Initializing the Page Objects:
		public HomePageAmazon() {
			PageFactory.initElements(driver, this);
			driver.get(prop.getProperty("urlamazon"));
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		
		public void enterNameSearchBox(String searchitem) throws InterruptedException {
			Actions action = new Actions(driver);
			action.moveToElement(searchboxa).build().perform();
			searchboxa.sendKeys(searchitem);
			
			}
		
	
		public void search() {
		
			   searchbuttona.click();
			
			
		}
}
