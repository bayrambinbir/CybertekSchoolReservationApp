package com.cybertekReservationApp.step_definitions;


import org.junit.Assert;

import com.cybertekReservationApp.pages.SigninPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NegativeSignInStepDef {
	
	
  // GS-Negative Test Scenario
	 SigninPage signinPage = new SigninPage();
	
	
	@When("the user enters correct email {string} and wrong password {string}")
	public void the_user_enters_correct_email_and_wrong_password(String email, String wrongPassword) {
		signinPage.email.sendKeys(email);
		signinPage.password.sendKeys(wrongPassword);
		signinPage.signinButton.click();
	   	}

	@Then("verify invalid password is displayed.")
	public void verify_invalid_password_is_displayed() {
		Assert.assertEquals("invalid password.", signinPage.invalidPasswordText.getText());
	
}
	

	
	
}