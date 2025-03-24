Feature: Product Creation Page

  Background: Successful admin login with valid credentials
    Given I am on the login page
    When I enter a valid "<email>" in the email field of admin panel
    And I enter a valid "<password>" in the password field of admin panel
    And I click on the login button of admin panel
    And I should see the dashboard
      | email           | password |
      | admin@gmail.com |   123456 |

  Scenario Outline: Fill in product creation form
    When I click the Products button
    And I click the add product button
    And I enter "<ProductName>" in the product name field
    And I enter "<ProductSlug>" in the slug field
    And I select "<Seller>" from the seller dropdown
    And I select "<Tax>" from the tax dropdown
    And I enter "<Tag>" in the tags field
    And I select "<Brand>" from the brands dropdown
    And I enter "<ThisIsAProductDescription>" in the description field
    And I upload "<PathMainImage>" as the main image
    And I upload "<PathOtherImage>" as other images
    And I select "<Type>" for the type radio button
    And I select "<StockLimit>" for the stock limit radio button
    And I enter "<Measurment>" in the measurement field
    And I enter "<Price>" in the price field
    And I enter "<DiscountPrice>" in the discount price field
    And I enter "<Stock>" in the stock field
    And I select "<Unit>" from the unit dropdown
    And I select "<Status>" from the status dropdown
    And I click the add variant button
    And I select "<Category>" from the category dropdown
    And I select "<ProductType>" from the product type dropdown
    And I enter "<Manufacturer>" in the manufacturer field
    And I select "<MadeIn>" from the made in dropdown
    And I enter "<FSSAI LIc.No.>" in the FSSAI Lic. No. field
    And I select "<IsReturnable>" for the Is Returnable? radio button
    And I select "<IsCancelable>" for the Is cancelable? radio button
    And I select "<IsCOD>" for the Is COD allowed? radio button
    And I enter "<TotalAllowedQuantity>" in the total allowed quantity field
    And I select "<ProductStatus>" for the product status radio button
    And I click the save button
    Then I should see a confirmation message "Product saved successfully"

    Examples: 
      | ProductName    | ProductSlug | Seller   | Tax      | Tag  | Brand | ThisIsAProductDescription | PathMainImage                                                                            | pathOtherImage | Variant  | Type  | StockLimit | Measurement | Price  | DiscountPrice | Stock | Unit  | Status | Category  | ProductType | Manufacturer  | MadeIn | FSSAI LIc.No. | IsReturnable | IsCancelable | IsCOD | TotaLAlllowedQuantity | ProductStatus |
      | Sample Product |             | Seller 1 | test tax | Tag1 |       | fghdfhgdjhdfghdjhgdghdgjd | C:\\Users\\Babita Budhathoki\\Desktop\\KWALITYFEED\\03fb21642c14e62e88505fb7473622b9.jpg |                | Variant1 | Type1 | Limit1     |             | 100.00 |         80.00 |    50 | Unit1 | Active | Category1 | TypeA       | ManufacturerA | India  | FSSAI12345678 | Yes          | Yes          | No    |                   100 | Active        |
 @p2
  Scenario Outline: Fill in a unit form
    When I click the Products button
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
