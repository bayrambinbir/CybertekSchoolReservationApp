package com.cybertekReservationApp.step_definitions;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.cybertekReservationApp.pages.HuntPage;
import com.cybertekReservationApp.pages.MapPage;
import com.cybertekReservationApp.pages.SchedulPage;
import com.cybertekReservationApp.pages.TopNavigationBar;
import com.cybertekReservationApp.utilities.BrowserUtils;
import com.github.javafaker.Faker;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bayram1001TestCases extends TopNavigationBar{

	MapPage mapPage = new MapPage();
	HuntPage huntPage = new HuntPage();
	SchedulPage schedulePage = new SchedulPage();
	
	LocalDateTime now = LocalDateTime.now();
	@Then("user confirms that VA LightSide is visible")
	public void user_confirms_that_VA_LightSide_is_visible() {
		BrowserUtils.waitFor(3);
		String actual = mapPage.lightsideText.getText();
		Assert.assertEquals(actual, "light-side");
	}

	@When("user clicks on hunt to make reservation")
	public void user_clicks_on_hunt_to_make_reservation() {
		BrowserUtils.waitFor(2);
		mapPage.huntButton.click();

	}

	@Then("user chooses {string} as the desired date")
	public void user_chooses_as_the_desired_date(String today) {
		
		int hey = now.getDayOfMonth()+1;
		String currentDayOfMonth = "" + hey;
		System.out.println("Current day is: " + currentDayOfMonth);
		BrowserUtils.waitFor(2);
		huntPage.date.click();
		huntPage.date.sendKeys(currentDayOfMonth);
	}

	@Then("the user enters startTime {string} endTime {string} then click search button")
	public void the_user_enters_startTime_endTime_then_click_search_button(String startime, String endtime) {
		BrowserUtils.waitFor(1);
		new Select(huntPage.timeFromButton).selectByVisibleText(startime);;
		BrowserUtils.waitFor(2);
		new Select(huntPage.timeToButton).selectByVisibleText(endtime);

		BrowserUtils.waitFor(1);
		huntPage.searchButton.click();
	}

	@Then("user clicks on book for Stanford")
	public void user_clicks_on_book_for_Stanford()  {
		BrowserUtils.waitFor(2);
		huntPage.bookButton.click();
		
	}
	@Then("user verifies the time")
	public void user_verifies_the_time() {
		BrowserUtils.waitFor(2);
		Assert.assertEquals("8:30am - 9:30am", schedulePage.timeInCancelingReservedRoomPage.getText());
		System.out.println("Chosen Time: "+schedulePage.timeInCancelingReservedRoomPage.getText());
	   
	}
	
	@Then("user verifies that Stanford has been reserved as a desired room")
	public void user_verifies_that_Stanford_has_been_reserved_as_a_desired_room() {
		BrowserUtils.waitFor(1);
		Assert.assertEquals("conference in stanford has been successfully scheduled",
				schedulePage.successfullyScheduledText.getText());
		System.out.println("CONFIRMATION: "+schedulePage.successfullyScheduledText.getText());

	}

	@Then("user clicks on schedule button")
	public void user_clicks_on_schedule_button() {
		BrowserUtils.waitFor(1);
		schedule.click();
	}

	@Then("user sees a gray square and clicks on it")
	public void user_sees_a_gray_square_and_clicks_on_it() {
		BrowserUtils.waitFor(2);
		schedulePage.reservedRoom.click();

	}

	@Then("user verifies that {string} is visible for Standford room")
	public void user_verifies_that_is_visible_for_Standford_room(String abc) {
		BrowserUtils.waitFor(1);
		Assert.assertEquals(abc, schedulePage.dieLuftDerFreiheitWeht.getText());
		System.out.println("CONFIRMATION: "+schedulePage.dieLuftDerFreiheitWeht.getText());
		
//		System.out.println("Chosen Time: "+schedulePage.timeInCancelingReservedRoomPage.getText());
//		int hey = now.getDayOfMonth()+1;
//		String currentDayPlus1 = "" + hey;
//		SimpleDateFormat formatter = new SimpleDateFormat("M/");
//		Date date = new Date();
//		String currentMonthDate = formatter.format(date);
//		System.out.println("Chosen Date: "+currentMonthDate+currentDayPlus1);
	}

	@Then("user verifies the date")
	public void user_verifies_the_date() {
		BrowserUtils.waitFor(2);
		int hey = now.getDayOfMonth()+1;
		String currentDayPlus1 = "" + hey;
		SimpleDateFormat formatter = new SimpleDateFormat("M/");
		Date date = new Date();
		String currentMonthDate = formatter.format(date);
		Assert.assertEquals(currentMonthDate+currentDayPlus1, schedulePage.dateInCancelingReservedRoomPage.getText());
        System.out.println("Chosen Date: "+currentMonthDate+currentDayPlus1);
		
		

	}
}
