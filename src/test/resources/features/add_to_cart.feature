@api @cart
Feature: Add Product To Cart

  Background:
    Given "alice" is logged in

  Scenario: Add another item into an existing cart
    Given "alice" has a cart with 1 x "SKU-BAG"
    When she adds 1 x "SKU-BAG" to her cart
    Then the response status is 200