package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;


// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.숨쉬다();
    }
}

class 동물 {
    void 숨쉬다() {
        System.out.println("숨쉬다.");
    }
}

class 사람 extends 동물 {

}

//상속 개념

class 고양이 {
    void 울기() {}
    void 뛰기() {}
    void 먹기() {}
}

class 검은고양이 extends 고양이 { // 검은고양이가 고양이 클래스의 속성과 기능을 물려받는다.(포함한다.)
//    void 울기() {}
//    void 뛰기() {}
//    void 먹기() {}  포함되어 있음  / 기본기능
    void 때리기() {} // 고유기능
}
// 고양이 : 상위 클래스, 부모클래스
// 검은고양이 : 하위 클래스, 자식클래스

