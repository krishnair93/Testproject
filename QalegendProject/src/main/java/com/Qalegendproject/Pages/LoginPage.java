package com.Qalegendproject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Qalegendproject.Utilities.PageUtilities;
import com.Qalegendproject.Utilities.WaitUtilities;

public class LoginPage {
	public WebDriver driver;
	PageUtilities obj;
	WaitUtilities objj;
	@FindBy(xpath = "//input[@name ='username']")

	WebElement username;

	@FindBy(xpath = "//input[@name ='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name ='submit']")
	WebElement login;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

		obj = new PageUtilities(driver);
		objj = new WaitUtilities(driver);
	}

	public void setUserName(String strUserName) {

		username.sendKeys(strUserName);

	}

	public void setPassword(String password1) {

		password.sendKeys(password1);

	}

	public void clicklogin() {
		login.click();
		objj.implicitWait();

	}

	public void toclear() {
		username.clear();
		password.clear();

	}

	public String getHomePageTitle() {
		String title = driver.getTitle();
		return title;
	}

	
	
}
