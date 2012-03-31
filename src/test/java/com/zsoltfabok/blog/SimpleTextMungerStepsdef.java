package com.zsoltfabok.blog;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class SimpleTextMungerStepsdef {

    private SimpleTextMunger simpleTextMunger;
    private Munger munger;
    private SentenceHelper sentenceHelper;
    private String result;
    private String inputWord;
    private String mungedWord;

    @Given("^I have a mocked munger which always returns \"([^\"]*)\" for \"([^\"]*)\"$")
    public void I_have_a_mocked_munger_which_always_returns_(String munged, String word) {
        munger = mock(Munger.class);
        inputWord = word;
        mungedWord = munged;
    }

    @Given("^I have an instance of my class$")
    public void I_have_an_instance_of_my_class() {
        sentenceHelper = new SentenceHelper();
        simpleTextMunger = new SimpleTextMunger(sentenceHelper, munger);
    }


    @When("^I call my method with \"([^\"]*)\"$")
    public void I_call_my_method_with_(String word) {
        when(munger.munge(inputWord)).thenReturn(mungedWord);
        result = simpleTextMunger.execute(word);
    }

    @Then("^I receive \"([^\"]*)\"$")
    public void I_receive_(String expectation) {
        assertEquals(expectation, result);
    }
}
