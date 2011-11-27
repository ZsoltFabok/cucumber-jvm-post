Feature: simple text munger kata

  Background:
    Given I have an instance of my class

  Scenario Outline: It should munger a word properly
    When I call my method with <input>
    Then I receive <output>

    Examples:
     | input   | output  |
     | "a"     | "a"     |
     | "an"    | "an"    |
     | "and"   | "and"   |
     | "spice" | "scipe" |

  Scenario: It should process a sentence
    When I call my method with "And the spice must flow"
    Then I receive "And the scipe msut folw"