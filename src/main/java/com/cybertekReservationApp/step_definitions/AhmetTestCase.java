package com.cybertekReservationApp.step_definitions;

import static org.junit.Assert.assertEquals;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.cybertekReservationApp.pages.BerkeleyPage;
import com.cybertekReservationApp.pages.HuntPage;
import com.cybertekReservationApp.pages.MapPage;
import com.cybertekReservationApp.pages.MyTeamPage;
import com.cybertekReservationApp.pages.MyselfPage;
import com.cybertekReservationApp.pages.SigninPage;
import com.cybertekReservationApp.utilities.BrowserUtils;
import com.cybertekReservationApp.utilities.ConfigurationReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AhmetTestCase {
	
	SigninPage signIn=new SigninPage();
	HuntPage huntPage = new HuntPage();
	Select select;
	MapPage mapPage=new MapPage();
	BerkeleyPage berkeleypage=new BerkeleyPage();
	MyTeamPage myTeamPage=new MyTeamPage();
	MyselfPage mySelf=new MyselfPage();
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
	 signIn.signInAhmet(ConfigurationReader.getProperty("email"), ConfigurationReader.getProperty("password"));
	   
	}

	@Then("the user chooses date {string} and time from {string} to {string} then clicks search button")
	public void the_user_chooses_date_and_time_from_to_then_clicks_search_button(String date, String timeFrom, String timeTo) {
		BrowserUtils.waitFor(2);
		huntPage.date.sendKeys(date);
		BrowserUtils.waitFor(2);
		new Select(huntPage.timeFromButton).selectByIndex(8);
		BrowserUtils.waitFor(2);
		new Select(huntPage.timeToButton).selectByIndex(1);
		BrowserUtils.waitFor(2);
		huntPage.searchButton.click();    
	   
	}
	@When("the user click on berkeley room")
	public void the_user_click_on_berkeley_room() {
	   mapPage.berkeleyButton.click();
	   BrowserUtils.waitFor(2);
	}

	@Then("subtitle should be {string}")
	public void subtitle_should_be(String subTitle) {
		Assert.assertEquals(subTitle, berkeleypage.berkeleyText.getText() );
		BrowserUtils.waitFor(2);
	    
	}

	@Then("the first five schedule  hours should be matched in the following :")
	public void the_first_and_last_two_hours_should_be_displayed_in_the_following( List<String>hours) {
		System.out.println(hours.size());
		System.out.println(hours);
		for (int i=1;i<6;i++) {
			Assert.assertEquals(berkeleypage.findHour(i).getText(),hours.get(i-1));
		}
		
	}
	@When("the user click on team button")
	public void the_user_click_on_team_button() {
		 BrowserUtils.hover(mapPage.my);
		   BrowserUtils.waitFor(2);
		   mapPage.myTeam.click();
	    
	}

	@Then("the user should be able to see following names")
	public void the_user_should_be_able_to_see_following_names(List<String>gruopMembers) {
		System.out.println(gruopMembers.size());
		System.out.println(gruopMembers);
		for (int i=2;i<=8;i+=2) {
			Assert.assertEquals(myTeamPage.findGruopMember(i-1).getText(),gruopMembers.get(i/2-1));
		//                                                 1,3,5,7               0,1,2,3
		}
	}
	

	@When("I login using username {string} and password {string}")
	public void i_login_using_username_and_password(String username, String password) {
		BrowserUtils.waitFor(2);
		signIn.signInAhmet(username, password);
		BrowserUtils.waitFor(2);
		
	}

	@When("The user click on myself")
	public void the_user_click_on_myself() {
		BrowserUtils.hover(mapPage.my);
		   BrowserUtils.waitFor(2);
		   mapPage.mySelf.click();
		
	}

	@Then("users full name {string} {string} should be displayed")
	public void users_full_name_should_be_displayed(String firstName, String lastName) {
		String expected = firstName + " " + lastName;
		BrowserUtils.waitFor(2);
		String actual =mySelf.userText.getText();
		BrowserUtils.waitFor(2);
		assertEquals(expected, actual);
		BrowserUtils.waitFor(2);

		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
