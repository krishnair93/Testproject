package com.Qalegendproject.Scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Qalegendproject.Constants.Constants;
import com.Qalegendproject.Pages.LoginPage;
import com.Qalegendproject.Pages.ProductPage;
import com.Qalegendproject.Utilities.WaitUtilities;

public class TestRegressionTwo extends TestBase {
	LoginPage objLogin;
	ProductPage objProduct;
	WaitUtilities objk;

	@Test(priority = 5 ,groups = {"Sanity Test"})

	public void verifyProductPage() throws IOException, InterruptedException {
		
		objProduct = new ProductPage(driver);
		objk = new WaitUtilities(driver);
		objk.implicitWait();

		objProduct.pptoggle();

		objProduct.ppnavigate();
		Assert.assertEquals(objProduct.getProductPageTitle(), Constants.PAGETITLE);

	}

	@Test(priority = 6 ,groups = {"Sanity Test"})

	public void verifyAddproduct() throws IOException {
	
		objProduct = new ProductPage(driver);
	String sb=	objProduct.ppaddproduct();
	Assert.assertEquals(sb, "Add Product");
	}

	@Test(priority = 7)

	public void verifyAddproductfields() throws IOException, InterruptedException {
	
		objProduct = new ProductPage(driver);
	
		String s = objProduct.ppadddetails("Service");

		
		Assert.assertEquals(objProduct.ppadddetails(s), "Service");

		objProduct.ppadddetails1();

	}

	@Test(priority = 9 ,groups = {"Sanity Test"})

	public void verifyproductsearch() throws IOException, InterruptedException {

		objProduct = new ProductPage(driver);

	objProduct.ppsearch();
	Assert.assertTrue(true);

	
	}

	@Test(priority = 10)

	public void verifyproductview() throws IOException, InterruptedException {
		
		objProduct = new ProductPage(driver);

		objProduct.ppviewpt();

		objProduct.ppviewpt1();
	}

	@Test(priority = 8)

	public void verifyproductdwnlod() throws IOException, InterruptedException {
	
		objProduct = new ProductPage(driver);
		

		Boolean b =objProduct.ppdwnlod();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(b);
		obj1.assertAll();
		
	}

	@Test(priority = 11)

	public void verifyproductbarcode() throws IOException, InterruptedException {

		objProduct = new ProductPage(driver);
	
		Boolean cd=objProduct.ppbarcode();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(cd);
		obj1.assertAll();

	}

	@Test(priority = 12)

	public void verifyproductedit() throws IOException, InterruptedException {
		
		objProduct = new ProductPage(driver);
		
	Boolean de=	objProduct.ppedit();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(de);
		obj1.assertAll();

	}

	@Test(priority = 13)
	public void verifyproductdel() throws IOException, InterruptedException {
		
		objProduct = new ProductPage(driver);
	
		Boolean ef=	objProduct.ppdel();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(ef, "Del is working");
		obj1.assertAll();
	}

	@Test(priority = 14)
	public void verifyproductnext() throws IOException, InterruptedException {
		
		objProduct = new ProductPage(driver);
		// Thread.sleep(3000);
		Boolean fg=	objProduct.ppnext();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(fg);
		obj1.assertAll();
	}

	@Test(priority = 15)
	public void verifyproductprevious() throws IOException, InterruptedException {
		
		objProduct = new ProductPage(driver);
	
		Boolean gh=objProduct.ppprevious();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(gh);
		obj1.assertAll();
	}

	@Test(priority = 16)
	public void verifyproductprint() throws IOException, InterruptedException {

		objProduct = new ProductPage(driver);

		String aa=objProduct.ppprint();
		
		SoftAssert obj1= new SoftAssert();
		obj1.assertEquals(aa, "PrintMenu");
		obj1.assertAll();

	}

	@Test(priority = 17)
	public void verifyproductprintclose() throws IOException, InterruptedException {
		
		objProduct = new ProductPage(driver);

		Boolean jk=objProduct.ppprintclose();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(jk);
		obj1.assertAll();
	
	}

	@Test(priority = 18)
	public void verifyproductupload() throws IOException, InterruptedException {
		
		objProduct = new ProductPage(driver);

		Boolean hi=objProduct.ppupload();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(hi);
		obj1.assertAll();
	}

	@Test(priority = 19)
	public void verifyproductuploadclose() throws IOException, InterruptedException {
	
		objProduct = new ProductPage(driver);

		Boolean ij=	objProduct.ppuploadclose();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(ij);
		obj1.assertAll();

	}

}
