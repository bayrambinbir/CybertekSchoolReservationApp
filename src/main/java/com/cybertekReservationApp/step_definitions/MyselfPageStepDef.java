package com.cybertekReservationApp.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import com.cybertekReservationApp.pages.MyselfPage;

import cucumber.api.java.en.Then;


public class MyselfPageStepDef {
	
	
	MyselfPage myselfPage = new MyselfPage();
	
	String name = myselfPage.name.getText();
	String usernameText = myselfPage.usernameText.getText();
	String role = myselfPage.role.getText();
	String roleText = myselfPage.roleText.getText();
	String team = myselfPage.team.getText();
	String teamText = myselfPage.teamText.getText();
	String batch = myselfPage.batch.getText();
	String batchNumber = myselfPage.batchNumber.getText();
	String campus = myselfPage.campus.getText();
	String campusName = myselfPage.campusName.getText();
	
	
	
	@Then("the system should display the product information:")
	public void the_system_should_display_the_product_information(Map<String, String> product) {
		System.out.println(usernameText);
		System.out.println(roleText);
		System.out.println(teamText);
		System.out.println(batchNumber);
		System.out.println(campusName);
		
		assertEquals(product.get(name),usernameText);
		assertEquals(product.get(role),roleText );
		assertEquals(product.get(team),teamText );
		assertEquals(product.get(batch),batchNumber);
		assertEquals(product.get(campus),campusName);
		
	}


	





	
	@Then("users full name Ruthann Johnes should be displayed")
	public void the_user_full_name_should_be_displayed() {
		myselfPage.usernameText.isDisplayed();
	}

}
