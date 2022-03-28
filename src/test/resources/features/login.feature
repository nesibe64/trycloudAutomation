Feature: As a user, I should be able to log in.
 @smoke
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user use username "<username>" and password “<password>"

    And user click the login button
    Then verify the user should be at the "Dashboard" page
    Examples:
      | username    | password     |
      | user5            | Userpass123 |
      | user35          | Userpass123 |
      | user95          | Userpass123 |