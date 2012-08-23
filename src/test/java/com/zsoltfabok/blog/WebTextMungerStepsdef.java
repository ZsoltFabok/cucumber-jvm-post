package com.zsoltfabok.blog;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class WebTextMungerStepsdef {

    private EmbeddedTomcat tomcat = new EmbeddedTomcat();
    private WebDriver browser;

    @Given("^I am using Firefox browser for testing$")
    public void I_am_using_Firefox_browser_for_testing() {
        browser = new FirefoxDriver();
    }

    @Given("^the application is deployed$")
    public void the_application_is_deployed() {
        tomcat.deploy("munger");
    }

    @Given("^the embedded tomcat is running$")
    public void the_embedded_tomcat_is_running() {
        tomcat.start();
    }

    @Given("^I am on the home page")
    public void I_am_on_the_home_page() {
        browser.get(tomcat.getApplicationUrl("munger"));
    }

    @When("^I enter \"([^\"]*)\"$")
    public void I_enter_(String text) {
        browser.findElement(By.id("text")).sendKeys(text);
    }

    @When("^I press \"([^\"]*)\"$")
    public void I_press_(String buttonId) {
        browser.findElement(By.id(buttonId)).click();
    }

    @Then("^I see \"([^\"]*)\" as the munged text$")
    public void I_see_as_the_munged_text(String text) {
        assertEquals(text, browser.findElement(By.id("munged")).getText());
    }

    @Then("^I see \"([^\"]*)\" as the original$")
    public void I_see_as_the_original(String text) {
        assertEquals("(" + text + ")", browser.findElement(By.id("original")).getText());
    }

    @Then("I close the browser")
    public void I_close_the_browser() {
        browser.close();
    }
}
