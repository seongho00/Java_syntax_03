package org.example;

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

class Main {
    public static void main(String[] args) {

//        int lastID = 0; // 클래스쪽에 집어넣기
//        Article a1 = new Article();
//        lastID++;
//        a1.id = lastID;
//        System.out.println(a1.id);
//
//
//        Article a2 = new Article();
//        lastID++;
//        a2.id = lastID;
//
//
//        Article a3 = new Article(2, "2025-03-14 12:12:12");
//        lastID++;
//        a3.id = lastID;

        Article a1 = new Article();

        Article a2 = new Article();

        Article[] articles = new Article[3]; // 게시글 3개 다룬다

        articles[0] = a1;
        articles[1] = a2;
        System.out.println(articles[0].id);

        articles[2] = new Article(); // 배열로 한번에 여러 객체를 다룬다.


    }
}

class Article {
    static int lastId; // 클래스변수(정적변수) (클래스에 속함) : 모든 인스턴스가 공유함
    //객체생성과 무관 /공공자원

    static { //static 전용 생성자 / 프로그램 시작할 때 바로 작동
        lastId = 0;
    }

    Article() {
        this(lastId + 1, "2025-03-14 12:12:12"); // 반드시 첫번쨰 줄에 작성
        //다른 생성자 호출(실행), Constructor Call
        lastId++;

    }

    int id;
    String regDate;



    Article(int id, String regDate) {
        this.id = id;

    }
}


