package com.home.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orange.base.page.BasePage;

public class HomePage extends BasePage{
	

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement SearchField;
	
	@FindBy(xpath = "//ul//li//a[@class='oxd-main-menu-item']//span")
	private WebElement searchEDText;

	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement btnLeave;
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void enterTexttToSearchField(String attributeName)
	{
		SearchField.sendKeys(attributeName);
	}
	
	public String getSearchedText()
	{
		return searchEDText.getText();
	}
	public void clickOnLeaveButton()
	{
		log.info("clickOnLeaveButton method started");
		btnLeave.click();
		log.info("clickOnLeaveButton method ended");
	}

}
