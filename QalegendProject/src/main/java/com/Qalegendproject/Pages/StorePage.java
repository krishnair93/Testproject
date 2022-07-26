package com.Qalegendproject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Qalegendproject.Utilities.PageUtilities;
import com.Qalegendproject.Utilities.WaitUtilities;

public class StorePage {

	public WebDriver driver;
	PageUtilities obj;
	WaitUtilities objj;
	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/stores']")

	WebElement storepagenavigate;

	@FindBy(xpath = "//button[@class='btn btn-add btn-lg']")

	WebElement storepageadd;

	@FindBy(xpath = "//input[@id='StoreName']")

	WebElement storepageaddname;

	@FindBy(xpath = "//input[@id='City']")

	WebElement storepageaddcity;

	@FindBy(xpath = "//button[@class='btn btn-add']")

	WebElement storepageaddsubmit;

	@FindBy(xpath = "//th[text()='Store Name']")

	WebElement storepagesort;

	@FindBy(xpath = "(//a[@class='btn btn-default'])[2]")

	WebElement storepageedit;

	@FindBy(xpath = "//a[@class='btn btn-default float-right']")

	WebElement storepageeditback;

	@FindBy(xpath = "	(//a[@class='btn btn-default'])[1]")

	WebElement storepagedel;

	@FindBy(xpath = "(//a[@class='dropdown-toggle flat-box waves-effect waves-block'])[1]")

	WebElement peoplepage;

	@FindBy(xpath = "	//a[@href='https://qalegend.com/restaurant/waiters']")

	WebElement peoplepagewaiter;

	@FindBy(xpath = "	//button[@class='btn btn-add btn-lg']")

	WebElement peoplepageaddwaiter;

	@FindBy(xpath = "//input[@id='WaiterName']")

	WebElement peoplepageaddwaiterdetails;

	@FindBy(xpath = "//button[@class='btn btn-add']")

	WebElement peoplepageaddwaitersubmit;

	public StorePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

		obj = new PageUtilities(driver);
		objj = new WaitUtilities(driver);
	}

	public void spnavigate() {

		storepagenavigate.click();

	}

	public Boolean spaddstore() {
		objj.waitForElementTobeVisible(driver, storepageadd, 30);
		storepageadd.click();
		return true;

	}

	public Boolean spaddstoredetails() {
		objj.waitForElementTobeClickable(driver, storepageaddname, 30);
		storepageaddname.sendKeys("MCDS");
		storepageaddcity.sendKeys("TRV");
		return true;
	}

	public Boolean spaddstoredetailssubmit() {
		objj.waitForElementTobeClickable(driver, storepageaddsubmit, 30);
		storepageaddsubmit.click();
	boolean st =	storepageaddsubmit.isSelected();
	return st;
	}

	public Boolean spsort() {

		storepagesort.click();
		return true;
	}

	public Boolean spedit() {

		storepageedit.click();
		objj.waitForElementTobeClickable(driver, storepageeditback, 30);
		storepageeditback.click();
		return true;
	}

	public void spdel() {

		storepagesort.click();
		objj.implicitWait();
		storepagedel.click();
	}

	public Boolean navigatepeoplepage() {

		peoplepage.click();
		objj.implicitWait();
		peoplepagewaiter.click();
		return true;
	}

	public Boolean ppaddwaiter() {
		peoplepageaddwaiter.click();
		return true;
	}

	public Boolean ppaddwaiterdetails() {
		objj.waitForElementTobeVisible(driver, peoplepageaddwaiterdetails, 30);
		peoplepageaddwaiterdetails.sendKeys("Mike");
		return true;
	}

	public Boolean ppaddwaitersubmit() {

		peoplepageaddwaitersubmit.click();
		return true;
	}
}