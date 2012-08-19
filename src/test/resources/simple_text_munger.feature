Feature: simple text munger kata

  Scenario: It should process a sentence
    Given I have a mocked munger which always returns "folw" for "flow"
      And I have an instance of my class
     When I call my method with "flow flow"
     Then I receive "folw folw"