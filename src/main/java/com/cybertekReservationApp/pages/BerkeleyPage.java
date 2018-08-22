package com.cybertekReservationApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertekReservationApp.utilities.Driver;

public class BerkeleyPage {

	public BerkeleyPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	//locator for 'berkeley' Text
		@FindBy(xpath="//h1[.='berkeley']")
		public WebElement berkeleyText;
	
	
		public WebElement  findHour(int num) {
			
			return Driver.getDriver().findElement(By.xpath("//table/tbody/tr["+num+"]/th/div" ));
		}
		
		
}
