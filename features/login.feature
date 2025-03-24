Feature: Login Page
  
  @important
  Scenario Outline: Successful admin login with valid credentials
    Given I am on the login page
    When I enter a valid "<email>" in the email field of admin panel
    And I enter a valid "<password>" in the password field of admin panel
    And I click on the login button of admin panel
    And I should see the dashboard

 
    Examples: 
      | email           | password |
      | admin@gmail.com |   123456 |
  #Scenario: Forgot password
    #Given I am on the login page
    #When I click on the forgot password link
    #Then I should see the forgot password page
#
  #Scenario Outline: Successful seller login with valid credentials
    #Given I am on the login page
    #When I click on the seller panel button
    #And I should see the seller panel page
    #And I enter a valid "<email>" in the email field of seller account
    #And I enter a valid "<password>" in the password field of seller account
    #Then I click the seller login button
#
    #Examples: 
      #| email             | password |
      #| seller1@gmail.com |   123456 |
#
  #Scenario Outline: Navigate to delivery boy panel
    #Given I am on the login page
    #When I click on the delivery boy panel button
    #And I should see the delivery boy panel page
    #And I enter a valid "<email>" in the email field of delivery boy account
    #And I enter a valid "<password>" in the password field of delivery boy account
    #Then I click the delivery boy login button
#
    #Examples: 
      #| email                 | password |
      #| deliverboy1@gmail.com |   123456 |
