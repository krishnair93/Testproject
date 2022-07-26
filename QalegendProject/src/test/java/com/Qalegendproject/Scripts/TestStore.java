package com.Qalegendproject.Scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Qalegendproject.Constants.Constants;
import com.Qalegendproject.Pages.LoginPage;
import com.Qalegendproject.Pages.ProductPage;
import com.Qalegendproject.Pages.StorePage;
import com.Qalegendproject.Utilities.WaitUtilities;

public class TestStore extends TestBase {

	LoginPage objLogin;
	ProductPage objProduct;
	StorePage objStore;
	WaitUtilities objk;

	@Test(priority = 20)

	public void verifynavigatetoStorePage() throws IOException, InterruptedException {

		objProduct = new ProductPage(driver);
		objStore = new StorePage(driver);
		objk = new WaitUtilities(driver);
		objk.implicitWait();
		

		objProduct.pptoggle();

		objStore.spnavigate();
		Assert.assertEquals(objProduct.getProductPageTitle(), Constants.PAGETITLE);

	}

	@Test(priority = 21)

	public void verifyStorePageadd() throws IOException, InterruptedException {

		objStore = new StorePage(driver);
		

		Boolean jk =objStore.spaddstore();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(jk);
		obj1.assertAll();

	}

	@Test(priority = 22)

	public void verifyStorePageadddetails() throws IOException, InterruptedException {

		objStore = new StorePage(driver);
		// objk=new WaitUtilities(driver);
		// objk.implicitWait();
		// Thread.sleep(5000);

		objStore.spaddstoredetails();

	}

	@Test(priority = 23)

	public void verifyStorePageadddetailssubmit() throws IOException, InterruptedException {

		objStore = new StorePage(driver);
		

		objStore.spaddstoredetailssubmit();
		Assert.assertTrue(true);

	}

	@Test(priority = 24)

	public void verifyStorePagesort() throws IOException, InterruptedException {

		objStore = new StorePage(driver);
		objk = new WaitUtilities(driver);
		objk.implicitWait();
		

		Boolean kl=objStore.spsort();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(kl);
		obj1.assertAll();

	}

	@Test(priority = 25)

	public void verifyStorePageedit() throws IOException, InterruptedException {

		objStore = new StorePage(driver);
		

		Boolean lm=objStore.spedit();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(lm);
		obj1.assertAll();
		;

	}

	@Test(priority = 26)

	public void verifyStorePagedel() throws IOException, InterruptedException {

		objStore = new StorePage(driver);
		

		objStore.spdel();

	}

	@Test(priority = 27)

	public void verifynavigatepeoplepage() throws IOException, InterruptedException {

		objProduct = new ProductPage(driver);
		objStore = new StorePage(driver);
		objk = new WaitUtilities(driver);

		

		objProduct.pptoggle();
		objk.implicitWait();
	Boolean mn=	objStore.navigatepeoplepage();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(mn);
		obj1.assertAll();
	}

	@Test(priority = 28)

	public void verifyPeoplepageaddwaiter() throws IOException, InterruptedException {

		objStore = new StorePage(driver);
		objk = new WaitUtilities(driver);
		objk.implicitWait();
		

		objStore.ppaddwaiter();

	}

	@Test(priority = 29)

	public void verifyPeoplepageaddwaiterdetails() throws IOException, InterruptedException {

		objStore = new StorePage(driver);
		

	Boolean no=	objStore.ppaddwaiterdetails();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(no);
		obj1.assertAll();

	}

	@Test(priority = 30)

	public void verifyPeoplepageaddwaiterdetailssubmit() throws IOException, InterruptedException {

		objStore = new StorePage(driver);
		objk = new WaitUtilities(driver);
		objk.implicitWait();
	

		Boolean op=objStore.ppaddwaitersubmit();
		SoftAssert obj1= new SoftAssert();
		obj1.assertTrue(op);
		obj1.assertAll();

	}
}