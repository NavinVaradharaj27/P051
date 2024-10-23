package com.runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "getData")
	public void verifyLogin(String username, String password) {
		
		System.out.println(username+"User name entered ");
		System.out.println(password+"Password entered");
		System.out.println("Login btn ");
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = {{"nvn@123","12345"},{"kmr@123","rweqwtr"}};
		return data;
	}

}
