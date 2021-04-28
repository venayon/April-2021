@UI
Feature: Visa checks

  # Pre-condition for multiple features -  adpots reusablilty
  # executes Before each Scenario in ths feature file
  Background:
    Given I am on the Check UK visa website
    And I start visa check

  Scenario: An Australian coming to the UK for Tourism.
    When I select a nationality of 'Australia'
    And I select reason 'Tourism'
    Then I will be informed 'You will not need a visa to come to the UK'

