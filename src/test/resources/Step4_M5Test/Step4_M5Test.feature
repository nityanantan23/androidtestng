Feature: Can I perform m5 (check static context and wishlist function)?
  I should be able to check static context and wishlist function.

  Background: Start the application
    Given I initiate M5 Page

  Scenario: Wait for product page to show
    Then I am able to add product to list
    Then I am able to select_location pickup
    Then I am able to pay pickup



