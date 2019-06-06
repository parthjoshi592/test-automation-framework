Feature: Google home page tests

  Scenario: Perform a Google search

    Given chrome is open and Google website has been launched
    When user enters India as the search term and presses enter
    Then the search results page loads
