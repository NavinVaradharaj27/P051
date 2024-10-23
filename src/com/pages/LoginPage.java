package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	public WebElement username;
	
	@FindBy(id = "pass")
	public WebElement password;
	
	
	@FindBy(name = "login")
	public WebElement login_btn;
	
	
////	WebElement username = driver.findElement(By.xpath(""));
//	
//	
//	static WebDriver driver ;
//	public static void main(String[] args) {
//		
//		
//		WebElement username = driver.findElement(By.xpath(""));
////		username.sendKeys("");
//		input(username, "nvn");
//		
//		WebElement password = driver.findElement(By.xpath(""));
////		password.sendKeys("");
//		input(password, "12342435");
//		
//		WebElement login_btn = driver.findElement(By.xpath(""));
////		login_btn.click();
//		clickElement(login_btn);
//		
//		
//		
//	}

}
