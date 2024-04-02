package com.cjc.webapp.DemowebShop.page; //DemowebShop2 17.01.2023 KDF Framework Design

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogoutPage {
	
	
		WebDriver driver;
		static Logger log = Logger.getLogger(LogoutPage.class.getName());

		@FindBy(xpath = "//a[@class='ico-logout']")
		WebElement logout;

		public LogoutPage(WebDriver driver) {
			this.driver = driver;
		}

		public void logout() throws InterruptedException {
			Thread.sleep(1500);
			logout.click();
			log.info("Logout Check Is Successful");
		}
}
