@Email

Feature: User should be able to refer a product to friend while Login

  Scenario: Use should be able to refer product to friend while Login
    Given User is on Homepage
    When User should be able to click on product and email to friend
    Then User  should be able to send email and can see massage "Your massage has been sent"