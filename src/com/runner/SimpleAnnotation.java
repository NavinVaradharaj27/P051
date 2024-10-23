package com.runner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class SimpleAnnotation extends BaseClass{
	
	@BeforeSuite
	public void openBrowser() {
//		launchBrowser("chrome");
		System.out.println("browser launched");
	}
	
	@BeforeTest
	public void openUrl() {
//		launchUrl("https://www.facebook.com/");
		System.out.println("url launched");
	}

	@BeforeClass
	public void login() {
//		LoginPage loginPage = new LoginPage();
//		input(loginPage.username, "nvn");
//		input(loginPage.password,"1242134");
//		clickElement(loginPage.login_btn);
		System.out.println("Logged in");
	}
	
	@BeforeMethod
	public void pageRefresh() {
//		refresh();
		System.out.println("Page refreshed");
	}
	
	@Test(priority = 1)
	public void verifySearch() {
		System.out.println("Product search");
	}
	
	@Test(priority = 2)
	public void verifySelectedProduct() {
		System.out.println("product selected");
	}
	
	@Test(priority = 3)
	public void verifyPayment() {
		System.out.println("Payment done");
	}
	
	@AfterMethod
	public void captureScreenshot() throws IOException {
//		screenshot("scr1");
		System.out.println("Screenshot captured");
	}
	
	@AfterSuite
	public void quit() {
//		quitBrowser();
		System.out.println("Browser closed");
	}
	

}
