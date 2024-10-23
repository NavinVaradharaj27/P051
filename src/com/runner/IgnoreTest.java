package com.runner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	@BeforeMethod
	public void pageRefresh() {
		System.out.println("Page refreshed");
	}
	
	@Test(priority = 1)
	public void verifySearch() {
		System.out.println("Product search");
	}
	
	@Ignore
	@Test(priority = 2)
	public void verifySelectedProduct() {
		System.out.println("product selected");
	}
	
	@Test(priority = 3 , enabled = false)
	public void verifyPayment() {
		System.out.println("Payment done");
	}
	
	@Test
	public void captureScreenshot() throws IOException {
		System.out.println("Screenshot captured");
	}

}
