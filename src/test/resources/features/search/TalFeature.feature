@RegressionTest
Feature: Searching for a Life Insurance Product

  @InsuranceTest @RegressionTest
  Scenario Outline: Searching for a Life Insurance Product
    Given Enter URL '<URL>'
    When I click on Insurance and select Life Insurance
    Then click on Get Quote button
    When Details are entered
    Then Click get my quote button and submit
    And review quote details
    Then click Apply now
    And close the browser
    Examples:
      | URL                     |
      | https://www.tal.com.au/ |

  @ContactUs @RegressionTest
  Scenario Outline: Contacting TAL Customer Service
      Given Enter URL '<URL>'
      When clicked on Contact Us
      Then Select option as '<Label>'
      And entered all details '<Name>' '<Email>' '<Phone>' and send '<Your enquiry>'
      And close the browser
      Examples:
        | URL                     | Label                  | Name   | Email                  | Phone      | Your enquiry           |
        | https://www.tal.com.au/ | Make a general enquiry | disha  | dish.khila@yopmail.com | 0413000000 | Make a general enquiry |
        | https://www.tal.com.au/ | Make a general enquiry | disha1 | dish.khila@yopmail.com | 0413000001 | Make a general enquiry |

