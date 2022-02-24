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

Feature: User Registration Functionality

  Scenario Outline: Fill user registration form 
    Given User is on the home page of the apllication
    When User enters registration details like "<name>", "<email>", "<password>", selects "<gender>" and "<empstatus>" and enters "<DateOfBirth>"
    And submits form using submit button.
    Then User checks for success message.

    Examples: 
      | name  | email 				 |	password   | gender | empstatus |  DateofBirth |
      | Tom  	| tom@mail.com 	 |	tom@mail   | Male   | Student	  |  12-02-1990 |
      | Jerry | jerry@mail.com |	jerry@mail | Male   | Employed   |  23-08-1990 |
