Feature: As user I want to login under different roles

 @storemanager
  Scenario: Login as a store manager
    Given user is on the landing page
    Then user logs in as a "store manager"
    And user verifies that "Dashboard" page name is displayed

  @salesmanager
  Scenario: Login as a sales manager
    Given user is on the landing page
    Then user logs in as a "sales manager"
    And user verifies that "Dashboard" page name is displayed

 @driver
  Scenario: Login as a driver
    Given user is on the landing page
    Then user logs in as a "driver"
    And user verifies that "Dashboard" page name is displayed

 @allusers
  Scenario: Existing user Verification
    Given user is on Application landing page
    Then we verify following user exists
      | UserName        | password    |
      | storemanager81  | UserUser123 |
      | salesmanager146 | UserUser123 |
      | user45          | UserUser123 |
#  //@negative
#  Scenario: Verify warning message for invalid credentials
#    Given user is on the landing page
#    Then user logs in with "wrong" username and "wrong" password
#    And user verifies that "Invalid user name or password." warning message is displayed
#
#  //@driver
#  Scenario: Login as a driver
#    Given user is on the landing page
#    Then user logs in as a driver
#    And user verifies that "Quick Launchpad" page name is displayed