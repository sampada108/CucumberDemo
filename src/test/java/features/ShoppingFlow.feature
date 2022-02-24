#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Shopping End to End Flow

  Scenario: Select items and add to cart
    Given User is on the home page 
    When User clicks on the shop link 
    And selects items "Blackberry" and "iphone X" and clicks on Checkout button
    And User clicks on the Checkout button on the checkout page
    And purchase page is displayed here user selects country and Agreees to terms and conditions 
    And clicks on purchase button
    Then User Checks for success message displayed on the page.
    