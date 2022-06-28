@close_driver
  Feature: Close the driver
    Background: user_on_login_page
      Given user is in the main page
    Scenario: TC02: Close driver
      And user sends username
      And user sends password
      And user clicks submit button
      And verify the login page
      Then user closes the driver
