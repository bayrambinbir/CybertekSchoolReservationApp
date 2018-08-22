Feature: Negative Test

Scenario: Negative sign in functionality 
Given the user is on the sign in page
When the user enters correct email "gmcalister7n@google.nl" and wrong password "asdf"
Then verify invalid password is displayed.

Scenario: positive sign in functionality 
Given the user is on the sign in page
When the user enters correct email "gmcalister7n@google.nl" and password "arluenereolfo"
And verify light-side is displayed


@gulnoza
Scenario: Scheduling event test
Given the user on home page should be able to sign in with email "gmcalister7n@google.nl" and password "arluenereolfo"
Then the user should verify map link  
Then the user clicks on hunt link
And verify hunt for spot is displayed
Then the user enters date "23" and startTime "5:30pm" endTime "7:30pm" then click search button
Then verify free spots is displayed
Then the user clicks book button in stanford section
Then the user clicks confirm button
Then verify the schedule is displayed


