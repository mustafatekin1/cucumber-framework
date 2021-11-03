@parameterized_google_search
Feature: Google Search Functionality

  Scenario: TC01_ iPhone_search
# Scenario is Test Case
   # Describe the Behavior
   # to make the word into "" =>
   # shift + "
    Given user is on the google page
    And user search for "iphone"
    Then verify the result has "iphone"
    Then close the application
#to comment out: => command + /

  Scenario: TC02_teapot_search
    Given user is on the google page
    Given user search for "teapot"
    Then verify the result has "teapot"
    Then close the application
## Cucumber knows the already written methods so when we run the runner
## we will just see that we have to add 2nd and 3rd code

  Scenario: TC03_flower_search
    Given user is on the google page
    Given user search for "flower"
    Then verify the result has "flower"
    Then close the application

  Scenario: TC04_bmw_search
    Given user is on the google page
    Given user search for "bmw"
    Then verify the result has "bmw"
    Then close the application

  Scenario: TC05_eagle_search
    Given user is on the google page
    Given user search for "eagle"
    Then verify the result has "eagle"
    Then close the application

  Scenario: TC05_toyota_search
    Given user is on the google page
    Given user search for "toyota"
    Then verify the result has "toyota"
    Then close the application