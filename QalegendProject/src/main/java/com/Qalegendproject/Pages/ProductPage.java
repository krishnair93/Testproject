package com.Qalegendproject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Qalegendproject.Constants.Constants;
import com.Qalegendproject.Utilities.PageUtilities;
import com.Qalegendproject.Utilities.WaitUtilities;

public class ProductPage {

	public WebDriver driver;
	PageUtilities obj;
	WaitUtilities objj;
	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/products']")

	WebElement productpagenavigate;

	@FindBy(xpath = "//button[@class='navbar-toggle collapsed']")
	WebElement productpagetoggle;
	@FindBy(xpath = "//button[@class='btn btn-add btn-lg']")
	WebElement productpageaddproduct;

	@FindBy(xpath = "//select[@name='type']")
	WebElement productpageaddproducttype;

	@FindBy(xpath = "//input[@name='code']")
	WebElement productpageaddproductcode;

	@FindBy(xpath = "//input[@name='name']")
	WebElement productpageaddproductname;

	@FindBy(xpath = "//input[@name='price']")
	WebElement productpageaddproductprice;
//check	

	@FindBy(xpath = "(//button[contains(text(),'Submit')])[1]")
	WebElement productpageaddproductsubmit;
	@FindBy(xpath = "//button[@onclick='updatestock()']")
	WebElement productpageaddproductsubmit2;

	@FindBy(xpath = "//input[@class='form-control input-sm']")
	WebElement productpagesearch;

	@FindBy(xpath = "(//a[@class='btn btn-default'])[2]")
	WebElement productpageviewpt;

	@FindBy(xpath = "(//button[@class='btn btn-default hiddenpr'])[3]")
	WebElement productpageviewptclose;

	@FindBy(xpath = "(//a[@class='btn btn-add btn-xs'])[1]")
	WebElement productpagedwnld;

	@FindBy(xpath = "//i[@class='fa fa-barcode']")
	WebElement productpagebarcode;

	@FindBy(xpath = "(//button[text()='Close'])[7]")
	WebElement productpagebarcodeclose;

	@FindBy(xpath = "(//a[@class='btn btn-default'])[3]")
	WebElement productpageedit;

	@FindBy(xpath = "//a[@class='btn btn-default float-right']")
	WebElement productpageeditback;

	@FindBy(xpath = "(//a[@class='btn btn-default'])[1]")
	WebElement productpagedel;

	@FindBy(xpath = "//a[@class='btn btn-danger']")
	WebElement productpagedelyes;
	// *************

	@FindBy(xpath = "//a[text()='Upload CSV file']")
	WebElement productpageupload;

	@FindBy(xpath = "	(//input[@id='ImageInput'])[2]")
	WebElement productpageuploadfile;
	@FindBy(xpath = "	(//button[text()='Close'])[3]")
	WebElement productpageuploadclose;

	@FindBy(xpath = "//a[text()='Next']")
	WebElement productpagenext;

	@FindBy(xpath = "//a[text()='Previous']")
	WebElement productpageprevious;

	@FindBy(xpath = "//a[text()='PrintMenu']")
	WebElement productpageprint;

	@FindBy(xpath = "(//button[text()='Close'])[9]")
	WebElement productpageprintclose;

	public ProductPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

		obj = new PageUtilities(driver);
		objj = new WaitUtilities(driver);
	}

	public void ppnavigate() {

		productpagenavigate.click();
		objj.implicitWait();

	}

	public void pptoggle() {
		productpagetoggle.click();

	}

	public String getProductPageTitle() {
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		return title1;

	}

	public String ppaddproduct() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		String sa=productpageaddproduct.getText();
	productpageaddproduct.click();
	System.out.println(sa);
	return sa;
	}

	public String ppadddetails(String text) {
		
		objj.waitForElementTobeVisible(driver, productpageaddproducttype, 30);

		Select dropdown = new Select(productpageaddproducttype);
		dropdown.selectByVisibleText(text);

		return text;

	}

	public void ppadddetails1() throws InterruptedException {
		objj = new WaitUtilities(driver);
		objj.waitForElementTobeClickable(driver, productpageaddproducttype, 10);
		productpageaddproductcode.sendKeys("abcd");

		objj.waitForElementTobeClickable(driver, productpageaddproducttype, 30);
		productpageaddproductname.sendKeys("test1");
		objj.waitForElementTobeClickable(driver, productpageaddproducttype, 10);
		productpageaddproductprice.sendKeys("100");
		objj.waitForElementTobeClickable(driver, productpageaddproducttype, 10);
		productpageaddproductsubmit.click();
		objj.waitForElementTobeClickable(driver, productpageaddproducttype, 20);

		// productpageaddproductsubmit2.click();
	}

	public  void ppsearch() {

		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpagesearch, 40);
	productpagesearch.sendKeys("abcd");
	Boolean be=productpagesearch.isSelected();
System.out.println(be);



	}

	public void ppviewpt() {
		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpageviewpt, 30);
		productpageviewpt.click();

	}

	public void ppviewpt1() {
		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpageviewptclose, 30);
		productpageviewptclose.click();
	}

	public Boolean ppdwnlod() throws InterruptedException {

		

		Thread.sleep(5000);
	 productpagedwnld.click();
		return true;
		

	}

	public Boolean ppbarcode() throws InterruptedException {

		productpagebarcode.click();
		objj = new WaitUtilities(driver);
		objj.implicitWait();

		productpagebarcodeclose.click();
		return true;

	}

	public Boolean ppedit() throws InterruptedException {

		productpageedit.click();
		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpageeditback, 30);

		productpageeditback.click();
		return true;

	}

	public Boolean ppdel() throws InterruptedException {

		productpagedel.click();
		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpagedelyes, 30);

		productpagedelyes.click();
		return true;

	}

	public Boolean ppnext() throws InterruptedException {

		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpagenext, 30);

		productpagenext.click();
		return true;

	}

	public Boolean ppprevious() throws InterruptedException {

		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpageprevious, 30);

		productpageprevious.click();
		return true;
	}

	public Boolean ppupload() throws InterruptedException {

		productpageupload.click();

		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpageuploadfile, 30);
		productpageuploadfile.sendKeys(Constants.FILEUPLOAD);
		return true;
	}

	public Boolean ppuploadclose() throws InterruptedException {

		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpageuploadclose, 30);

		productpageuploadclose.click();
		return true;
	}

	public String ppprint() throws InterruptedException {

		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpageprint, 30);
	String cs=	productpageprint.getText();
		productpageprint.click();
		return cs;

	}

	public Boolean ppprintclose() throws InterruptedException {

		objj = new WaitUtilities(driver);
		objj.waitForElementTobeVisible(driver, productpageprintclose, 30);

		productpageprintclose.click();
		return true;
	}

}
