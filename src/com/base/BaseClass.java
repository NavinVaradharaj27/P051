package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser(String browserType) {
		
		if(browserType.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else if(browserType.equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		} 
		
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	//getTitle
	
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\Avadi\\workspace\\P051\\Screenshots\\"+name+".png");
		FileHandler.copy(src, des);
	}
	
	public static void clickElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public static void input(WebElement element, String input) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(input);
	}
	
	
	/*
	 * public static void dropdownByIndex(WebElement element, int index) { Select s
	 * = new Select(element); s.selectByIndex(index); }
	 */
	
	public static void dropdownByText(WebElement element,String option, String value) {
		Select s = new Select(element);
		if(option.equals("text")) {
			s.selectByVisibleText(value);
		}else if(option.equals("value")) {
			s.selectByValue(value);
		}else if(option.equals("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
		
//		int a = 10;
//		String s1 = ""+a;
//		
//		String s2 = "200";
//		int num = Integer.parseInt(s2);
		
	}
	
//	public static void dropdownByValue(WebElement element, String value) {
//		Select s = new Select(element);
//		s.selectByValue(value);
//	}
//	
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public static void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
//JavaScriptExecutor
//	1.Scroll
//	2.click
//	3.input
//	4.SimpleAlert & Confirm Alert
	
	public static void mouseHover(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public static void switchFrameUsingIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void switchFrameUsingElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void switchFrameUsingNameOrID(String nameOrID) {
		driver.switchTo().frame(nameOrID);
	}
	
	public static void switchWindow(String title) {
		Set<String> windowHandles = driver.getWindowHandles();
		for(String id : windowHandles) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals(title)) {
				break;
			}	
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		launchBrowser("edge");
		launchUrl("https://www.amazon.in/");
		screenshot("amz");
		
		WebElement dropdown_month = driver.findElement(By.id("month"));
		dropdownByText(dropdown_month, "value", "3");
		
		
		WebElement dropdown_date = driver.findElement(By.id("date"));
		dropdownByText(dropdown_date, "index", "3");
		
		
		
		
		
		
		
		WebElement usrname = driver.findElement(By.xpath(""));
		input(usrname,"nvn@gmail");
		WebElement pass = driver.findElement(By.xpath(""));
		input(pass,"1234245");
		
		WebElement login_btn = driver.findElement(By.xpath(null));
		clickElement(login_btn);
		
		
		quitBrowser();
		
		launchBrowser("Chrome");
		launchUrl("https://www.facebook.com/");
		screenshot("fb");
		
	}

}
