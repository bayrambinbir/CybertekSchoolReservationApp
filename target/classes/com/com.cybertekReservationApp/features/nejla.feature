Feature: Nejla's End to end testing

Scenario: Display page information text
Given the user is on the sign in page
When the user sign in using email "jalabaster7f@drupal.org" and password "terimapam"
When the user clicks on hunt to make reservation
Then user chooses desired date "18" and time from "12:00am" to "2:00pm" then clicks search button
Then verify free spots is displayed
And verify booking information text should be displayed


Scenario: reservation testing from sign in page 
Given the user is on the sign in page
When the user sign in using email "jalabaster7f@drupal.org" and password "terimapam"
Then verify light-side page is displayed
When the user clicks on hunt to make reservation
Then verify hunt for spot page is displayed 
Then user chooses desired date "18" and time from "12:00am" to "1:00pm" then clicks search button
Then user clicks on book to reserve for "stanford" room
Then verify booking confirmation page is displayed 
And user clicks on confirm button to reserve the room

@nejla
Scenario: Verify the schedule page is displayed
Given the user is on the sign in page
When the user sign in using email "jalabaster7f@drupal.org" and password "terimapam"
And the user clicks on the schedule button 
Then verify the schedule page is displayed



Scenario: Verify VA ligth-side page 
Given the user is on the sign in page
When the user sign in using email "jalabaster7f@drupal.org" and password "terimapam"
Then verify light-side page is displayed
	  
		
		
