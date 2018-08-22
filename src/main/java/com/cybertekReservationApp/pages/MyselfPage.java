package com.cybertekReservationApp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertekReservationApp.utilities.Driver;

public class MyselfPage {
	public MyselfPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	//locator for 'Ruthann Johnes' text
		@FindBy(xpath="//p[.='Ruthann Johnes']")
		public WebElement usernameText;
		
		@FindBy(xpath="(//div[@class='media-content']/p)[2]")
		public WebElement name;
		
		@FindBy(xpath="//p[contains(text(),'student-team-leader')]")
		public WebElement roleText;
		
		@FindBy(xpath="//p[contains(text(),'role')]")
		public WebElement role;
		
		@FindBy(xpath="//p[contains(text(),'CodeHunters')]")
		public WebElement teamText;
		
		@FindBy(xpath="//p[@class='subtitle is-7'][contains(text(),'team')]")
		public WebElement team;
		
		@FindBy(xpath="//p[contains(text(),'#8')]")
		public WebElement batchNumber;
		
		@FindBy(xpath="//p[contains(text(),'batch')]")
		public WebElement batch;
		
		@FindBy(xpath="//p[contains(text(),'VA')]")
		public WebElement campusName;
		
		@FindBy(xpath="//p[contains(text(),'campus')]")
		public WebElement campus;
		
		@FindBy(xpath="//h2[@class='subtitle']")
		public WebElement userText;

}
