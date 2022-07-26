package com.Qalegendproject.Utilities;



import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {
	
WebDriver driver;
	
	public PageUtilities(WebDriver driver) {
		this.driver=driver;
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
	

	public Alert waitForAlert(WebDriver driver, int Time) {
	WebDriverWait wait = new WebDriverWait(driver,Time);
	Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	return alert;	
	}
	

	public void hitenter(WebDriver driver, WebElement element) {
	element.sendKeys(Keys.ENTER);	
	}
	

	public void sendTestUsingMouseAction(WebDriver driver, WebElement element, String text) {
	Actions action = new Actions(driver);
	action.sendKeys(element,text).build().perform();
	

	}
	

	public void moveToElement(WebDriver driver, WebElement element) {
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	

	}
	

	

	public void contextClick(WebDriver driver, WebElement element) {
	Actions action = new Actions(driver);
	action.moveToElement(element);
	action.contextClick().build().perform();
	

	}
	

	public void doubleClick(WebDriver driver, WebElement element) {
	Actions action = new Actions(driver);
	action.moveToElement(element);
	action.doubleClick();
	

	}
	

	public void sleep(long time) throws InterruptedException{
	Thread.sleep(time);
	

	}
	

}