Feature: simple text munger kata

  Background:
    Given I have a mocked munger which always returns "folw" for "flow"
      And I have an instance of my class

  Scenario: It should process a sentence
    When I call my method with "flow flow"
    Then I receive "folw folw"