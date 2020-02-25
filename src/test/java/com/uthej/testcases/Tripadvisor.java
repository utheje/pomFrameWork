//author Uthej.E 
package com.uthej.testcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.uthej.base.testbase;
import com.uthej.pages.HomePageTripAdvisor;
import com.uthej.pages.NavigatedPageTripAdvisor;
import com.uthej.pages.ReviewPageTripAdvisor;

public class Tripadvisor extends testbase{

	 HomePageTripAdvisor homepagetripadvisor;
	 NavigatedPageTripAdvisor navigatedpagetripadvisor;
	 ReviewPageTripAdvisor reviewpagetripadvisor;
	 
	@BeforeTest
	public void setUp(){
		initialization();
		homepagetripadvisor = new HomePageTripAdvisor();
		navigatedpagetripadvisor = new NavigatedPageTripAdvisor();  
		reviewpagetripadvisor = new ReviewPageTripAdvisor();
		
	
	}
	
	@Test(priority=1)
	public void homepageTripAdvisor(){
		String title =  homepagetripadvisor.VerifyPageTitleTripAdvisor();
		title = title.substring(0,25);
		Assert.assertEquals(title,"Tripadvisor Official Site");
	}
	
	@Test(priority=2)
	public void enterNameSearchBox() throws InterruptedException {

		WebElement option= 	homepagetripadvisor.search(prop.getProperty("searchtrip"));
	    assert option.isDisplayed();
			}
	
    @Test(priority=3)
    public void navigatefirst() throws InterruptedException {
    	WebElement review = navigatedpagetripadvisor.selectfirstoption();
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
    	assert review.isDisplayed();
    }
	
    @Test(priority=4)
    public void Review() {
    	navigatedpagetripadvisor.writereview();
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
    }
    
    @Test(priority=5)
    public void rating() {
     reviewpagetripadvisor.hoverbubble();
    	
    }
    
    @Test(priority=6)
    public void title() {
    
    	reviewpagetripadvisor.ReviewTitle(prop.getProperty("title"));
    	reviewpagetripadvisor.ReviewText(prop.getProperty("review"));
    	reviewpagetripadvisor.selectMonth(prop.getProperty("month"));
    }
    
    @Test(priority=7)
    public void hotelrating() throws InterruptedException {
    	reviewpagetripadvisor.servicebubble();
    	
    	
    }
    
    @Test(priority=8)
    public void submit() {
    	reviewpagetripadvisor.submit();
    }
    
    
	
//	@AfterTest
//	public void tearDown(){
//		driver.quit();
//	}
}
