package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    int b = 20; //전역 변수 : 메소드 밖에 있는 변수
    static int a = 20; // 공용으로 사용 됨

    public static void main(String[] args) {
        System.out.println(a); // 출력 : 20
        // static은 static끼리만 연결할 수 있다.

        int a = 10;
        System.out.println(a); // 출력 : 10 


        개선된계산기.합(10, 20); // 소괄호 : 요청사항 : 인자, 인수, argument(args)

        int b = 개선된계산기.합(10, 20, 30); // 값이 output 된다.

    }
}

class 개선된계산기 {
    int a = 40;
    static void 합(int a, int b) {
        System.out.println(a + b);
        //void : output 하지 않겠다.
        return; // 즉시 함수 끝
    }

    static int 합(int a, int b, int c) {
        return a+b+c; // return : 리턴 스테이트먼트 / a+b+c : return value
        // a,b,c의 합을 남기겠다
    }
}

// 키워드 : 변수의 생명주기 / 변수의 스코프
// 리턴 타입
// 리턴
// 리턴 밸류