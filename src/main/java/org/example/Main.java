package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        계산기.합(); // 30 출력
        System.out.println(a + b); // a, b는 합() 함수가 끝날 떄 죽기 때문에 사용 불가능

        개선된계산기.합(10, 20); // 소괄호 : 요청사항 : 인자, 인수, argument
        개선된계산기.합(30, 40); // 출력 : 70
        개선된계산기.합(true, 40); // 타입이 맞아야 함
        개선된계산기.합(30, 40, 100); // 개수가 맞아야함
        System.out.println(a + b); // 매개변수도 지역변수이기 때문에 함수가 끝날 때 죽음.

    }
}

class 계산기 {
    static void 합() {
        int a = 10; // 지역변수
        int b = 20;
        System.out.println(a + b);
    }
}

class 개선된계산기 {

    static void 합(int c) { //"합()" : 매서드 시그니쳐 가 다르면 다른 함수
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    static void 합(int a, int b) { // 매개변수 (함수의 내부와 외부의 매개체) / 지역변수의 일종

        System.out.println(a + b);

    }
    // method over loading(다형성)
    // 다형성 : 오버 라이딩 , 오버로딩
}