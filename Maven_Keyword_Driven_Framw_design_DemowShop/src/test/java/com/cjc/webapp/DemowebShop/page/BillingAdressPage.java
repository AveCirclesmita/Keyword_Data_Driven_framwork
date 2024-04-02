package com.cjc.webapp.DemowebShop.page;  


import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.cjc.webapp.DemowebShop.Utility.CommonUtility;


public class BillingAdressPage {
	WebDriver driver;
		Properties ps = new Properties();
		static Logger log = Logger.getLogger(BillingAdressPage.class.getName());

		@FindBy(xpath = "//input[@id='BillingNewAddress_Company']")
		WebElement companyname;
		@FindBy(xpath = "//select[@name='BillingNewAddress.CountryId']")
		WebElement country;
		@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
		WebElement city;
		@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
		WebElement address1;
		@FindBy(xpath = "//input[@id='BillingNewAddress_Address2']")
		WebElement address2;
		@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
		WebElement zipcode;
		@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
		WebElement phoneno;
		@FindBy(xpath = "//input[@name='BillingNewAddress.FaxNumber']")
		WebElement faxno;
		@FindBy(xpath = "//input[@title='Continue']")
		WebElement continues;
		@FindBy(css = "#PickUpInStore")
		WebElement pickupinstore;
		@FindBy(css = "#shipping-buttons-container > input")
		WebElement con;
		@FindBy(xpath = "//*[@id='payment-method-buttons-container']/input")
		WebElement continue1;
		@FindBy(xpath = "//*[@id='payment-info-buttons-container']/input ")
		WebElement continue2;
		@FindBy(xpath = "//*[@id='confirm-order-buttons-container']/input")
		WebElement confirm;
		@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")
		WebElement ordernumber;
		@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
		WebElement continue3;

		public BillingAdressPage(WebDriver driver)throws IOException {
			this.driver = driver;
		}

		public void billingAdrress() throws InterruptedException, IOException {

			String cv1 = CommonUtility.billingCompanyName();
			String cv2 = CommonUtility.billingCityName();
			String cv3 = CommonUtility.billingAddressOne();
			String cv4 = CommonUtility.billingAddressTwo();
			String cv5 = CommonUtility.billingPostalCode();
			String cv6 = CommonUtility.billingPhoneNumber();
			String cv7 = CommonUtility.billingFaxNumber();
			
			Thread.sleep(500);
			companyname.sendKeys(cv1);
			Thread.sleep(500);
			WebElement ddc = country;
			Select select = new Select(ddc);
			select.selectByIndex(25);
			Thread.sleep(500);
			city.sendKeys(cv2);
			Thread.sleep(500);
			address1.sendKeys(cv3);
			Thread.sleep(500);
			address2.sendKeys(cv4);
			Thread.sleep(500);
			zipcode.sendKeys(cv5);
			Thread.sleep(500);
			phoneno.sendKeys(cv6);
			Thread.sleep(500);
			faxno.sendKeys(cv7);
			Thread.sleep(500);
			continues.click();
			Thread.sleep(1500);
			pickupinstore.click();
			Thread.sleep(500);
			con.click();
			Thread.sleep(500);
			continue1.click();
			Thread.sleep(500);
			continue2.click();
			Thread.sleep(500);
			confirm.click();
			Thread.sleep(1500);
			WebElement oc = ordernumber;
			String s1 = oc.getText();
			log.info(s1);
			continue3.click();
			Thread.sleep(500);
			log.warn("Please Make Billing & Payment Carefully");
		}
}
