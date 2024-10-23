package com.runner;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Test
	@Parameters({"user","pass"})
	public void verifyLogin(String username, String password) {
		
		System.out.println(username+"User name entered ");
		System.out.println(password+"Password entered");
		System.out.println("Login btn ");
	}

}
