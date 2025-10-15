@CustomerLogin
Feature: XYZ Bank Customer Login and Account Verification
    As a customer of XYZ Bank
    I want to log in to my account
    So that I can view my account details

    Scenario: Successful login for a customer
        Given the user is on the XYZ Bank home page
        When the user clicks on the Customer Login button
        And the user selects their name "Hermoine Granger" from the list
        And the user clicks the Login button
    Then the user should be logged in and see their account number "1001"