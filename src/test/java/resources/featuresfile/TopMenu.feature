Feature: Top menu test

  As a user i want to check top menu tabs on tutorial ninja websites homepage

  Background: I am on homepage
  @test
  Scenario: User should navigate to desktop page successfully
    When I mouse hover And click on desktop tab
    And I select menu show All Desktops
    Then I should Navigate to desktop page successfully


  @test
  Scenario: User should navigate to laptop and notebook page successfully
    When I mouse hover and click on laptop and notebook tab
    And I select menu Show All Laptops & Notebooks
    Then I should navigate to laptop and notebook page successfully

  @test
  Scenario: User should navigate to component page successfully
    When I mouse hover and click on component tab
    And I select menu Show All Components
    Then I should navigate to component page successfully