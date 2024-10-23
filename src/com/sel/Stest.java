package com.sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Stest {
	static WebDriver driver;
	
	
	public void openBrowser(String url) {
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\Avadi\\workspace\\P051\\Screenshots\\"+name+".png");
		FileHandler.copy(src, des);
		String s = "java";
		System.out.println("Name is "+s);
	}
	
	public static void main(String[] args) throws IOException {
		 Stest s = new Stest();
		s.openBrowser("https://www.facebook.com/");
		s.screenshot("scr1");
		
		s.openBrowser("https://www.amazon.in/");
		s.screenshot("scr2");
		
		
		
	}
}
