@main_page_login
  Feature: Main_Page_Login
    Background: User is on the main page
      Given user is in the main page
      Scenario: TC01_
        And user sends username
        And user sends password
        And user clicks submit button
        Then verify the login page
