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
    static int index;


    ArrayList 사람인적사항 = new ArrayList();


    static {
        index = 0;
    }

    void add사람(String name, int age) {
        사람인적사항.add(index + 1);
        사람인적사항.add(name);
        사람인적사항.add(age);
        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", index + 1, age, name);

        index++;
    }

    사람 get사람(int index) {
        사람 get사람 = new 사람();

        get사람.name = (String) 사람인적사항.get((index - 1) * 3 + 1);
        get사람.age = (int) 사람인적사항.get((index - 1) * 3 + 2);
        get사람.num = (int) 사람인적사항.get((index - 1) * 3);
        return get사람;
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



