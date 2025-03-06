package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        int b;

        sc.useDelimiter("-"); // - 기준으로 잘라서 입력 받겠다는 뜻


        String[] arr = a.split(":"); // arr 배열에다가 :를 기준으로 나누어 넣는다.
        arr[0].length(); // arr라는 이름의 배열에서 0번째의 길이

        a += "o".repeat(3); // o라는 문자를 3번 반복해서 넣겠다.

        int[] answer = new int [2]; // answer이라는 배열 안에 2개의 int 수를 넣겠다.

        Integer.parseInt("1"); //문자열을 정수로 변환

        String octal = Integer.toOctalString(a); // 10진법 숫자를 8진법으로 변환
        String hexaDecimal = Integer.toHexString(a); // 10진법 숫자를 16진법으로 변환
        String hexaDecimal = Integer.toHexString(a).toUpperCase(); // 10진법 숫자를 16진법으로 변환한 것을 대문자로 표시
        // a는 String type이여야 한다.

        int b =Integer.parseInt(a, x); // x진법(2,8,16)진법의 숫자를 10진법으로 변환
        // a 는 int type이여야 한다.

        char b = (char)(a); // int a 를 문자로 나타낸다.
        int b = (int)(a); // 문자를 숫자로 나타낸다.
    }
}