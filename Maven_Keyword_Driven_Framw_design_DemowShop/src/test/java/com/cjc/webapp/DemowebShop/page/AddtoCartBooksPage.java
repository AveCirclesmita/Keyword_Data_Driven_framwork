package com.cjc.webapp.DemowebShop.page;  //DemowebShop5 17.01.2023 KDF Framework Designing

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.cjc.webapp.DemowebShop.Utility.CommonUtility;


public class AddtoCartBooksPage {
			WebDriver driver;
				static Logger log = Logger.getLogger(AddtoCartBooksPage.class.getName());
				
				@FindBy(css = "input[id='small-searchterms']")
				WebElement searchBooks;
				@FindBy(css = "input[class='button-1 search-box-button']")
				WebElement searchButton;
				@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input")
				WebElement addtocartbook;
				@FindBy(xpath = "//*[@id='topcartlink']/a/span[1]")
				WebElement shoppingcart;
				@FindBy(css = "select#CountryId")
				WebElement country1;
//				@FindBy(xpath = "//input[@name='removefromcart']")
//				WebElement removeproduct;
				@FindBy(xpath = "//input[@name='termsofservice']")
				WebElement termsandcondition;
				@FindBy(xpath = "//button[@id='checkout']")
				WebElement checkout;

				public AddtoCartBooksPage(WebDriver driver) throws IOException{
					this.driver = driver;
				}

				public void addToCartBooks() throws InterruptedException, IOException {
					
					String cv1 = CommonUtility.addToBookInCart();
					
					Thread.sleep(500);
					searchBooks.sendKeys(cv1);
					Thread.sleep(500);
					searchButton.click();
					Thread.sleep(500);
					addtocartbook.click();
					Thread.sleep(500);
					shoppingcart.click();
					Thread.sleep(500);
					WebElement ddc = country1;
					Select select = new Select(ddc);
					select.selectByIndex(2);
//					removeproduct.click();
					Thread.sleep(500);
					termsandcondition.click();
					Thread.sleep(500);
					checkout.click();
					log.info("Add To Cart Book Is Succesfull");
				}
}
