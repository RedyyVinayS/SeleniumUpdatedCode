package com.leave.functionality.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.test.BaseTest;

public class ApplyLeaveTest extends BaseTest {
	
	@BeforeTest
	@Parameters({"browser","siteURL","username","password"})
	public void IntiWebsite(String browser,String siteURL,String username ,String  password) {
		
		getWebBrowserAndWebsite(browser,siteURL);
		initLogin(username , password);
	}
	
	@Test(priority = 1)
	public void applyLeave()
	{
		homepage.clickOnLeaveButton();
		leavePage.clickOnApplyButton();
		leavePage.clickOnLeaveTypeDropDown();
		System.out.println(" Changes made");
	}

}
