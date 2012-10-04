package com.zsoltfabok.blog;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="classpath:web_text_munger.feature")
public class WebTextMunger_Test {
}
