package com.ironhack.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeywordCheckerTest {
    KeywordChecker checker = new KeywordChecker();
    @Test
    public void shouldReturnTrueWhenKeywordExists(){
        assertTrue(checker.containsJavaKeyword("Don't break my heart"));
    }
    @Test
    public void shouldReturnFalseWhenKeywordDoesNotExist(){
        assertTrue(checker.containsJavaKeyword("Theres no keyword here"));
    }
    @Test
    public void shouldReturnFalseWhenKeywordExistsPartially(){
        assertTrue(checker.containsJavaKeyword("Lets breakdance"));
    }
}
