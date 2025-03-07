package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


// 입력된 문자열 1개씩 출력하는 방법

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1번째 방법 (split, 반복문 활용)
        String a = sc.nextLine();
        String[] arr = a.split("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 2번째 방법 (for 반복문 간략화)
        for (char ch : a.toCharArray()) {
            System.out.println(ch);
        }
        //toCharArray() : a의 글자를 하나씩 나눠 배열을 만든다
        //char ch : a.toCharArray() : a를 통해 만든 배열을 하나씩 ch에 넣는다.
        //for (char ch : a.toCharArray()){} : a를 통해 만든 배열이 모두 ch에 들어갈 떄까지 글자 한개씩 반복한다.

        //3번째 방법 (charAt() 함수 활용)
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
        // a.charAt(i) : a에 담겨있는 문자 중 i번째에 있는 문자 하나를 출력한다.


    }
}

