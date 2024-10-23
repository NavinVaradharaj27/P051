package com.runner;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(priority = 1)
	public void verifySearch() {
		System.out.println("Product search");
	}
	
	
	@Test(priority = 2 , invocationCount = 5)
	public void verifySelectedProduct() {
		System.out.println("product selected");
	}
	
	@Test(priority = 3 )
	public void verifyPayment() {
		System.out.println("Payment done");
	}

}
