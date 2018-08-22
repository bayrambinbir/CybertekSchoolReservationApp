Feature: End to end reservation testing

Scenario Outline: verify user information: <email>
    When the user sign in using email "<username>" and password "<password>"
    When the user is on the my self page
    Then the user information should be displayed
    |name  |<name>|
    |role  |<role>|

    Examples:
    | username                  | password      | name           | role        			   | 
    | bcrosetti88@sitemeter.com | jamesmcdonagh | James McDonagh | student-team-member | 
    | cbrose86@cbslocal.com     | garrikheis    | Garrik Heis    | student-team-member |
    | gmcalister7n@google.nl    | arluenereolfo | Arluene Reolfo | student-team-leader |

@asli
Scenario: verify the page is uploaded correctly
Given the user sign in using email "bcrosetti88@sitemeter.com" and password "jamesmcdonagh"
Then verify light-side page is displayed
And the user should be able to see the links
    |map           |
    |schedule      |
    |hunt          |
    |my            |
    
Scenario: Error message on booking on reserved time
Given the team lead has an existing reservation
When the user tries to reserve for same time
Then "you already have a conference for (selected date)" message should be displayed

