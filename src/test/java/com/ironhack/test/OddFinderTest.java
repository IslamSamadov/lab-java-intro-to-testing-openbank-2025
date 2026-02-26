package com.ironhack.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddFinderTest {
    @Test
    public void testGetOddsUpToFive() {
        OddFinder finder =  new OddFinder();
        int[] nums = {1,3,5};
        assertArrayEquals(nums,finder.getOddNumbers(5));
    }
    @Test
    public void testGetOddsWithEvenInput(){
        OddFinder finder = new OddFinder();
        int[] nums = {1,3,5};
        assertArrayEquals(nums,finder.getOddNumbers(6));
    }
}
