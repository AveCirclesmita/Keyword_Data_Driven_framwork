package com.cjc.webapp.DemoBlaze.Utility;   //17.01.2023

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class CommonUtility {

	
	public static WebDriver driver;
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow ro;
	public static XSSFCell cl;

	public static FileInputStream filenalCall() throws FileNotFoundException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		return fi;
	}
//****************************************Sign*Up*******************************************************
	public static String signUpUsername() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(0);
		String signupusern = cl.getStringCellValue();
		return signupusern;
	}

	public static String signUpPassword() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(1);
		String signupPass = cl.getStringCellValue();
		return signupPass;
	}
//*****************************************Login*Details************************************************
	public static String loginUsername() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet2");
		ro = sh.getRow(1);
		cl = ro.getCell(0);
		String loginusern = cl.getStringCellValue();
		return loginusern;
	}

	public static String loginPassword() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet2");
		ro = sh.getRow(1);
		cl = ro.getCell(1);
		String loginPass = cl.getStringCellValue();
		return loginPass;
	}
//************************************Place*Order*******************************************************
	public static String placeOrderName() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet3");
		ro = sh.getRow(1);
		cl = ro.getCell(0);
		String name = cl.getStringCellValue();
		return name;
	}

	public static String placeOrderCountry() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet3");
		ro = sh.getRow(1);
		cl = ro.getCell(1);
		String country = cl.getStringCellValue();
		return country;
	}

	public static String placeOrderCity() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet3");
		ro = sh.getRow(1);
		cl = ro.getCell(2);
		String city = cl.getStringCellValue();
		return city;
	}

	public static String placeOrderCreditCard() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet3");
		ro = sh.getRow(1);
		cl = ro.getCell(3);
		String creditCard = cl.getStringCellValue();
		return creditCard;
	}

	public static String placeOrderMonth() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet3");
		ro = sh.getRow(1);
		cl = ro.getCell(4);
		String month = cl.getStringCellValue();
		return month;
	}

	public static String placeOrderYear() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoBlaze.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet3");
		ro = sh.getRow(1);
		cl = ro.getCell(5);
		String year = cl.getStringCellValue();
		return year;
	}
//******************************************************************************************************
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
