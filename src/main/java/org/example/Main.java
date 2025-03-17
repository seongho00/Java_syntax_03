package org.example;


import java.awt.*;
import java.net.Inet4Address;
import java.util.*;
import java.util.List;


class Main {
    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(22);
        ages.add(33); //누구의 나이인지 모름

        ages.get(0);

        Map<String, Integer> agesMap = new HashMap<>(); // key, value 데이터
        agesMap.put("철수나이", 20); // 철수나이 : key / 20 : value
        agesMap.put("영희나이", 22);
        agesMap.put("영수나이", 33);

        agesMap.get("철수나이");


        Scanner sc = new Scanner(System.in);
        int a = 0;

        while (true) {
            try {
//            int a = sc.nextInt(); // 숫자만 입력할 수 있음 잘못 입력해도 작동하고 싶다면? try 함수
                a = sc.nextInt();
                sc.nextLine(); // 버퍼를 비운다.
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("똑바로 쓰기");
            }
        }

        //int 랑 라인

        System.out.println(a); // a 변수 선언이 안 될 수 있음. -> try 함수 밖에 선언

        sc.close();


    }
}
