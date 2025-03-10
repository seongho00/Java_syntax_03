package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int person2_num = 1;
        int person2_age = 15;
        int person2_height = 170;
        // 변수 이름으로 정보 전달
        // Stack영역 메모리를 많이 잡아먹음


        int[] person1 = new int[3];
        person1[0] = 1;
        person1[1] = 12;
        person1[2] = 160;
        // 변수이름을 통한 정보전달이 안 됨. + 실수 & 문장 표현도 힘듬(타입의 다양성)
        // 만들어진 객체 : 인스턴스 / 객체 안의 변수처럼 동작하는 공간 : 인스턴스 변수
        // 클래스 == 설계도 == 인스턴스 설계도 == 객체 설계도

        // 지역변수의 죽음 : 함수의 끝
        // 인스턴스 변수의 죽음 : 인스턴스 끝
        // 인스턴스(객체)의 죽음 : 고립될 때


        // 사용자 정의 객체 만들기 -> 객체 설게도 필요 = 클래스
        철수 a = new 철수(); // 객체 이름 : 철수 / 변수 a
        a.이름 = "김철수"; // a를 통해 철수라는 객체 안의 이름이라는 변수 안에 김철수를 넣음.
        a.나이 = 23;
        a.키 = 170.5;

        // 예시
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[7];
        // 1차원 배열
        arr[0] = 1;
        arr[1] = 2;
        //...


        int[][] arr2 = new int[2][3];
        // 2차원 배열  / 3개씩 2묶음
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        //...
        arr2[1][2] = 6;


    }
}

class 철수 {
    String 이름; // 객체 안에 '이름'이라는 공간을 만듬
    int 나이;
    double 키;
}




