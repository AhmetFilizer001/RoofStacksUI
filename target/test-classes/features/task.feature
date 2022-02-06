Feature: QA UI Test Case

  @wip
  Scenario:
    Given the user is on the google main page
    Then the page title should be "Google"
    When the user search "Roof Stack Yazılım" on google
    And the user selected "https://roofstacks.com" link from the options
    Then the page title should be "Home Page - Roof Stacks"
    And the user clicks to "Career" module
    Then the page title should be "Engineering Careers - Roof Stacks"
    And the user selects "Product" position
    Then the page title should be "Product - Roof Stacks"
    And the user selects "Lead Product Tester" position
    Then the page title should be "Lead Product Tester - Roof Stacks"
    When the user clicks to Send CV button
    And the user sends to "xxx@gmail.com" as an email address
    And the user upload a file to send CV
    And the user clicks to upload button
    Then the percent should be "100%"



