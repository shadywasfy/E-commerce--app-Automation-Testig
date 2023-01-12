@regression
Feature: user should be able to login to the systems and add different products to compare list

  Background: user open the browser


  Scenario:Logged user could add different products to compare list


    When user navigate to login page

    And user enter "shadyy@gmail.com" and "newproject"
    And user click on login button

    And user could login successfully


    Then user select 'cell phones' from 'electronics' category
    And user add products to cart
    And user go to the cart page
    And user checkout the terms and click on checkout button
    And user enter the data of address and click continue
    And user check shipping method and click continue
    And user check payment method and click continue
    And user check payment information and click continue
    And user confirm order and click confirm





