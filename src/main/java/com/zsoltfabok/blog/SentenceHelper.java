package com.zsoltfabok.blog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SentenceHelper {

    private static final String SEPARATOR = " ";

    public List<String> split(String sentence) {
        List<String> words = new ArrayList<String>();
        for (String word : sentence.split(SEPARATOR)) {
            words.add(word);
        }
        return words;
    }

    public String join(List<String> words) {
        StringBuilder sentence = new StringBuilder();
        for (String word : words) {
            sentence.append(word).append(SEPARATOR);
        }
        return sentence.toString().trim();
    }
}
