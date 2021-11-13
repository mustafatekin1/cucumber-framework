#note: Actually this is not common to create data in DB.
      #mostly we read DB
@create_new_hotel_in_db_and_verify
  Feature: Create new Hotel in Database and verify

    Scenario: TC01_create new hotel in DB
      Given user connects to DB
      When user creates a new hotel with this values "'3000','Mustafa Royal King Hotel',+'LA Downtown','8889900','royalla@testemail.com','2021-10-10 19:40:47.597', 4"
      Then verify the creation is successful
      Then close the connection

