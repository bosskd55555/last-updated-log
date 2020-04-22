Feature: Search by keywords

    
    
Scenario: Searching for a term-new
    Given user is already on login page
    When title of the login page is Free CRM
    Then close the browser


Scenario: Entering deal team
    Given user is already on login page
    When title of the login page is Free CRM
    Then user clicks on deals button
    And user enters deals details
    Then close the browser