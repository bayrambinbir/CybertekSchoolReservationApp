package com.cybertekReservationApp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertekReservationApp.utilities.Driver;

public abstract class TopNavigationBar {
	public TopNavigationBar() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText = "map")
	public WebElement map;

	@FindBy(xpath = "//a[.='schedule']")
	public WebElement schedule;

	@FindBy(linkText = "hunt")
	public WebElement hunt;

	@FindBy(xpath="//a[@class='navbar-link']")
	public WebElement my;

	@FindBy(xpath = "//a[.='self']")
	public WebElement self;

	@FindBy(linkText = "team")
	public WebElement team;

	@FindBy(linkText = "sign out")
	public WebElement signOut;

	public void goToSelf() {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(my).perform();
		actions.click(self).perform();
	}

	public void goToTeam() {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(my).perform();
		team.click();
	}

	public void signOut() {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(my).perform();
		signOut.click();
	}
}
