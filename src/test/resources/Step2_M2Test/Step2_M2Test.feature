Feature: Can I perform m2 (check static context and wishlist function)?
  I should be able to check static context and wishlist function.

  Background: Start the application
    Given I initiate m2_static & wishlist Page

  Scenario: Wait for product page to show
    Then I am able to click the menu button

  Scenario: Wait for menu page to show
    Then I am able to click the login button
    Then login page

  Scenario: Wait for terms and ccondition page to show
    Then I am able to click the menu button
    Then I click terms and condion button
    Then I see Tnc page
    Then goingback

  Scenario: Wait for privace policy page to show
    Then I am able to click the menu button
    Then I click privacy policy button
    Then I see privacy policy page
    Then goingback

  Scenario: Wait for stay connected page to show
    Then I am able to click the menu button
    Then I click stay connected button
    Then I see stay connected page
    Then goingback

  Scenario: Wait for product page to show
    Then click category button
    Then I click product page
    Then I click heart button
    Then back
    Then back

  Scenario: Wait for  wishlist page to show
    Then I click wishlist button
    Then I click wishlist product button
    Then I click uncheck wishlist product button
    Then back

