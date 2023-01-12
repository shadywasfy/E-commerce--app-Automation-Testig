@regression
Feature: user should be able to login to the systems and switch between currencies US-Euro

  Background: user open the browser

  Scenario:Logged User could switch between currencies US-Euro


    When user navigate to login page


    And user enter "shadyy@gmail.com" and "newproject"
    And user click on login button

    And user could login successfully

    Then the user click on customer currency and select us or Euro




