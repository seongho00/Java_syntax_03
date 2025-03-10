package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        사람 a = new 사람();
        System.out.println(a.age); // 0
        System.out.println(a.name); // null
        System.out.println(a.isMarried); // true

        //키워드 자바 null
        //String 기본값 : null / 0과 다름 / 아예 비어있는 상태

        //객체 = 폴더
        //클래스의 구성요소
        //속성 (상태, 단순 데이터) - field(변수) / 넣는다
        //기능 (행동, 실행 데이터) - method(함수) / 실행한다

        a.introduce(); // introduce 실행됨
        // introduce에 age, name, isMarried 변수값이 없으므로 상관없이 출력됨.

        // 객체에 있는 introduce 기능 사용 / 동작버튼 누르기

        사람 b = new 사람();
        b.age = 24;
        b.name = "김철수";
        b.isMarried = true;
        b.introduce2();
        // a와 연결된 객체(인스턴스)의 introduce 메서드 안에서 같은 객체 내부의 필드(인스턴스 변수) 값 가져와
        // 키워드 : 자바 this
        사람 c = new 사람();
        c.age = 27;
        c.name = "홍길동";
        c.isMarried = false;
        c.introduce2();

        사람 d = new 사람();
        

    }
}


class 사람 {
    int age; // field (변수)
    String name;
    boolean isMarried = true; // 미리 값을 지정할 수 있음. // 이후에 덮어쓰기 가능

    void introduce() { // 함수 만들기
        System.out.println("introduce 실행됨"); // 변수와 상관없이 출력됨.
    }

    void introduce2() { // 함수 만들기
        int age = this.age; // 객체 변수는 this를 거쳐서 method에 도달 = 변화된 값을 감지함
        // scope가 달라서 age 변수는 겹치지 않음.
        // 객체 내부 리모콘 "this" / 시점에 따라 this 는 다르다.
        String name = this.name; // method가 끝날 시 사라지는 변수


        System.out.println("나이 : 23"); // 변수와 상관없이 출력됨.

        System.out.println("===자기소개===");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + this.age); // 바로 쓸 수 있음.
        System.out.println("결혼여부 : " + isMarried); // this 생략 가능하지만 최대한 붙이기

    }


}
