package org.example;

import java.io.CharArrayReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.나이 = 20;
        a사람.a팔 = new 팔(); // 객체 생성 주소를 넣기 위한 변수 이므로

        a사람.a팔.길이 = 10; // 타고 타고 가서 넣어야함.
    }
}

class 사람 {
    int 나이;
    팔 a팔; // 타입은 '팔'이 될 수밖에 없음.
}

class 팔 {
    int 길이;
}

// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.나이 = 20;
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();

    }
}

class 전사 {
    int 나이;
    무기 a무기;
}

class 무기 {

}

class 활 extends 무기 {

}

class 칼 extends 무기 {

}


// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.이름 = "철수";
        a전사.공격();

    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;


    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {
        a무기.작동(this.이름); // 변수 넣는거 익숙해지기
    }
}

class 무기 {
    void 작동(String name) {
    }

}

class 칼 extends 무기 {
    void 작동(String name) {
        System.out.println(name + "가 칼로 공격합니다.");
    }

}

class 활 extends 무기 {
    void 작동(String name) {
        System.out.println(name + "가 활로 공격합니다.");
    }

}


// 아래의 코드가 실행되도록 해주세요

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "진";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        //출력 : 진이 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        //출력 : 진이 칼로 공격합니다.
    }
}

class 전사 {
    //인스턴스 변수
    String 이름;
    int 나이;
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {
        System.out.println(this.이름 + "이 " + this.a무기.공격() + "로 공격합니다.");
    }

    void 공격2() {

        a무기.공격자이름 = this.이름;
        a무기.공격2();
    }
}

class 무기 {
    String 공격자이름;

    String 공격() {
        return "";
    }

    void 공격2() {

    }
}

class 칼 extends 무기 {
    String 공격() {
        return "칼";
    }

    void 공격2() {
        System.out.println(공격자이름 + "이 칼로 공격합니다.");
    }
}

class 활 extends 무기 {
    String 공격() {
        return "활";
    }
}



