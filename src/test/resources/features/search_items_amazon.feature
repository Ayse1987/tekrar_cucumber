@amazon
  Feature: user_search_items_on_amazon
    Background: user_is_on_amazon_page
      * is on amazon home page
      Scenario: user_search_for_backpack
        And usersend backpack to search box
        Then verify result in page
        * user closes the driver

    Scenario: user_search_for_backpack



