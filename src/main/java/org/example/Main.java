package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

// 삼항연산자

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 기본 문법
        int b = sc.nextInt();
        int a = b > 5 ? 5 : 0; // true 일 경우 a = 5 / false일 경우 a = 0

        System.out.println(a);

        //더 짧게 만들기
        int k = sc.nextInt();

        System.out.println(k % 2 == 0 ? 10 : 0); // k를 2로 나눴을 때 나머지가 0일 경우 10출력 / 0이 아닐경우 0출력


    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "ABCED";

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

    }
}


