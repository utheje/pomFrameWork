package com.uthej.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.uthej.base.testbase;

public class HomePageFlipkart extends testbase{

	@FindBy(className ="LM6RPg")  
	WebElement searchboxf;
	
	@FindBy(className ="vh79eN" )
	WebElement searchbuttonf;
	
	@FindBy(xpath = "//*[@class='_2AkmmA _29YdH8']")
	WebElement crossbutton;
	
		
	// Initializing the Page Objects:
		public HomePageFlipkart() {
			PageFactory.initElements(driver, this);
			driver.get(prop.getProperty("urlflipkart"));
		}
		
		public String verifyHomePageTitleFlipkart(){
			return driver.getTitle();
		}
		
		
		public void enterNameSearchBox(String searchitem) throws InterruptedException {
			Actions action = new Actions(driver);
			action.moveToElement(searchboxf).build().perform();
			searchboxf.sendKeys(searchitem);
			
			}
		
	
		public void search() {
			try {
			searchbuttonf.click();
			}
			catch(Exception e)
			{
				crossbutton.click();
			}
			searchbuttonf.click();
		}
}
