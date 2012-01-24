package com.zsoltfabok.blog.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zsoltfabok.blog.SimpleTextMunger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class SimpleTextMungerTest {
    @Autowired
    private SimpleTextMunger simpleTextMunger;

    @Test
    public void shouldMungeASimpleWord() {
        assertEquals("wrod", simpleTextMunger.execute("word"));
    }
}
