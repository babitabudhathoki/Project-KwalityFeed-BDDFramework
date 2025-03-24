Feature: Units Creation Page

Background: Successful admin login with valid credentials
    Given I am on the login page
    When I enter a valid "<email>" in the email field of admin panel
    And I enter a valid "<password>" in the password field of admin panel
    And I click on the login button of admin panel
    And I should see the dashboard
     
   
      | email           | password |
      | admin@gmail.com |   123456 |
 


  Scenario Outline: Fill in a unit form
    When I click the units button
    And I click the add unit
    And I enter "<Unit Name>" in the title for unit name field
    And I enter "<Short Code>" in the short Code field
    And I select "<Parent Unit>" from the parent unit dropdown
    And I enter "<Conversion>" in the conversion field
    Then I click the save button of add unit

    Examples: 
      | Unit Name | Short Code | Parent Unit | Conversion |
      | Dozen     | dz         | Main Unit   |          2 |
      |           |            |             |            |
