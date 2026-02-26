package com.ironhack.test;

public class OddFinder {
    public int[] getOddNumbers(int n){

        int size = (n + 1) / 2;
        int[] odds = new int[size];
        int current = 1;

        for(int i = 0; i < size; i++){
            odds[i] = current;
            current += 2;
        }
        return odds;
    }
}
