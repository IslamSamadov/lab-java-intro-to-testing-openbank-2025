package com.ironhack.test;

import java.util.Arrays;
import java.util.List;

public class KeywordChecker {
    private static final List<String> keywords = Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
            "class", "const", "continue", "default", "do", "double", "else", "enum",
            "extends", "final", "finally", "float", "for", "if", "goto", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new",
            "package", "private", "protected", "public", "return", "short", "static",
            "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while"
    );
    public boolean containsJavaKeyword(String input) {
        if (input == null) return false;
        String[] words = input.split("\\W+");
        for (String word : words) {
            if(keywords.contains(word)){
                return true;
            }
        }
        return false;
    }
}
