package com.vytrack.step_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import com.vytrack.utilities.Pages;
import org.junit.Assert;

public class LoginStepDefinitions {

    Pages pages = new Pages();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {

        pages.loginPage().goToLandingPage();
    }

    @Then("user logs in as a {string}")
    public void user_logs_in_as_a(String role) {
        pages.loginPage().login(role);
    }


    @Then("user verifies that {string} page name is displayed")
    public void user_verifies_that_page_name_is_displayed(String pageName) {
        Assert.assertEquals(pageName, pages.dashboardPage().getPageSubTitle());
    }

}
