package com.cybertekReservationApp.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.interactions.Actions;

import com.cybertekReservationApp.pages.SelfPage;
import com.cybertekReservationApp.utilities.BrowserUtils;
import com.cybertekReservationApp.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyInfoStepDefs {

	@When("the user is on the my self page")
	public void the_user_is_on_the_my_self_page() {
		SelfPage selfPage = new SelfPage();
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(selfPage.my).perform();
		BrowserUtils.waitFor(2);
		selfPage.self.click();
		selfPage.goToSelf();
		BrowserUtils.waitFor(2);
	}
	
	@Then("the user information should be displayed")
	public void the_user_information_should_be_displayed(Map<String, String> map) {
		
		SelfPage selfPage = new SelfPage();
		String expectedName = map.get("name");
		assertEquals(expectedName, selfPage.name.getText());
		   
		String expectedRole = map.get("role");
		assertEquals(expectedRole, selfPage.role.getText());
		//assertEquals(expecteds, actuals);
	}
}
