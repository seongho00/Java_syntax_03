package org.example;

import java.io.CharArrayReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;


class Main {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}

class 오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다."); // 수정할 때 용이함.
    }
}

class 흰오리 extends 오리 {

}

class 청둥오리 extends 오리 {

}

class 고무오리 extends 오리 { 
    // 메서드 재정의 라고 합니다. 
    // 메서드 오버라이드 라고도 합니다. : 덮어쓰기 (똑같이 써있는데 다른 기능) : 다형성
    // 메서드 재정의 => 부모가 물려준 능력을 다시 구현한다.
    void 날다() {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
}

class 고무2오리 extends 오리 {
    void 날다() {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
}
// 다중상속은 불가능.
// 복잡한 상속도 좋지 않음.
// 애매한 상황이 만들어지기 때문