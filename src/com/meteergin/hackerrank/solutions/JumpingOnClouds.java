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
public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c) {
        int count = 0;
        int i = 0;
        int arraySize = c.length;
        while (i < arraySize) {
            if ((i + 2) < arraySize && c[i + 2] == 0) {
                count++;
                i += 2;
            } else if ((i + 1) < arraySize && c[i + 1] == 0) {
                count++;
                i++;
            } else if ((i + 1) < arraySize && c[i + 1] == 1) {
                i++;
            } else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] c = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(c));
    }
}
