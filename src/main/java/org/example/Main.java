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
            } else
                arr[i] = arr[i].toUpperCase();

        }
        int k = 0;

        while (k < arr.length) {
            result += arr[k]; // 안으로 넣을 수 있겠다.
            k++;
        }
        System.out.println(result);
    }
}
// 노션
