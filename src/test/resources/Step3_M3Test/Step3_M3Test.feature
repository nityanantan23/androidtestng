Feature: Can I perform m3 (check feedback and store locator)?
  I should be able to check static context and wishlist function.

  Background: Start the applications
    Given I initiate M3_feedback Page


  Scenario: shops near me
    Then I am able to click store_locator_map
#    Then I am able to click allow gps
    Then I am able to click store_locator_nearme
    Then back1
    Then I am able to click store_list
    Then I am able to click store_list_filter
    Then I am able to click home

  Scenario: Favourite address page
    Then I am able to click menu buttins
    Then I am able to click fav_address menu
    Then I am able to add fav_address
    Then I am able to input_address_details
    Then I am able to edit_address_menu
    Then I am able to edit_address_details
    Then I am able to delete_address_menu
    Then back1


  Scenario: Wait for feedback
    Then I am able to click menu buttins
    Then  I am able to click the isAbleToClickHelpCenterButton button
    Then I am able to click the isAbleToClickFeedbackButton button
    Then I am able to click the isAbleToDescription button
    Then I am able to click the isAbleToClickSubmit button
    Then I am able to validate the feedback form
    Then back1
    Then I am able to click the isAbleToDescription button
    Then I am able to click the isAbleToEmoji button
    Then I am able to click the isAbleToClickSubmit button
    Then I am able to click the validation_failed_emoji button
    Then I am able to click the isAbleTolongdescription button
    Then I am able to click the isAbleToClickSubmit button
    Then I am able to invalidate the feedback form
    Then back1
    Then back1




