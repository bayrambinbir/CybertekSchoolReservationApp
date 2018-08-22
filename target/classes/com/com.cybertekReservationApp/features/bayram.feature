Feature: BAYRAM
## SPA-1509
@bayram1001
Scenario: VA Light Side Page
Given the user is on the sign in page
When the user on home page should be able to sign in with email "jalabaster7f@drupal.org" and password "terimapam"
Then user confirms that VA LightSide is visible

##SPA-1510
@bayram1001
Scenario: hunt tab
Given the user is on the sign in page
When user clicks on hunt to make reservation
Then user chooses "today's date" as the desired date
Then the user enters startTime "8:30am" endTime "9:30am" then click search button
Then verify free spots is displayed
 Then user clicks on book for Stanford
 Then user verifies the time
Then the user clicks confirm button
And user verifies that Stanford has been reserved as a desired room


# ##SPA-1513
@bayram1001
Scenario: 
Given the user is on the sign in page
Then user clicks on schedule button
Then user sees a gray square and clicks on it
Then user verifies that "die luft der freiheit weht" is visible for Standford room
Then user verifies the date 
