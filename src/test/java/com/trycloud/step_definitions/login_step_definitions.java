package com.trycloud.step_definitions;

import com.trycloud.pages.Login_pages;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_step_definitions {
    Login_pages login_pages = new Login_pages();

    @Given("user on the login page")
    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user use username {string} and password “Userpass123\"")
    public void user_use_username_and_passcode_userpass123(String string) {
        login_pages.userName.sendKeys(string);
        login_pages.password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        login_pages.loginButton.click();
    }


    @Then("verify the user should be at the {string} page")
    public void verifyTheUserShouldBeAtThePage(String expected) {
        String  expected1="dashboard";

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expected1));
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expected));

    }



}
