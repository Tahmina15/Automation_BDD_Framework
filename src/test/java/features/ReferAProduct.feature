Feature: A register user should referred a product to a friend successfully
  @referAProduct @all
    Scenario: As a user , I should be able to send a product to my friend successfully
    Given I am on home page
    When I enter all required Registration details
    And I click on continue
    When I enter all required login details
    When I add apple mac book on the cart
    Then I should able to referred this product to my friend successfully
