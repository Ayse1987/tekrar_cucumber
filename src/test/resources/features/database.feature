
  Feature: user can read data from database
    Scenario: user get data from Resortline page
      Given user is connected to database
      And user gets all data in "Name" column in "tHOTELROOM" table
      And user reads 4 data in "Name" column
    @db_read
      Scenario: user get data from ReservationRoom
        Given user is connected to database
        And user gets all data in "Name" column in "tHOTEL" table
        And user reads 4 data in "Name" column

