@google_search
Feature: Google Search Functionality
  #Background is like @BeforeMethod in TestNG.
  #There is nothing like @AfterMethod in Cucumber
  Background:User opens Google page
    Given user is on the google page
  Scenario: TC01_ iPhone_search
# Scenario is Test Case
   # Describe the Behavior

    And user search for iphone
    Then verify the result as iphone
    Then close the application

  Scenario: TC02_teapot_search

  Given user search for teapot
  Then verify the result has teapot
  Then close the application
# Cucumber knows the already written methods so when we run the runner
# we will just see that we have to add 2nd and 3rd code

  Scenario: TC03_flower_search

    Given user search for flower
    Then verify the result has flower
    Then close the application

  Scenario: TC04_bmw_search

    Given user search for bmw
    Then verify the result has bmw
    Then close the application