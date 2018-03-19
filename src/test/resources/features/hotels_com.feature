@regression @Hotels_com

  Feature: Hotel Search on Hotels.com

    Background:
      Given I am on hotels.com

    @hotel_search
    Scenario: Verify user is able to search for hotels
      When I type in Minnesota
      And I click Minnesota City from auto suggest box
      And I check in for 6 days starting tomorrow
      And I select 2 adults and 2 children
      And I select ages 2 and 4 for the children
      Then I am able to search for hotels

    @hotel-2
    Scenario: Verify user is unable to login with an empty password text field
      When I click on the sign in & Account bar
      And  I type in a username
      Then I verify it gives me the error message

    @hotel-3
    Scenario:

    @hotel-4
    Scenario:

    @hotel-5
    Scenario:

    @hotel-6
    Scenario:
