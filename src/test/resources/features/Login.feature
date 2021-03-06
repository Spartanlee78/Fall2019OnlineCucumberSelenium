Feature: Login
  As user , I want to be able to login with username and password
  # Agile story

  # Test Method = Test case = Scenario
  # Test + dataProvider = Scenario Outline
  Scenario: Login as sales manager and verify that the title is Dashboard
    Given user is on the landing page
    When user logs in as a sales manger
    Then User should verify that title is a Dashboard


  Scenario: Login as store manager and verify that the title is Dashboard
    Given user is on the landing page
    When user logs in as a store manger
    Then User should verify that title is a Dashboard
