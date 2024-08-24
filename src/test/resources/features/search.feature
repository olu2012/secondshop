
Feature: Product Search

  Scenario: User searches for products
    Given a user is on the product search page
    When the user enters a search term "Shirt" in the search bar
    And the user presses the "Enter" key
    Then the product listing area should display products matching the search term

  Scenario: User sees a message for no matching products
    Given a user is on the product search page
    When the user enters a search term "Unknown Product" in the search bar
    And the user presses the "Enter" key
    Then a message "No products found for your search" should be displayed in the product listing area

 # Scenario Outline: User interaction with search bar
   # Given a user is on the home search page
   # When the user enters "<search term>" in the search bar
   # And the user presses the "Enter" key
   # Then the product listing area should be updated accordingly

   # Examples:
    #  | search term |
    #  | Shirt       |
    #  | hat         |
     # |             |

