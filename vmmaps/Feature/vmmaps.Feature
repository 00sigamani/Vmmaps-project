Feature: User Authentication

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter username "deivasigamani588@gmail.com" and password "sigamani1234"
    Then I should be logged in successfully

  Scenario: Forgot password link functionality
    Given I am on the login page
    When I click on forgot password link
    Then I should be redirected to the forgot password page
