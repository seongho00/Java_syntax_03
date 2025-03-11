package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;


// 1부터 n까지 소수의 갯수를 출력하는 함수 만들기

class Main {
    public static void main(String[] args) {
        boolean result = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(5);
        System.out.println("5은(는) 소수인가? : " + result);

        int rs = one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = one_to_n_prime_numbers_count(13);
        System.out.println("rs : " + rs);
        // rs :  6
        rs = one_to_n_prime_numbers_count(20); // 17 19
        System.out.println("rs : " + rs);
        // rs :  8

    }

    static int one_to_n_prime_numbers_count(int a) {
        int rs = 0;
        for (int i = 1; i <= a; i++)
            if (Math.isPrimeNumber(i)) {
                rs += 1;
            }
        return rs;
    }
}

class Math {
    static boolean isPrimeNumber(int a) {
        if (a == 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}










