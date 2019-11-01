/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meteergin.hackerrank.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mete.ergin
 */
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        Set<Integer> sockSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (sockSet.contains(ar[i])) {
                count++;
                sockSet.remove(ar[i]);
            } else {
                sockSet.add(ar[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] testArray = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(9, testArray));
    }
}
