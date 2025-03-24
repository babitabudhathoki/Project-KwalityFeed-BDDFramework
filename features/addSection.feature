Feature: Featured Section Creation Page

  Background: Successful admin login with valid credentials
    Given I am on the login page
    When I enter a valid "<email>" in the email field of admin panel
    And I enter a valid "<password>" in the password field of admin panel
    And I click on the login button of admin panel
    And I should see the dashboard
    
      | email           | password |
      | admin@gmail.com |   123456 |

  Scenario Outline: Fill in a featured section creation form
    When I click the featured section button
    And I click the add section
    And I enter "<Title for section>" in the title for section field
    And I enter "<Short description>" in the short description field
    And I select "<Category IDs>" from the category IDs dropdown
    And I select "<Product Types>" from the product types dropdown
    Then I click the save button of add section

    Examples: 
      | Title for section | Short description | Category IDs | Product Types      |
      | xyz               | xyz               | Chicken      | New Added Products |
      |                   |                   |              |                    |
