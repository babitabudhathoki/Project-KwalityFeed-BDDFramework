Feature: Categories Creation Page

Background: Successful admin login with valid credentials
    Given I am on the login page
    When I enter a valid "<email>" in the email field of admin panel
    And I enter a valid "<password>" in the password field of admin panel
    And I click on the login button of admin panel
    And I should see the dashboard
    
  
      | email           | password |
      | admin@gmail.com |   123456 |

 
  Scenario Outline: Fill in a categories creation form
    When I click the categories button
    And I click the add categories
    And I select "<Parent Category>" from the parent category dropdown
    And I enter "<Category Name>" in the category name field
    And I enter "<Slug>" in the slug field on category
    And I enter "<Category Subtitle>" in the category subtitle field
    And I upload "<Image>"
    Then I click th save button

    Examples: 
      | Parent Category | Category Name | Slug | Category Subtitle | Image                                                                           |
      | Eggs            | White eggs    |      | eggs              | C:\\Users\\Babita Budhathoki\\Downloads\\1.iframe arrangement in a web page.png |
