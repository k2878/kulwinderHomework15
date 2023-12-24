Feature: RegisterUser
  @test
  Scenario: User from main page navigates to register page to register
    Given I am on homepage
    When Navigates to Register tab click on Register
    And I enters following users details
      | name | lastname | email          | telephone  | password | password confirm |
      | Kul  | Takhar   | kul124@gmail.com | 4155090949 | 123456k  | 123456k          |
    And I click checkbox of privacy policy
    And I click on continue button of registration page
    Then I should see account successfully created message