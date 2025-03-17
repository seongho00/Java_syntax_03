package org.example;

import com.sun.source.tree.WhileLoopTree;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.io.CharArrayReader;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// 문제 : 아래가 실행되도록 해주세요.
class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}

class 사람인력관리소 {
    int 마지막_사람번호;
//    사람 a사람0;
//    사람 a사람1;
//    사람 a사람2; // 문제점 : 사람이 늘어날 때마다 한 명씩 더 추가해야함.

    List<사람> 사람들 = new ArrayList<>();


    void add사람(String name, int age) {
        int 번호 = 마지막_사람번호;

        사람 a사람 = new 사람();
        a사람.age = age;
        a사람.name = name;
        a사람.num = 번호;

        사람들.add(a사람);


//        if (번호 == 1) {
//            a사람0 = a사람;
//        } else if (번호 == 2) {
//            a사람1 = a사람;
//        } else if (번호 == 3) {
//            a사람2 = a사람;
//        }


        마지막_사람번호++;


    }

    사람 get사람(int index) {
//        if (index == 1) {
//            return a사람0;
//        } else if (index == 2) {
//            return a사람1;
//        } else if (index == 3) {
//            return a사람2;
//        }
        return 사람들.get(index - 1);

    }
}

class 사람 extends 사람인력관리소 {
    int age;
    String name;
    int num;

    void 자기소개() {
        System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.num, this.name, this.age);
    }
}



