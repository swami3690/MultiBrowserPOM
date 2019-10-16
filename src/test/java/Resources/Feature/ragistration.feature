@register
Feature: User should be able to Register  successfully
  Scenario: User should be able to fill  necessary all faculties to register
    Given    User is on Homepage URL
    When    User should be able to see register page after click on register navigate on homepage
    Then   User should able to  see massage "you are register successfully " after clicking register button
