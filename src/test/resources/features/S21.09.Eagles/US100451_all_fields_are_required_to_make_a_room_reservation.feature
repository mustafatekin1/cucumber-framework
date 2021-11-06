@room_reservation
Feature: FE1009 Room Reservation
@wip
  Scenario: TC01_user_login_with_manager_profile
    Given user is on the application page
    And user enters manager_id and manager_password
      |username |userpassword |
      |manager  |Manager1!    |
    When user clicks on the login button
    Then verify the "manager" is displayed
    Then take the screenshot

  Scenario: TC02 user navigates to room reservation
    Given user navigates to the create room reservation
    Then take the screenshot
#Sending data using data table:
  Scenario: TC03 can book a reservation
    Given user enter all of the required fields
      |idUser |idHotelRoom|price|dateStart |dateEnd   |adultAmount|childrenAmount|contactNameSurname|contactPhone  |contactEmail  |notes    |
      |manager|Ayse       |500  |11/08/2021|11/12/2021|2          |3             |test              |(999) 999-9999|test@gmail.com|test note|
    And user clicks on the approved checkbox
    And user clicks on is paid check box
    Then take the screenshot
    And user clicks on save button
    Then user verifies the success message
    And user clicks on OK button
    Then take the screenshot
    Then close the application