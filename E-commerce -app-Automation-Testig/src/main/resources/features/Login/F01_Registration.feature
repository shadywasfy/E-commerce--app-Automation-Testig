@regression
Feature: user should be able to create new account

  Background: user open the browser

  Scenario: User could register with valid data


    When user navigate to registration page

    And user select his  gender
    And user type the first name and last name
    And user select date of birthday
    And user enter the emil
    And user enter the company name
    And user select newsletter options
    And user enter password and confirm password

    And user click on register  button

    Then user could register successfully






