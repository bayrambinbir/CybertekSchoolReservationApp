Feature: End to end reservation testing

Scenario: reservation testing from sign in page 
Given the user is on the sign in page
When the user sign in using email "daldie7l@seattletimes.com" and password "ruthannjohnes"
Then verify light-side page is displayed
When the user clicks on hunt to make reservation
Then verify hunt for spot page is displayed 
Then user chooses desired date "20" and time from "10:00am" to "11:30pm" then clicks search button
Then user clicks on book to reserve for "stanford" room
Then verify booking confirmation page is displayed 
And user clicks on confirm button to reserve the room



Scenario: verify user name and last name
Given the user is on the sign in page
When the user sign in using email "daldie7l@seattletimes.com" and password "ruthannjohnes"
Then the user click on myself button
Then users full name Ruthann Johnes should be displayed

@talha
Scenario:
Given the user is on the sign in page
When the user sign in using email "daldie7l@seattletimes.com" and password "ruthannjohnes"
Then the user click on myself button
Then the system should display the product information:
        | name     |Ruthann Johnes |
        | role     |student-team-leader |
        | team     |CodeHunters|
        | batch    |#8|
        | campus   |VA |
        
        
        
        
        