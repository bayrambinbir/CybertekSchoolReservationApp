package com.cybertekReservationApp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertekReservationApp.utilities.Driver;

public class SigninPage {
	
	public SigninPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	//locator for email from sign in page
	public WebElement email;
	
	//locator for password from sign in page
	public WebElement password;
	
	//locator for sign in button from sign in page
	@FindBy(xpath = "//button[.='sign in']")
	public WebElement signinButton;
	

	
	
	
	public void signInAhmet(String mail,String pwd) {
		email.sendKeys(mail);
		password.sendKeys(pwd);
		signinButton.click();
		
	}
	

	//GS->locator to verify 'invalid password' text
	@FindBy(xpath="//div[.='invalid password.']")
	public WebElement invalidPasswordText;


}
