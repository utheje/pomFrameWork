//author Uthej.E 
package com.uthej.testcases;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.uthej.pages.*;
import com.uthej.base.testbase;


public class IphoneSearch extends testbase{
	String priceIPhoneAmazon ;
	String priceIPhoneFlipkart;
	double priceFlipkart;
	double priceAmazon;
	HomePageAmazon  homepageamazon;
	NavigatedPageAmazon  navigatedpageamazon ;
	HomePageFlipkart homepageflipkart;
	NavigatedPageFlipkart navigatedpageflipkart;
	
	
	
	
	public IphoneSearch(){
		          
	}
	
	@BeforeTest
	public void setUp(){
		initialization();
		homepageamazon = new HomePageAmazon();
		navigatedpageamazon = new NavigatedPageAmazon();  
		
	
	}
	
	@Test(priority=1)
	public void homePageAmazon(){
		String title = homepageamazon.verifyHomePageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority=2)
	public void enterNameSearchBox() throws InterruptedException {
		homepageamazon.enterNameSearchBox(prop.getProperty("search"));
			}
	
	@Test(priority=3)
	public void clicksearchbutton(){
		homepageamazon.search();
	}
	
	@Test(priority=4)
	public void getPrice() throws Exception {
	navigatedpageamazon.iphone();
	priceIPhoneAmazon =  navigatedpageamazon.price();
	priceIPhoneAmazon= priceIPhoneAmazon.substring(2);
	priceAmazon = Double.parseDouble(priceIPhoneAmazon.replaceAll(",",""));
	System.out.println(priceAmazon);
	driver.quit();
	}

	@Test(priority=5)
	public void homePageFlipkart() {
		initialization();
		homepageflipkart = new HomePageFlipkart();
		navigatedpageflipkart  = new  NavigatedPageFlipkart();
		
		String title = homepageflipkart.verifyHomePageTitleFlipkart();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
	}
	
	@Test(priority=6)
	public void enterNameSearchBoxflipkart() throws InterruptedException  {
		homepageflipkart.enterNameSearchBox(prop.getProperty("search")); 
			}
	
	@Test(priority=7)
	public void clicksearchbuttonFlipkart(){
		homepageflipkart.search();
	}
	
	@Test(priority=8)
	public void priceflipkart() {
		priceIPhoneFlipkart = navigatedpageflipkart.iphone();
		priceIPhoneFlipkart = priceIPhoneFlipkart.substring(1);
		priceFlipkart =Double.parseDouble(priceIPhoneFlipkart.replaceAll(",",""));
		System.out.println(priceFlipkart);
		
	}
	
	@Test(priority=9)
	public void decider() {
		if(priceFlipkart>priceAmazon)
		{
			System.out.println("The Iphone Price is lesser in Amazon Rs"+priceAmazon+" than Flipkart Rs"+priceFlipkart);
		}
		else
		{
			System.out.println("The Iphone Price is lesser in Flipkart Website"+priceFlipkart+ "than Amazon Rs"+priceAmazon);
		}
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	
}



