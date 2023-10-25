package com.step_definitions;

import com.utilities.BrowserUtilities;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.joda.time.convert.Converter;
import org.junit.Assert;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


public class Login_StepDef {
    com.pages.Login page = new com.pages.Login();
    @Given("User open browser")
    public void userOpenBrowser() {
        Driver.getDriver().get("https://www.hudl.com/");
    }
    @And("User click Accept All Cookies")
    public void userClickAcceptAllCookies() {
        BrowserUtilities.waitFor(1);
        BrowserUtilities.click(page.cookies);
        BrowserUtilities.waitFor(1);
        BrowserUtilities.click(page.allowAll);
    }
    @When("User click Log in")
    public void userClickLogIn() {
        BrowserUtilities.click(page.logIn);
    }
    @And("User click {string}")
    public void userClick(String arg0) {
        BrowserUtilities.waitForVisibility(page.hudl,1);
        BrowserUtilities.click(page.hudl);
    }
    @When("User enter email")
    public void user_enter_email() {
        page.email.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("User enter password")
    public void user_enter_password() {
        String password = ConfigurationReader.getProperty("password");

// Decode the Base64-encoded password
        byte[] decodedPasswordBytes = Base64.getDecoder().decode(password);
        String decodedPassword = new String(decodedPasswordBytes);

// Send the decoded password to the web page
        page.password.sendKeys(decodedPassword);
    }
    @Then("User verify error message {string}")
    public void user_verify_error_message(String expectedLoginAssertion) {
        BrowserUtilities.waitForVisibility(page.errorMessage,4);
        String actualErrorMessage=page.errorMessage.getText();
        System.out.println("Error Message is "+actualErrorMessage);
        BrowserUtilities.waitForVisibility(page.errorMessage,4);
        Assert.assertEquals(expectedLoginAssertion,actualErrorMessage);
    }
    @When("User enter email {string}")
    public void user_enter_email(String email) {
        page.email.sendKeys(email);
    }
    @Then("User enter password {string}")
    public void user_enter_password(String string) {
        page.password.sendKeys(string);
    }

    @Then("User verify successfully Log in")
    public void userVerifySuccessfullyLogIn() {
        BrowserUtilities.waitFor(2);
        String actualLoginAssertion=Driver.getDriver().getCurrentUrl();
        String expectedLoginAssertion="https://www.hudl.com/home";
        Assert.assertEquals(expectedLoginAssertion,actualLoginAssertion);
    }
    @And("User click the log Out")
    public void userClickTheLogOut() {
        BrowserUtilities.waitFor(2);
        BrowserUtilities.clickWithJS(page.logout);
    }
    @Then("Close Browser")
    public void closeBrowser() {
        BrowserUtilities.waitFor(3);
        Driver.closeDriver();
    }
    @Then("User click continue")
    public void userClickContinue() {
        BrowserUtilities.click(page.continueButton);
    }
    @Then("User verify successfully Log Out")
    public void userVerifySuccessfullyLogOut() {
        String actualLogoutAssertion=Driver.getDriver().getCurrentUrl();
        String expectedLogoutAssertion="https://www.hudl.com/en_gb/";
        Assert.assertEquals(expectedLogoutAssertion,actualLogoutAssertion);
    }
}