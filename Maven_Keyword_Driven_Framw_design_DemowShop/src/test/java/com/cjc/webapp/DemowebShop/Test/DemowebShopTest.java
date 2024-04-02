package com.cjc.webapp.DemowebShop.Test;  

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cjc.webapp.DemowebShop.page.RegistrationPage;
import com.cjc.webapp.DemowebShop.page.LogoutPage;
import com.cjc.webapp.DemowebShop.page.LoginPage;
import com.cjc.webapp.DemowebShop.page.AddtoGiftCardPage;
import com.cjc.webapp.DemowebShop.page.AddtoCartBooksPage;
import com.cjc.webapp.DemowebShop.page.BillingAdressPage;

public class DemowebShopTest {

	WebDriver driver;
	static Logger log=Logger.getLogger(DemowebShopTest.class.getName());
	
	@BeforeSuite
	public void browserOpen() throws IOException {
		System.out.println("Welcome To TestNG Keyword Driven Framework");
		System.out.println("Demo Web Shop Keyword Driven Framework");
		System.setProperty("webdriver.chrome.driver", "src//test//resources//resources//BrowserExe//chromedriver.exe");
		System.out.println("Launch Browser");
		driver = new ChromeDriver();
	}
   
	 
	@BeforeTest
	public void urlPassing() {
		driver.get("https://demowebshop.tricentis.com/register");
		log.debug("Send URL to the browser By XML Parameter");
	}

	@BeforeClass
	public void maximize() {
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		log.info("Maximizing The Window");
	}

	@BeforeMethod
	public void addCookiees() {
		Set<Cookie> cook = driver.manage().getCookies();
		int cookiesLength = cook.size();
		log.info("Cookies Length Before = " + cookiesLength);
	}
 
	@Test(priority = 1)
	public void registerCheckTest() throws InterruptedException, IOException {
		RegistrationPage dm = PageFactory.initElements(driver, RegistrationPage.class);
		dm.registerCheckTest();
	}

	@Test(priority = 2)
	public void logoutCheckTest() throws InterruptedException {
		LogoutPage dm1 = PageFactory.initElements(driver, LogoutPage.class);
		dm1.logout();
	}

	@Test(priority = 3)
	public void loginCheckTest() throws InterruptedException, IOException {
		LoginPage dm2 = PageFactory.initElements(driver, LoginPage.class);
		dm2.loginCheck();
	}

	@Test(priority = 4)
	public void addToGiftCardCheckTest() throws InterruptedException, IOException {
		AddtoGiftCardPage dm3 = PageFactory.initElements(driver, AddtoGiftCardPage.class);
		dm3.addToCartGiftCard();
	}

	@Test(priority = 5)
	public void addToBookCheckTest() throws InterruptedException, IOException {
		AddtoCartBooksPage dm4 = PageFactory.initElements(driver, AddtoCartBooksPage.class);
		dm4.addToCartBooks();
	}

	@Test(priority = 6)
	public void billingAddressCheckTest() throws InterruptedException, IOException {
		BillingAdressPage dm5 = PageFactory.initElements(driver, BillingAdressPage.class);
		dm5.billingAdrress();
	}

	@AfterMethod
	public void captureScreen() throws IOException, InterruptedException {
		Thread.sleep(2000);
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src1, new File("src//test//resources//ScreenShot"));
		log.info("Screen Shot After Completion The Process");
	}

	@AfterClass
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
		log.info("Delete All Cookies");
	}

	@AfterTest
	public void dbclose() {
		log.info("Data Base Connection Close");
	}

	@AfterSuite
	public void browserClose() throws InterruptedException {
		Thread.sleep(3000);
		log.error("Carefully Browser Close");
		driver.close();
	}

}
