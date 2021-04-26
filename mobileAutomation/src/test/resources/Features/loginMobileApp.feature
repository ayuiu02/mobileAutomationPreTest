@allLoginFeatureMobileApp
Feature: Feature to test login functionality

  @validCredentialMobileApp
  Scenario: User should succesfully login using valid credential
    Given Apps is open
    When User enter valid email in email field
    And User enter valid password in password field
    And User click on Login button
    Then User should be able to see Name in User List page
    And User should be able to see Email in User List page
    And User should be able to see Password in User List page
	
	@invalidPasswordMobileApp
  Scenario: User should be able to see an alert message if the combination of email and passwoard are invalid
    Given Apps is open
    When User enter valid email in email field
    And User enter invalid password in passsword field
    And User click on Login button
    Then User should be able to see alert message
    And User should still in Login page

  @invalidEmailMobileApp
  Scenario: User should be able to see an alert message if the combination of email and passwoard are invalid
    Given Apps is open
    When User enter invalid email in email field
    And User enter valid password in password field
    And User click on Login button
    Then User should be able to see alert message
    And User should still in Login page

  @emailFieldEmptyMobileApp
  Scenario: User should be able to see an alert message if email or password is empty
    Given Apps is open
    When User does not type any email in email field
    And User filled password field
    And User click on Login button
    Then User should be able to see alert message
    And User should still in Login page
	
	@passwordFieldEmptyMobileApp
  Scenario: User should be able to see an alert message if email or password is empty
    Given Apps is open
    When User filled email field
    And User does not type any password in password field
    And User click on Login button
    Then User should be able to see alert message
    And User should still in Login page

	@allFieldsEmptyMobileApp
  Scenario: User should be able to see an alert message if email or password is empty
    Given Apps is open
    When User does not type any email in email field
    And User does not type any password in password field
    And User click on Login button
    Then User should be able to see alert message
    And User should still in Login page
