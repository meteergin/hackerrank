/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meteergin.hackerrank.solutions;

/**
 *
 * @author mete.ergin
 */
public class CountingValleys {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    static int countingValleys(int n, String s) {
        int down = 0;
        int up = 0;
        int valley = 0;
        String[] split = s.split("");
        for (int i = 0; i < n; i++) {
            String a = split[i];
            if (a.equals("D")) {
                down++;
            } else if (a.equals("U")) {
                up++;
                if (down - up == 0) {
                    valley++;
                }
            }

        }
        return valley;
    }
}
