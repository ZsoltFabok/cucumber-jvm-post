package com.zsoltfabok.blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleTextMunger {

    private final SentenceHelper sentenceHelper;
    private final Munger munger;

    @Autowired
    public SimpleTextMunger(SentenceHelper sentenceHelper, Munger munger) {
        this.sentenceHelper = sentenceHelper;
        this.munger = munger;
    }

    public String execute(String sentence) {
        List<String> words = sentenceHelper.split(sentence);
        for (int i = 0; i < words.size(); i++) {
            words.set(i, munger.munge(words.get(i)));
        }
        return sentenceHelper.join(words);
    }
}
