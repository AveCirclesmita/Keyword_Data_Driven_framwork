package com.cjc.webapp.DemowebShop.Utility;  //17.01.2023 KDF Framework

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

	public static FileInputStream filenalCall() throws FileNotFoundException
	{
		fi = new FileInputStream("src//test//resources//resources//Datapass Excel//DemoWebShop.xlsx");
		return fi;
	}

	public static String firstName() throws IOException {
		fi = new FileInputStream("src//test//resources//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(0);
		String fname = cl.getStringCellValue();
		return fname;
	}

	public static String lastName() throws IOException {
		fi = new FileInputStream("src//test//resources//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(1);
		String lname = cl.getStringCellValue();
		return lname;
	}
	
	public static String email() throws IOException {
		fi = new FileInputStream("src//test//resources//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(2);
		String em = cl.getStringCellValue();
		return em;
	}
	
	public static String password() throws IOException {
		fi = new FileInputStream("src//test//resources//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(3);
		String pass = cl.getStringCellValue();
		return pass;
	}
	
	public static String confirmPassword() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		ro = sh.getRow(1);
		cl = ro.getCell(4);
		String cpass = cl.getStringCellValue();
		return cpass;
	}
//********************************************Login******************************************************
	
	public static String loginEmail() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet2");
		ro = sh.getRow(1);
		cl = ro.getCell(0);
		String logEmail = cl.getStringCellValue();
		return logEmail;
	}
	
	
	public static String loginPassword() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet2");
		ro = sh.getRow(1);
		cl = ro.getCell(1);
		String logPass = cl.getStringCellValue();
		return logPass;
	}
	
//******************************Add*To*Cart*Recipient*Details*******************************************	
	
	public static String recepientName() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet3");
		ro = sh.getRow(1);
		cl = ro.getCell(0);
		String reciName = cl.getStringCellValue();
		return reciName;
	}
	
	public static String recepientEmail() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet3");
		ro = sh.getRow(1);
		cl = ro.getCell(1);
		String reciEmail = cl.getStringCellValue();
		return reciEmail;
	}
//*************************************Add*To*Book******************************************************	
	
	public static String addToBookInCart() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet4");
		ro = sh.getRow(1);
		cl = ro.getCell(0);
		String bookNam = cl.getStringCellValue();
		return bookNam;
	}
	
//*********************************Billing*Address******************************************************	
	
	public static String billingCompanyName() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet5");
		ro = sh.getRow(1);
		cl = ro.getCell(0);
		String cname = cl.getStringCellValue();
		return cname;
	}
	
	public static String billingCityName() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet5");
		ro = sh.getRow(1);
		cl = ro.getCell(1);
		String ciname = cl.getStringCellValue();
		return ciname;
	}
	
	public static String billingAddressOne() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet5");
		ro = sh.getRow(1);
		cl = ro.getCell(2);
		String addr1 = cl.getStringCellValue();
		return addr1;
	}
	
	public static String billingAddressTwo() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet5");
		ro = sh.getRow(1);
		cl = ro.getCell(3);
		String addr2 = cl.getStringCellValue();
		return addr2;
	}
	
	public static String billingPostalCode() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet5");
		ro = sh.getRow(1);
		cl = ro.getCell(4);
		String postCode = cl.getStringCellValue();
		return postCode;
	}
	
	public static String billingPhoneNumber() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet5");
		ro = sh.getRow(1);
		cl = ro.getCell(5);
		String phoneno = cl.getStringCellValue();
		return phoneno;
	}
	
	public static String billingFaxNumber() throws IOException {
		fi = new FileInputStream("src//test//resources//Datapass Excel//DemoWebShop.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet5");
		ro = sh.getRow(1);
		cl = ro.getCell(6);
		String faxno = cl.getStringCellValue();
		return faxno;
	}
//******************************************************************************************************	
}
