package com.Qalegendproject.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilities {
	
	

public WebDriver driver;
	
	public WaitUtilities(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public WebElement waitForElementTobeVisible(WebDriver driver, WebElement elementToBeLoaded, int Time) {
	WebDriverWait wait = new WebDriverWait(driver,Time);
	WebElement element =wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	return element;	
	}
	

	public WebElement waitForElementTobeClickable(WebDriver driver, WebElement elementToBeLoaded, int Time) {
	WebDriverWait wait = new WebDriverWait(driver,Time);
	WebElement element =wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
	return element;	
	}

}
