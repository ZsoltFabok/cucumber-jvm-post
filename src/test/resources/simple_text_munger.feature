Feature: simple text munger kata
Scenario: Do nothing with a two-letter word
  Given I have an instance of my class
   When I call my method with "an"
   Then I receive "an"