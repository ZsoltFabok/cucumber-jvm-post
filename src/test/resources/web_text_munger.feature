Feature: web text munger kata

  @web
  Scenario: It should process a sentence
    Given I am on the home page
     When I enter the "flow flow"
      And I press "submit"
     Then I see "folw folw" as munged text
      And I see "flow flow" as the original