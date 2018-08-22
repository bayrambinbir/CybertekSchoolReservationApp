Feature: login
@ahmet
 Scenario Outline: Verify usernames 
	
	Given the user is on the sign in page 
	When I login using username "<username>" and password "<password>" 
	And The user click on myself 
	Then users full name "<firstname>" "<lastname>" should be displayed 
	Examples: 
	 |firstname  |lastname         |username		                   |password         |	
     |Ruthann    |Johnes           |daldie7l@seattletimes.com          |ruthannjohnes    |
     |Arluene    |Reolfo           |gmcalister7n@google.nl             |arluenereolfo    |   
	 |Leonard    |Warfield         |sutting7v@liveinternet.ru          |leonardwarfield  |        
     |Carlos     |Michie           |strayford84@e-recht24.de           |carlosmichie     |  
     |Hadley     |Climer           |finkles7z@studiopress.com          |hadleyclimer     | 


Scenario: Verify group members on team page 
		Given the user is on the home page
       	When the user click on team button
		Then the user should be able to see following names 
		|Teri Mapam        |
		|Angie Coatham 	   |
		|Bennett Tomanek   |
		|Mariann Dewi 	   |
		
Scenario: verify first five schedule  hours 
	Given the user is on the home page 
	When the user click on berkeley room 
	Then subtitle should be "berkeley"
	Then the first five schedule  hours should be matched in the following : 
		|7:00AM   |
		|7:30AM   |
		|8:00AM   |
	    |8:30AM   |
	    |9:00AM   |
	    
	    
Scenario: make a reservation
Given the user is on the home page
When the user clicks on hunt to make reservation
Then verify hunt for spot page is displayed 
Then the user chooses date "17" and time from "11:00am" to "12.00am" then clicks search button
Then user clicks on book to reserve for "stanford" room
Then verify booking confirmation page is displayed 
And user clicks on confirm button to reserve the room
Then verify "conference in stanford has been successfully scheduled" message is displayed

