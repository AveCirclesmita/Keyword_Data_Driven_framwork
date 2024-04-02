package com.cjc.webapp.DemoBlaze.Test;  //17.01.2023

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

import com.cjc.webapp.DemoBlaze.page.DemoBlaze1Signup;
import com.cjc.webapp.DemoBlaze.page.DemoBlaze2Login;
import com.cjc.webapp.DemoBlaze.page.DemoBlaze3AddToCart;
import com.cjc.webapp.DemoBlaze.page.DemoBlaze4PlaceOrder;

public class DemoBlazeTest {
     
	WebDriver driver;
	static Logger log = Logger.getLogger(DemoBlazeTest.class.getName());
	
	@BeforeSuite
	public void browserOpen() throws IOException {
		System.out.println("Welcome To TestNG");
		System.out.println("Demo Blaze Shop Complete Product Purchase");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Chrome Exe/chromedriver.exe");
		System.out.println("Launch Browser");
		driver = new ChromeDriver();
	}

	@BeforeTest
	public void urlPassing() {
		driver.get("https://www.demoblaze.com/index.html");
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
    //Data Pass By The Excel Sheet
	@Test(priority = 1)
	public void demoBlazeSignUpTest() throws InterruptedException, IOException {
		DemoBlaze1Signup dm = PageFactory.initElements(driver, DemoBlaze1Signup.class);
		dm.DemoBlaze1SignupMethod();
	}
	//Data Pass By The Lazy Loading
	@Test(priority = 2)
	public void demoBlazeLoginTest() throws InterruptedException, IOException {
		DemoBlaze2Login dm1 = PageFactory.initElements(driver, DemoBlaze2Login.class);
		dm1.DemoBlaze2LoginMethod();
	}
	@Test(priority = 3)
	public void demoBlazeAddToCartTest() throws InterruptedException, IOException {
		DemoBlaze3AddToCart dm2 = PageFactory.initElements(driver, DemoBlaze3AddToCart.class);
		dm2.DemoBlaze3AddToCartMethod();
	}
	@Test(priority = 4)
	public void demoBlazePlaceOrderTest() throws InterruptedException, IOException {
		DemoBlaze4PlaceOrder dm3 = PageFactory.initElements(driver, DemoBlaze4PlaceOrder.class);
		dm3.DemoBlaze4PlaceOrderMethod();
	}

	@AfterMethod
	public void captureScreen() throws IOException, InterruptedException {
		Thread.sleep(2000);
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src1, new File("src//test//resources//Screenshot"));
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
