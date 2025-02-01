package com.login.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orange.base.page.BasePage;

public class LoginPage extends BasePage{
	
	   @FindBy(xpath = "//input[@placeholder='Username']")
	    private WebElement usernameField;

	    @FindBy(xpath ="//input[@placeholder='Password']")
	    private WebElement passwordField;

	    @FindBy(xpath ="//button[@type='submit']")
	    private WebElement loginButton;
	    
	    @FindBy(xpath = "//p[text()='Invalid credentials']")
	    private WebElement loginerrorMSG;

	    public LoginPage(WebDriver driver) {
	        super(driver); // Calls the BasePage constructor
	    }

	    public void enterUserName(String username) {
	    	log.info("enterUserName method has started ");
	    	usernameField.clear();
	        usernameField.sendKeys(username);
	        log.info("enterUserName method has completed ");
	       
	    }
	    public void enterPassword(String password) {
	    	log.info("enterPassword method has started ");
	    	passwordField.clear();
	        passwordField.sendKeys(password);
	        log.info("enterPassword method has completed ");
	       
	    }
	    public void clickOnLoginButton()
	    {
	    	log.info("clickOnLoginButton method has started ");
	    	loginButton.click();
	    	log.info("clickOnLoginButton method has started ");
	    }
	    public void enterUsernameAndPassword(String username, String password)
	    {
	    	log.info("enterUsernameAndPassword method has started ");
	    	usernameField.clear();
	        usernameField.sendKeys(username);
	        passwordField.clear();
	        passwordField.sendKeys(password);
	        loginButton.click();
	        log.info("enterUsernameAndPassword method has ended ");
	    }
	    
	    public  String getLoginErrorMessageText()
	    {
	    	log.info("getLoginErrorMessageText method has Started");
	    	return loginerrorMSG.getText();
	    	 
	    }
	    
	
	

}
