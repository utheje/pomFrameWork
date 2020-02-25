package com.uthej.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.uthej.base.testbase;

public class ReviewPageTripAdvisor extends testbase {
	
    @FindBy (xpath= "//*[@id='bubble_rating']")
	WebElement overallrating;
    
    @FindBy(className = "ui_bubble_rating fl bubble_30")
    WebElement ratingverify;
	
	@FindBy (id="ReviewTitle")
	WebElement ReviewTitle;
	
	@FindBy(xpath ="//div[@data-category='familyYoungChildren']")
	WebElement sort;
	
	@FindBy (id="ReviewText")
	WebElement  ReviewText;
	
	@FindBy(xpath = "//select[@name='trip_date_month_year']")
	WebElement dropdown;
	
	@FindBy (id="qid12_bubbles")
	WebElement servicebubble;
	
	@FindBy(id="qid13_bubbles")
	WebElement valueBubble;
	
	@FindBy(id="qid190_bubbles")
	WebElement sleepQuality;
	
	@FindBy(id="noFraud")
	WebElement checkbox;
	
	@FindBy(id="SUBMIT")
	WebElement submit;
	
	
	

	
	public ReviewPageTripAdvisor() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement hoverbubble() {
		
		Actions action = new Actions(driver);
		action.moveToElement(overallrating).build().perform();
		overallrating.click();
		return ratingverify;
	}
	
	public void ReviewTitle(String title) {
		ReviewTitle.sendKeys(title);	
	}
	
	public void ReviewText(String text) {
		ReviewText.sendKeys(text);	
		sort.click();
	}
	
	public void selectMonth(String month) {
		
		
		Select select = new Select(dropdown);
		select.selectByValue(month);
	}
	
	public void servicebubble() {
		
		Actions action = new Actions(driver);
		action.moveToElement(servicebubble).build().perform();
		servicebubble.click();		
	}
	
		
	public void sleepQuality() {
		
		Actions action = new Actions(driver);
		action.moveToElement(sleepQuality).build().perform();
		sleepQuality.click();		
	}
	
public void valueBubble() {
		
		Actions action = new Actions(driver);
		action.moveToElement(valueBubble).build().perform();
		valueBubble.click();		
	}
	public void submit() {
		checkbox.click();
		submit.click();
		
	}
}
