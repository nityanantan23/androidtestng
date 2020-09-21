Feature: Does app pop up shown?
    We want to be able to start the application and see app pop up.

    Background: Start the application
        Given I initiate Landing Page

    Scenario: Wait for app load popup to show
    	Given I see the app load banner
        Then I am able to click the download button
        
    Scenario: Wait for product page to show
    	Given I see product page
#      Then I am able to click the close button
#        Then I am able to click the back button
