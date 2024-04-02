package com.cjcwebapp.Magento.page;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjcwebapp.Magento.Utility.CommonUtility;


public class Address_Details
{
     WebDriver driver;
     static Logger log=Logger.getLogger(Address_Details.class);
     
     public Address_Details(WebDriver driver)
     {
    	 this.driver=driver;
     }
    
	 
     @FindBy(css ="input[name='company']")
     @CacheLookup 
     WebElement Add_comp;
     
     @FindBy(css = "input[name='street[0]']")
    // @FindBy(css="#XIVIX3Y")
     WebElement Add_Street_Address;
     
     @FindBy(xpath  ="/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")
     WebElement city;
     
     @FindBy(css = "select[name='region_id'] > option[value='553']")
     WebElement State;
     
     @FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input")
     WebElement Zip;
     
     @FindBy(css = "select[name='country_id'] > option[value=\"IN\"]")
     WebElement Country;
     
     @FindBy(css =  "input[name='telephone']")
     WebElement Phone_Number;
     
     @CacheLookup
     @FindBy(css =  "#shipping-method-buttons-container > div > button")
     WebElement Shipping;
     
     @CacheLookup
     @FindBy(xpath = "//div[@id='checkout-payment-method-load']/div/div/div[2]/div[2]/div[4]/div/button")
     WebElement continious;
//   
//     @FindBy(xpath ="//main[@id=\"maincontent\"]/div[3]/div/div[2]/p[1]/text()[1]")
//     WebElement order_no;
//     
     public void Address_Details_Method() throws InterruptedException, IOException 
     {
    	 CommonUtility.registerData();
    	 
    	 String cmpan=CommonUtility.CompanyName;
    	 String add1=CommonUtility.Adress1;
    	 String city1=CommonUtility.City;
    	 String zip1= CommonUtility.Zipcode;
    	 String pho=CommonUtility.PhoneNo;
    	 
    	 
    	Thread.sleep(1000);
    	 Add_comp.sendKeys(cmpan);
 
    	 Thread.sleep(1000);
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
 		 js.executeScript("scrollBy(0,100)"); //Scrolldown method
 		
 		 Thread.sleep(1500);
    	 Country.click();
    	 
    	 Thread.sleep(1000);
    	 State.click();
    	 
    	 Thread.sleep(1000);
    	 Add_Street_Address.sendKeys(add1);
    	 
    	 Thread.sleep(1000);
    	 city.sendKeys(city1);
    	
    	 Thread.sleep(1000);
    	 Zip.sendKeys(zip1);
    	
    	 Thread.sleep(1000);
    	 Phone_Number.sendKeys(pho);
    	 
    	 Thread.sleep(1000);
    	 Shipping.click();
    	 //Button is working but Test is fail
//    	  Thread.sleep(1000);
//    	 continious.click();
//    	 String ordnum = order_no.getText();
//		  log.info(ordnum);
   	 
    	 
    	
    	 
     }
}
