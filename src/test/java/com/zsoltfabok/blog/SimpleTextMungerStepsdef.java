package com.zsoltfabok.blog;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class SimpleTextMungerStepsdef {
	@Given("^I have an instance of my class$")
	public void I_have_an_instance_of_my_class() {
	    // Express the Regexp above with the code you wish you had
	}

	@Then("^I receive \"([^\"]*)\"$")
	public void I_receive_(String arg1) {
	    // Express the Regexp above with the code you wish you had
	}

	@When("^I call my method with \"([^\"]*)\"$")
	public void I_call_my_method_with_(String arg1) {
	    // Express the Regexp above with the code you wish you had
	}
}
