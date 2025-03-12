package org.example;

import java.io.CharArrayReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;


class Main {
    public static void main(String[] args) {
        무기 a = new 칼(); // 상속관계이기 때문에 가능
//        칼 b = new 무기(); // 불가능 / 무기가 부모이기 때문에

        무기 a무기 = new 칼(); // 강제 형변환 : 무기처럼 설계도를 가져감. (공격 함수 삭제)
        // 하지만, 공간만 있으면 함수 삭제가 안 됨.
        //

        a무기.공격();

        //예시
        double d = 1;
        System.out.println(d); // 1.0 : 자동 형변환이 일어남

        int i = (int) 1.5; // 강제 형변환
        System.out.println(i); // 1 출력

    }
}

abstract class 무기 {
    void 공격() {
        //어떤 내용을 적어도 칼에서 다시 재정의함.
        //구현하지 마세요. 로 적음. -> 문법으로 쓸려면?
    }

    abstract void 공격1(); // 추상 매서드 : 구현하지 않는 함수
    //하나라도 abstract 함수가 있으면 class도 abstract로 바꿔야함 (추상 클래스)
}

class 칼 extends 무기 { // 칼은 무기의 한 종류야
    void 공격1() { // 구상 매서드 : body부분을 구현할 수 있는 함수
        System.out.println("칼 공격"); // abstract 매서드는 오버 라이드가 필수가 된다.
    }
}

interface 무기2 { // 이 안에 든 함수는 모두 abstract 함수만 있다.
    abstract void 공격();

    void 방어(); // abstract 제거해도 무방
}

interface 무기3 { // 이 안에 든 함수는 모두 abstract 함수만 있다.
    abstract void 공격();

    void 방어(); // abstract 제거해도 무방
}

class 칼2 implements 무기2, 무기3 { // interface 클래스를 상속받을 때는 extends 대신 implements
    // 다중구현 가능 why? 오버라이드가 필수라서 애매한 상황이 나오지 않음.
    public void 공격() { // public도 필수

    }

    public void 방어() {

    }
}