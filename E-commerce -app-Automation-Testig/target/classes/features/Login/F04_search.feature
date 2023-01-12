@regression
Feature: user should be able to login to the systems and earch for any product

  Background: user open the browser


  Scenario: Logged User could search for any product

    When user navigate to login page


    And user enter "shadyy@gmail.com" and "newproject"
    And user click on login button
    And user could login successfully

    Then the user enter "notebook" for any product
    And user click on search button

    And user could search for any product successfully



