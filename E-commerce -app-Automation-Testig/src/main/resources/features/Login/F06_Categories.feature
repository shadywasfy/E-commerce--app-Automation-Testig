@regression
Feature: user should be able to login to the systems and select different Categories

  Background: user open the browser

  Scenario:Logged user could select different Categories


    When user navigate to login page

    And user enter "shadyy@gmail.com" and "newproject"
    And user click on login button

    And user could login successfully

    Then the user click on random category 'electronics'
    And select sub category if found




