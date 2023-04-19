Feature: Search and place the order for products
  Scenario: Search Experience for the product search in both home page and offers page
    Given User is on GreenCard Landing Page s
    When user searched with Shortname "Tom" and extracted actual name of product s
    Then User searched for "Tom" in offer page to check if product exist s
    And validate product name is in offer page matches with landing page s