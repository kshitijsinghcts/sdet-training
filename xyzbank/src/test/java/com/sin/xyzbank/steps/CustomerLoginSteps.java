package com.sin.xyzbank.steps;

import com.sin.xyzbank.pages.AccountPage;
import com.sin.xyzbank.pages.HomePage;
import com.sin.xyzbank.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

public class CustomerLoginSteps {

    private final HomePage homePage = new HomePage();
    private final LoginPage loginPage = new LoginPage();
    private final AccountPage accountPage = new AccountPage();

    @Given("the user is on the XYZ Bank home page")
    public void the_user_is_on_the_xyz_bank_home_page() {
        // The @Before hook in Hooks.java already navigates to the URL.
        // This step is here to make the Gherkin scenario readable.
        // We can add an assertion here if needed to verify the page title or a specific element.
        System.out.println("User is on the home page.");
    }

    @When("the user clicks on the Customer Login button")
    public void the_user_clicks_on_the_customer_login_button() {
        homePage.clickCustomerLogin();
    }

    @When("the user selects their name {string} from the list")
    public void the_user_selects_their_name_from_the_list(String userName) {
        loginPage.selectUser(userName);
    }

    @When("the user clicks the Login button")
    public void the_user_clicks_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("the user should be logged in and see their account number {string}")
    public void the_user_should_be_logged_in_and_see_their_account_number(String expectedAccountNumber) {
        String actualAccountNumber = accountPage.getAccountNumber();
        Assert.assertEquals(actualAccountNumber, expectedAccountNumber, "Account number does not match!");
    }
}