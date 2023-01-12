@regression
Feature: user should be able to login to the systems and filter with color

  Background: user open the browser


  Scenario:Logged user could filter with color


    When user navigate to login page

    And user enter "shadyy@gmail.com" and "newproject"
    And user click on login button


    And user could login successfully

    And the user select Apparel  category
    Then select shoes sub category
    And user select colors



