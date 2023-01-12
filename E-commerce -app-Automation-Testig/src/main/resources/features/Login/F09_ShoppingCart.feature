@regression
Feature: user should be able to login to the systems and add different products to Shopping cart


  Background: user open the browser

  Scenario:Logged user could add different products to Shopping cart


    When user navigate to login page

    And user enter "shadyy@gmail.com" and "newproject"
    And user click on login button

    And user could login successfully

    Then user select 'cell phones' from 'electronics' category
    And user add products to cart
    And user go to the cart page




   # Then user c a t close  the browser
