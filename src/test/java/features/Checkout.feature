Feature: Checkout a product as a guest user
  @checkout
  Scenario: As a guest user i should able to checkout a product successfully
    Given I am on DemoNopcommerce Homepage
    When I click on "Build your own computer"
    And Select all the product details
    When I click on add to cart button
    And Enter the checkout button
    Then I should able to checkout successfully