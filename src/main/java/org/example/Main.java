package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

// 반복문 & 실수 추가적인 내용

public class Main {
    public static void main(String[] args) {
        
        double a = 3; // a = 3.0으로 대입됨
        double b = 3.3; // 실수는 근삿값으로 계산됨
        // 부동 소수점
        // 정수는 2로 나눠 2진법을 구함
        // 실수는 2로 곱하고 정수부분을 2진법으로 바꾸기 때문에 용량제한으로 정확하지 않음.
        // 즉, 실제로 보는 실수는 컴퓨터에서 다른 값일 수 있다.
        // 따라서, 정확한 값은 정수로 계산해야 한다.
        double b2 = b * 10; // 출력 : 33.0

        if (b2 == 33) {
            System.out.println("같음");
        } else
            System.out.println("다름");
        
        Scanner sc = new Scanner(System.in);
        int base = 3, exponent = 4;
        long result = 1;
        // 전위연산(--i), 후위연산(i--)
        int num1 = 1, num2, num3 = 1, num4;

        num2 = num1++; // num2에 값이 대입되고 num1이 증가
        num4 = ++num3; // num1의 값이 증가하고 num2에 대입
        System.out.println(num2);
        System.out.println(num4);

        for (; exponent != 0; --exponent) {

        }

    }
}




