Feature: OrangeHRM Test

  Scenario: Login to the Application
    Given user is on the login page
    When user enters valid username
    And user enters valid password
    Then user is able to login to the application