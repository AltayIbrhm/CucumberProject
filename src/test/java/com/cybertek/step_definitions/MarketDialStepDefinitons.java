package com.cybertek.step_definitions;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MarketDialStepDefinitons {

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        String expectedTitle="";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }




    @Given("the user click on request a demo buttom")
    public void the_user_click_on_request_a_demo_buttom() {

    }
    @Then("the user enders first name")
    public void the_user_enders_first_name() {

    }
    @When("the user enters last name")
    public void the_user_enters_last_name() {

    }
    @Then("the user enters email adress")
    public void the_user_enters_email_adress() {

    }
    @When("the user enters Company")
    public void the_user_enters_company() {

    }
    @When("the user enters Title.")
    public void the_user_enters_title() {

    }
    @When("the user click that im not a robot")
    public void the_user_click_that_im_not_a_robot() {

    }
    @Then("the user clicks on submit button")
    public void the_user_clicks_on_submit_button() {

    }
}
