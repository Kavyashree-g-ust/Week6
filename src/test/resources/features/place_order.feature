@api @order
Feature: Place Order

  Background:
    Given "alice" is logged in

  Scenario: Place an order from a cart
    Given "alice" has a cart with 2 x "SKU-BAG"
    When she places the order
    Then the response status is 201
    And GET /api/orders/{that id} returns PLACED and totalPaise 99800
    @db
    And the orders table has exactly one PLACED row for alice