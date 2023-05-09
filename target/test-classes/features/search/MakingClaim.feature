Feature: Making a Claim

  Scenario Outline: Making a Claim
    Given Enter URL '<URL>'
    When I click on Claim
    Then select the type of claim
    When instruction provided is complete
    Then provide main information
    And upload document
    Then review claim and submit application
    And get the claim number
    Examples:
      | URL                     |
      | https://www.tal.com.au/ |