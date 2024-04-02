package com.cjc.webapp.DemoBlaze.page;  //17.01.2023 Frame Work Designing

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.webapp.DemoBlaze.Utility.CommonUtility;


public class DemoBlaze4PlaceOrder {
	//This is KEYWORD DRIVEN FRAMEWORK IN DEMO BLAZE WEBSITE.
	// TestNG Keyword Driven Framework Script Created By The Harshit Bisen TB-18B Offline.
	WebDriver driver;
	Properties ps = new Properties();
	static Logger log = Logger.getLogger(DemoBlaze4PlaceOrder.class.getName());
	
	@FindBy(css = "[class='btn btn-success']")
	WebElement placeOrderClick1;
	
	@FindBy(css = "[id='name']")
	WebElement placeOrderName;
	
	@FindBy(css = "[id='country']")
	WebElement placeOrderCountry;
	
	@FindBy(css = "[id='city']")
	WebElement placeOrderCity;
	
	@FindBy(css = "[id='card']")
	WebElement placeOrderCard;
	
	@FindBy(css = "[id='month']")
	WebElement placeOrderMonth;
	
	@FindBy(css = "[id='year']")
	WebElement placeOrderYear;
			
	@FindBy(css = "[onclick='purchaseOrder()']")
	WebElement purchaseClick;	
	
	@FindBy(css = "[class='lead text-muted ']")
	WebElement orderingDeatils;
	
	@FindBy(css = "[class='confirm btn btn-lg btn-primary']")
	WebElement lastOkayClick;
	
	public DemoBlaze4PlaceOrder(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DemoBlaze4PlaceOrderMethod() throws InterruptedException, IOException {
		
		String cv1 = CommonUtility.placeOrderName();
		String cv2 = CommonUtility.placeOrderCountry();
		String cv3 = CommonUtility.placeOrderCity();
		String cv4 = CommonUtility.placeOrderCreditCard();
		String cv5 = CommonUtility.placeOrderMonth();
		String cv6 = CommonUtility.placeOrderYear();
		
		placeOrderClick1.click();
		Thread.sleep(500);
		
		placeOrderName.sendKeys(cv1);
		Thread.sleep(500);
		
		placeOrderCountry.sendKeys(cv2);
		Thread.sleep(500);
		
		placeOrderCity.sendKeys(cv3);
		Thread.sleep(500);
		
		placeOrderCard.sendKeys(cv4);
		Thread.sleep(500);
		
		placeOrderMonth.sendKeys(cv5);
		Thread.sleep(500);
		
		placeOrderYear.sendKeys(cv6);
		Thread.sleep(500);
		
		purchaseClick.click();
		Thread.sleep(1000);
		
		String orderDetail = orderingDeatils.getText();
		System.out.println(orderDetail);
		Thread.sleep(300);
		
		lastOkayClick.click();
		
		log.info("Place The Order");
	}
}
