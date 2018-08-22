package com.cybertekReservationApp.step_definitions;

import org.junit.Assert;

import com.cybertekReservationApp.pages.MapPage;
import com.cybertekReservationApp.pages.SigninPage;

import cucumber.api.java.en.When;

public class PositiveSigninStepDef {

	      SigninPage signinPage = new SigninPage();
	      MapPage mapPage = new MapPage();
	      
	//GS-Positive test Scenario
		@When("the user enters correct email {string} and password {string}")
		public void the_user_enters_correct_email_and_password(String email, String correctPassword) {
		    signinPage.email.sendKeys(email);
		    signinPage.password.sendKeys(correctPassword);
		    signinPage.signinButton.click();
		}

		@When("verify light-side is displayed")
		public void verify_light_side_is_displayed() {
		 Assert.assertEquals("light-side",mapPage.lightsideText.getText());

		}
		
}
