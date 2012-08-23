Feature: web text munger kata

  Scenario: It should process a sentence
    Given the embedded tomcat is running
      And the application is deployed
      And I am using Firefox browser for testing
      And I am on the home page
     When I enter "flow flow"
      And I press "submit"
     Then I see "folw folw" as the munged text
      And I see "flow flow" as the original
      And I close the browser