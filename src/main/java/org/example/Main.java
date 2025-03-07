package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split("");
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i].charAt(0))) {
                arr[i] = arr[i].toLowerCase();
                result += arr[i];
            } else if (Character.isLowerCase(arr[i].charAt(0))) {
                arr[i] = arr[i].toUpperCase();
                result += arr[i];
            }
        }

        System.out.println(result);
    }
}
// 노션
