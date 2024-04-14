
Feature: Search_Hotel

  @tag1
  Scenario: Validate the hotel details
    Given Load the search hotel page 
    When Enter the Location "Melbourne"
    And Enter the Hotel "Hotel Sunshine"
    And Enter the Room "Standard"   
    And Enter the No of room "1"
    And Enter the CheckIn "02-04-2024"
    And Enter the CheckOut "05-04-2024"
    And Enter the Adults "2"
    And Enter the Children "2"
    And click the search button
    Then Validate the search hotel page
 

  