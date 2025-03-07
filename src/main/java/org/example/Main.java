package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //객체
        //프로그램 동작의 주체가 되는 요소
        // 유/무형을 가리지 않는다. 정도만 알아두기
        // 객체는 상태와 동작을 가진다. / 키워드 : oop 특징

        // int[] NumArr = new int[3] {10, 20 ,30};

        int[] arr; // 정수들만 들어갈 수
        // 있는 객체의 리모컨만 들어갈 수 있는 변수 arr 만들기
        arr = new int[3]; // 변수 arr 에 int[4](설계도}로 만든 객체의 리모컨을 넣겠다.
        ///변수는 상황에 따라 하나 이상이 들어갈 수 있을 줄 알았는데 아니다.

        // 기본 타입 : 직접 변수에 값을 담는다.
        // 참조 타입 : 레퍼런스(리모콘 주소)에 의해서 참조된다.

        //arr[0] = 10;
        //arr[1] = 20;
        //arr[2] = 30; // 반복문으로 변환 가능

        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i * 10;
            //같은 표현
            //for (int i = 0; i < arr.length; i++) {
            //arr[i] = (i+1) * 10;
            //}
        }

        // int sum = arr[0] + arr[1] + arr[2]; // 반복문으로 변환 가능
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);


        // int avg = sum / 3; // 3은 arr의 길이 이므로 arr.length로 변환 가능.
        int avg = sum / arr.length;


        System.out.printf("arr[0] : %d, arr[1] : %d", arr[0], arr[1]);


        // 지역변수는 process가 끝날 떄 자동으로 메모리가 반납이 된다. (stack 영역에 한해서)
        // heap 영역은 혼자가 될 떄 메모리 반납 (arr가 반납되면 혼자가 되어 자동으로 반납됨)
        // GC가 모아서 반납함
        // 쓰레기 값

        // 생명주기 대상 : 변수 & 객체

        int[] arr = new int[3]; // int 3개 12 int[] 8byte


        //지역변수
        //main 매서드 안쪽에 있는 변수

        int a = 10;
        int b = a; // 값복사

        int[] arr = new int[3]; // 배열(참조타입)
        // new : 객체 생성 키워드
        // int[3] : 정수를 3개 담을 수 있는 설계도
        // ✔ 실질적으로 arr 는 int 3개를 담은 객체를 컨트롤할 수 있는 변수.
        int[] arr2 = arr; // 주소 복사
        // int 값만 넣을 수 있음.
        // 총 3개를 만들었기 떄문에 arr[0]~arr[2]까지 넣을 수 있음.

        //자바의 타입(자료형)
        //   1. 기본
        //   2. 참조
        int a = 5; // 4byte
        String s = "Hello"; // 참조타입은 기본적으로 8byte
        //

        //참조 타입
        String a = "Hi";
        Scanner sc; //import가 필요한 참조타입

        //기본 타입
        byte bb = 40; // -128~ 127까지
        // 초과시 오류 :impatible type  타입이 맞지 않음
        // 메모리는 최대한 적게 쓰는 것

    }
}





