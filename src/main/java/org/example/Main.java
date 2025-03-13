package org.example;

import java.io.CharArrayReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;

//생성자

class Main {
    public static void main(String[] args) {
        사람 사람1 = new 사람();
        사람1.이름 = "김철수";
        사람1.나이 = 22;
        System.out.println("===사람1 정보===");
        System.out.println("이름 : " + 사람1.이름); // 김철수
        System.out.println("나이 : " + 사람1.나이); // 22

        사람 사람2 = new 사람("이영희", 33);
        System.out.println("===사람2 정보===");
        System.out.println("이름 : " + 사람2.이름); // 이영희
        System.out.println("나이 : " + 사람2.나이); // 22
        
        사람 사람3 = new 김철수();
        System.out.println("===사람1 정보===");
        System.out.println("이름 : " + 사람3.이름); // 김철수
        System.out.println("나이 : " + 사람3.나이); // 22
    }
}

class 사람 {
    String 이름;
    int 나이;
    // int 나이 = 22;
    
    사람(String name, int age) {
        this.이름 = name;
        this.나이 = age;
    } // 오버로딩 : 다형성
    
    
    사람() {
        this.나이 = 22; // 나이 22로 고정
        System.out.println("사람 생성자 실행됨"); // 부모가 먼저 실행 / 부모만 있어도 실행됨.
    } // 기본생성자

}

class 김철수 extends 사람{
    김철수() {
        System.out.println("김철수 생성자 실행됨"); // 그 후 자식 생성자 실행 / 자식만 있어도 실행됨.
        this.이름 = "김철수"; // 상속받았기 때문에 선언 없이 사용 가능.
    }
}


// break point 디버그 메인함수로 동작하면 하나씩 코드를 볼 수 있음.
//기능 참고 : intelliJ break point, debug mode