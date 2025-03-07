package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //arr1 변수에 [true, false, true] 연결
        boolean[] arr1 = new boolean[3];
        arr1[0] = true;
        arr1[1] = false;
        arr1[2] = true;


        //arr2 변수에 [3.14, 7.77, 11.11] 연결
        float[] arr2 = new float[3];
        arr2[0] = 3.14f;
        arr2[1] = 7.77f;
        arr2[2] = 11.11f;

        //arr 변수에 [1~10] 연결
        int[] arr3 = new int[10];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
        }

        int[] sum = {arr1.length, arr2.length, arr3.length};


        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n===========");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n===========");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        // 이 3개를 반복문으로 묶고 싶은데

    }
}





