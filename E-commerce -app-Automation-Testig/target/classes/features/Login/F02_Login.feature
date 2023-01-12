@regression
Feature: user should be able to login to the system

  Background: user open the browser

  Scenario: user login with valid email and password


    When user navigate to login page

   And user enter "shadyy@gmail.com" and "newproject"
   And user click on login button

    Then user could login successfully


