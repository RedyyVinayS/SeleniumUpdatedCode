package com.login.validation.test;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.test.BaseTest;

public class LoginValidationTest extends BaseTest {
	
	Logger log =  Logger.getLogger(LoginValidationTest.class);
	
	@BeforeTest
	@Parameters({"browser","siteURL"})
	public void initWebsite(String browser,String siteURL)
	{
		log.info("initWebsite method done");
		getWebBrowserAndWebsite(browser,siteURL);
		log.info("initWebsite method done");
		
	}
	
	@Test(priority = 1)
	public void ValidatingLoginFunctionalityWithInvalidUsernameAndPwd() throws InterruptedException
	{
	 loginpage.enterUsernameAndPassword(testDataProp.getProperty("invalid.email.text"), testDataProp.getProperty("invalid.pwd.text"));
	 System.out.println("Error MEssage : "+ expectedAssertionsProp.getProperty("invalid.credentials.error.text"));
	 System.out.println("Verification MEssage : "+ expectedAssertionsProp.getProperty("get.Overseasbtn.Text"));
	 Assert.assertEquals(loginpage.getLoginErrorMessageText(), expectedAssertionsProp.getProperty("get.Overseasbtn.Text"));
	 
	}
	@Parameters({"username","password"})
	@Test(priority = 2 , enabled = false )
	public void LoginwithValidCredentials(String username, String password)
	{
		
		initLogin(username , password);
		
	}

}
