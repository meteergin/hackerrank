/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meteergin.hackerrank.solutions;

/**
 *
 * @author metee
 */
public class RepeatedString {

    static long repeatedString(String s, long n) {
        long count = 0;
        int stringLenght = s.length();

        long remainder = n % stringLenght;
        long loopCount = (n - (n % stringLenght)) / stringLenght;

        String[] split = s.split("");
        for (String a : split) {
            if (a.equals("a")) {
                count++;
            }
        }

        count *= loopCount;

        if (remainder != 0) {
            while (remainder > -1) {
                if (split[(int) remainder].equals("a")) {
                    count++;
                }
                remainder--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }
}
