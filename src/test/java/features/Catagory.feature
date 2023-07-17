  Feature:category

    Background:
    Given I am on DemoNopcommerce Homepage
    @category
   Scenario Outline: Category feature
     When I click on "<button_name>" button
     Then I should able to verify I am navigated to related page "<page_url>" successfully
     And I should able verify the page tittle as "<page_title>"
     Examples:
       | button_name       |  | page_url                                       |  | page_title        |
       | Computers         |  | https://demo.nopcommerce.com/computers         |  | Computers         |
       | Electronics       |  | https://demo.nopcommerce.com/electronics       |  | Electronics       |
       | Apparel           |  | https://demo.nopcommerce.com/apparel           |  | Apparel           |
       | Digital downloads |  | https://demo.nopcommerce.com/digital-downloads |  | Digital downloads |
       | Books             |  | https://demo.nopcommerce.com/books             |  | Books             |

  Feature: Hover over the category list and confirm the colour change and verify sub category list
    @hoverOver
    Scenario:As a user I should able to hover over a product and confirm the color and verify the subcategory links
      When I hover over the "Computers" category
      Then I should verify the change of hover colour
      When I click on subcategory "Notebooks" link
      Then I should be able to navigate successfully to "/notebook" page

