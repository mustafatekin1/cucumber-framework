# The following is the homework
#When user search for the following capitals: London, Paris, Vienna, Berlin, Madrid
#Then verify the the result includes the the searched values
#FF: scenario_outline_1.feature

@scenario_outline_google_search
Feature: Google Search Functionality
  Scenario Outline: Google_Search

    Given user is on the google page
    And user search for "<item>"
    Then verify the result has "<item>"
    Then close the application
##to comment out: => command + /

Examples: TEST DATA
  |item  |
  |iPhone|
  |teapot|
  |flower|
  |bmw  |
  |eagle   |
  |toyota|
  |citroen|
 #It is really fast and easy to add or remove data in this Scenario Outline parameterizing
 # That's why "Scenario Outline" is also called Data Driven Testing

