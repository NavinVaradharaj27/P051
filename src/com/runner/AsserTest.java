package com.runner;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserTest {
	
	
	@Test
	public void getName(String name) {
//		String res = element.getText();
		String res = "navin";
		Assert.assertEquals(res, name);
		
		System.out.println(name);
	}
	
	@Test
	public void getName1() {
//		String res = element.getText();
		String res = "navin";

		SoftAssert a = new SoftAssert();
		System.out.println("qwerty");
		a.assertAll();
	}

}
