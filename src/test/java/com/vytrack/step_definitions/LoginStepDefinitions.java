package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("open log in page");
        String url = ConfigurationReader.getProperty("qa3");
        Driver.getDriver().get(url);
    }

    @When("user logs in as a sales manger")
    public void user_logs_in_as_a_sales_manger() {
        System.out.println("Log in as sales manager");


        loginPage.login("salesmanager110", "UserUser123");
    }

    @When("user logs in as a store manger")
    public void user_logs_in_as_a_store_manger() {
        System.out.println("Log in as store manager");
        loginPage.login("storemanager85", "UserUser123");
    }


    @Then("User should verify that title is a Dashboard")
    public void user_should_verify_that_title_is_a_Dashboard() {
        System.out.println("verify that the title is dashboard");

        Assert.assertEquals("Dashboard", Driver.getDriver().getTitle());
        Driver.getDriver().close();
    }

}
