package com.base.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Leaves.page.LeavePage;
import com.home.page.HomePage;
import com.login.page.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

	WebDriver driver;
	public com.login.page.LoginPage loginpage;
	public HomePage homepage;
	public LeavePage leavePage;
	
	
	protected static Properties testDataProp=null;
	public static Properties expectedAssertionsProp=null;

	@BeforeSuite
	public void initTestdata() {
		FileReader testDataReader = null;
		FileReader assertionReader = null;
		try {
			testDataReader = new FileReader("src/main/resources/testdata.properties");
			assertionReader = new FileReader("src/main/resources/expectedassertions.properties");
			testDataProp = new Properties();
			testDataProp.load(testDataReader);

			expectedAssertionsProp = new Properties();
			expectedAssertionsProp.load(assertionReader);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Parameters({"browser","siteURL"})
	public void getWebBrowserAndWebsite(String browser,String siteURL)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(siteURL);
		
		
		loginpage = new LoginPage(driver);
		loginpage.implicitWait();
		homepage = new HomePage(driver);
		homepage.implicitWait();
		leavePage = new LeavePage(driver);
		leavePage.implicitWait();
	}
	@Parameters({"username","password"})
	public void initLogin(String username, String password)
	{
		loginpage.enterUsernameAndPassword(username, password);
		
	}
	
	

}
