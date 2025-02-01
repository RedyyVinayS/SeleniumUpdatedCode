package com.Leaves.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orange.base.page.BasePage;

public class LeavePage extends BasePage{
	
	@FindBy(xpath = "//a[text()='Apply']")
	private WebElement btnApply;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	private WebElement DropdownLeaveType;

	@FindBy(xpath = "")
	private WebElement btnLeave;

	public LeavePage(WebDriver driver) {
		super(driver);
	}
	public void clickOnApplyButton()
	{
		btnApply.click();
	}
	
	public void clickOnLeaveTypeDropDown()
	{
		DropdownLeaveType.click();
	}

	
	
	
	

}
