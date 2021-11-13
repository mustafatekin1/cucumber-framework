@db_read
Feature: Read hotel reservation info from DB
 @db_read_price_hotelroom
  Scenario: TC01_read hotel reservation info
    Given user connects to DB
    And user gets the "Price" from "tHOTELROOM" table
    And user reads all of the "Price" column data
    Then close the connection

  @db_read_hotel_name
  Scenario: TC02_Read_hotel_information
    Given user connects to DB
    And user gets the "Name" from "tHOTEL" table
    And user reads all of the "Name" column data
    Then close the connection

  @db_read_hotel_address
  Scenario: TC03_Read_address_info
    Given user connects to DB
    And user gets the "Address" from "tHOTEL" table
    And user reads all of the "Address" column data
    Then close the connection

#    THIS GIVES 5 STEP DEFINITIONS
#  When I parameteterize the feature file then I can use that step for all others
#   And user gets the "COLUMN" from "TABLE" table
#    And user gets the "Price" from "tHOTEL" table
#    And user gets the "Address" from "tHOTEL" table
#    And user gets the "Phone" from "tHOTEL" table
#    And user gets the "Price" from "tHOTELROOM" table
#    And user gets the "Name" from "tHOTELROOM" table