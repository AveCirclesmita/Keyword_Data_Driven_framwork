package com.cjc.webapp.DemoBlaze.page;    //17.01.2023 Frame Work Designing
 
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.cjc.webapp.DemoBlaze.Utility.CommonUtility;

public class DemoBlaze2Login {
	//This is KEYWORD DRIVEN FRAMEWORK IN DEMO BLAZE WEBSITE.
	// TestNG Keyword Driven Framework Script Created By The Harshit Bisen TB-18B Offline.
	WebDriver driver;
	static Logger log = Logger.getLogger(DemoBlaze2Login.class.getName());
	@FindBy(css = "[id='login2']")
	WebElement loginClick1;
	
	@FindBy(css = "[id='loginusername']")
	WebElement usernameLogin;
	
	@FindBy(css = "[id='loginpassword']")
	WebElement passowrdLogin;

	@FindBy(css = "button[onclick='logIn()']")
	@CacheLookup
	WebElement loginClick2;
	
	public DemoBlaze2Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DemoBlaze2LoginMethod() throws InterruptedException, IOException {
		
		String cv1 = CommonUtility.loginUsername();
		String cv2 = CommonUtility.loginPassword();
		System.out.println(cv1);
		System.out.println(cv2);
		
		loginClick1.click();
		Thread.sleep(500);
		
		usernameLogin.sendKeys(cv1);
        Thread.sleep(500);
        
        passowrdLogin.sendKeys(cv2);
        Thread.sleep(500);
        
        loginClick2.click();
        Thread.sleep(1000);
        
        log.info("User Login");
	}
}
