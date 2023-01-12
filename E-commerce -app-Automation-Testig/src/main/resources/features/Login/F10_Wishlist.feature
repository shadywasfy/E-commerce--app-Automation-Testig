@regression
Feature: user should be able to login to the systems and add different products to Wishlist


  Background: user open the browser

  Scenario:Logged user could add different products to Wishlist

    When user navigate to login page

    And user enter "shadyy@gmail.com" and "newproject"
    And user click on login button

    And user could login successfully

    Then user select 'cell phones' from 'electronics' category
    And user add products to wishlist
    And user go to the wishlist page
