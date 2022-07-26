package com.Qalegendproject.Scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Qalegendproject.Constants.Constants;
import com.Qalegendproject.Pages.LoginPage;
import com.Qalegendproject.Utilities.ExcelUtilities;

public class TestRegressionOne extends TestBase {
	LoginPage objLogin;

	/*******************************************************************************
	
	
	
	*/

	@Test(dataProvider = "ValidUserInvalidPass", priority = 1)

	public void verifyLoginValidUserInvalidPass(String username, String password) throws IOException {
		objLogin = new LoginPage(driver);

		objLogin.setUserName(username);
		objLogin.setPassword(password);

		objLogin.clicklogin();
		Assert.assertEquals(objLogin.getHomePageTitle(), Constants.HOMETITLE);
		objLogin.toclear();

	}

	@Test(dataProvider = "InvalidUserValidPass", priority = 2)

	public void verifyLoginInvalidUserValidPass(String username, String password) throws IOException {
		objLogin = new LoginPage(driver);

		objLogin.setUserName(username);
		objLogin.setPassword(password);

		objLogin.clicklogin();
		Assert.assertEquals(objLogin.getHomePageTitle(), Constants.HOMETITLE);
		objLogin.toclear();
	}

	@Test(dataProvider = "InvalidUserInvalidPass", groups = {"Sanity Test"},priority = 3)

	public void verifyLoginInvaliduserInvalidPass(String username, String password) throws IOException {
		objLogin = new LoginPage(driver);

		objLogin.setUserName(username);
		objLogin.setPassword(password);

		objLogin.clicklogin();
		Assert.assertEquals(objLogin.getHomePageTitle(), Constants.HOMETITLE);
		objLogin.toclear();
	}

	@Test(dataProvider = "ValidUserValidPass",groups = {"Sanity Test"}, priority = 4)

	public void verifyLoginValidUserValidPass(String username, String password) throws IOException {
		objLogin = new LoginPage(driver);

		objLogin.setUserName(username);
		objLogin.setPassword(password);

		objLogin.clicklogin();
		Assert.assertEquals(objLogin.getHomePageTitle(), Constants.PAGETITLE);

	}

	@DataProvider

	public Object[][] ValidUserInvalidPass() throws Exception {
		Object[][] data = ExcelUtilities.getDataFromExcel(Constants.LoginCases, "ValiduserInvalidpass");
		return data;
	}

	@DataProvider

	public Object[][] InvalidUserValidPass() throws Exception {
		Object[][] data = ExcelUtilities.getDataFromExcel(Constants.LoginCases, "InvaliduserValidPass");
		return data;
	}

	@DataProvider

	public Object[][] InvalidUserInvalidPass() throws Exception {
		Object[][] data = ExcelUtilities.getDataFromExcel(Constants.LoginCases, "InvaliduserInvalidpass");
		return data;
	}

	@DataProvider

	public Object[][] ValidUserValidPass() throws Exception {
		Object[][] data = ExcelUtilities.getDataFromExcel(Constants.LoginCases, "ValiduserValidpass");
		return data;
	}

}
