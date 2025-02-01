package com.orange.base.page;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	protected WebDriver driver;
	
	public Logger log = Logger.getLogger(BasePage.class);
	
	public BasePage(WebDriver driver)
	{
		log.info("Constructor Method started");
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Constructor Method Ended");
	}
	
	public void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	

}
