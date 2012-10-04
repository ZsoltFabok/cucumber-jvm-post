package com.zsoltfabok.blog;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="classpath:simple_text_munger.feature")
public class SimpleTextMunger_Test {
}
