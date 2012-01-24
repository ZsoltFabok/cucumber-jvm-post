package com.zsoltfabok.blog;

import org.springframework.stereotype.Component;

@Component
public class Munger {

    public String munge(String word) {
        if (word.length() < 3) {
            return word;
        } else {
            StringBuilder temp = new StringBuilder(word);
            temp = temp.reverse();
            return switchFirstAndLastCharacters(temp).toString();
        }
    }

    private StringBuilder switchFirstAndLastCharacters(StringBuilder word) {
        char lastCharacter = word.charAt(word.length() - 1);
        word.setCharAt(word.length() - 1, word.charAt(0));
        word.setCharAt(0, lastCharacter);
        return word;
    }
}
