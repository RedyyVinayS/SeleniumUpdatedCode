package com.search.functionality.validation;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.test.BaseTest;

public class SearchFunctionality extends BaseTest {
	
	@BeforeTest
	@Parameters({"browser","siteURL","username","password"})
	public void IntiWebsite(String browser,String siteURL,String username ,String  password) {
		
		getWebBrowserAndWebsite(browser,siteURL);
		initLogin(username , password);
	}
	
	@Test(priority = 1)
	public void SearchFunctionalityValidity()
	{
		homepage.enterTexttToSearchField("Maintenance");
		Assert.assertEquals(homepage.getSearchedText(), "Maintenance");
	}

}
