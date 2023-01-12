@regression
Feature: user should be able to login to the systems and  select different tags

  Background: user open the browser


  Scenario:Logged user could select different tags


    When user navigate to login page

    And user enter "shadyy@gmail.com" and "newproject"
    And user click on login button

    Then user could login successfully

    And the user click on random category 'apparel'
    And select different tags




