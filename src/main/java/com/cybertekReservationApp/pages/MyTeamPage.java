package com.cybertekReservationApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cybertekReservationApp.utilities.Driver;

public class MyTeamPage {
	
	public MyTeamPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	public WebElement  findGruopMember(int num) {
		
		return Driver.getDriver().findElement(By.xpath("(//p[@class='title is-6'])"+"["+num+"]" )) ; 
		//(//p[@class='title is-6'])[1]
	}

}
