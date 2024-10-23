package com.runner;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public void pageRefresh() {
		System.out.println("Page refreshed");
	}
	
	@Test(dependsOnMethods = "pageRefresh")
	public void verifySearch() {
		System.out.println("Product search");
	}
	
	@Test(dependsOnMethods = "verifySearch")
	public void verifySelectedProduct() {
		System.out.println("product selected");
	}
	
	@Test(dependsOnMethods = "verifySelectedProduct")
	public void verifyPayment() {
		System.out.println("Payment done");
	}
	
	@Test(dependsOnMethods = "verifyPayment")
	public void captureScreenshot() {
		System.out.println("Screenshot captured");
	}


}
