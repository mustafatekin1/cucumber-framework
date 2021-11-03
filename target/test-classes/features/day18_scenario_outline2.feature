#When user search for the following capitals: London, Paris, Vienna, Berlin, Madrid
#Then verify the the result includes the the searched values
#FF: scenario_outline_2.feature

@scenario_outline2_google_search
  Feature: Google Search Functionality

  Scenario Outline: Google_Search
    Given user is on the google page
    Then user search for "<capital>"
    Then verify the result has "<capital>"
    Then close the application

    # The following "Examples:" keyword is a must. TEST Data is optional
    Examples: TEST Data
    |capital|
    |London|
    |Paris|
    |Vienna|
    |Berlin|
    |Madrid|


