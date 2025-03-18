package org.example;


import java.awt.*;

import java.net.Inet4Address;
import java.util.List;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");

        for (String inpuData : inputs) { //inputs 데이터 안의 요소만큼 반복
            System.out.println(inpuData);
        }

        //steam 문법

        long sum = Arrays.stream(inputs) // stream 쓰겠다 (스트림화)
                .peek(e -> System.out.println(e)) // 어떤 요소가 더해지는지 볼 수 있음
                .mapToLong(e -> Long.parseLong(e)) // e : element // 요소를 하나씩 꺼내 쓰곘다
                //mapping (matching시킨다.)
                .sum(); // 다 더한다.

        IntStream.range(1, 11) // 1에서 10까지
                .forEach(e -> {
                    System.out.println(e); // 요소마다 출력한다.
                });

        //-> 더 간단하게
        IntStream.range(1, 11)
                .forEach(System.out::println);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(arr)); // arr안의 요소를 확인할 때 쓰임

        int[] rsArr = Arrays.stream(arr)
                .map(e -> {
                    return e * 2;
                }).toArray(); // 배열로 다시 바꿔줘야함.

        // 더 간결하게
        int[] rsArr2 = Arrays.stream(arr)
                .map(e -> e * 2).toArray();


        rsArr2 = Arrays.stream(arr)
                .filter(e -> e % 2 == 0) // 조건을 만족하는 요소만 추출
                .map(e -> e * 2) // 추출한 요소를 2로 곱해
                .toArray(); // 배열에 담기

        List<Integer> rsAl = new ArrayList<>();

        for (int n : arr) if (n % 2 == 0) rsAl.add(n); //내용이 한줄이면 중괄호 없애도 됨.

        rsAl = Arrays.stream(arr)
                .filter(e -> e % 2 == 0) // 조건을 만족하는 요소만 추출
                .map(e -> e * 2) // 추출한 요소를 2로 곱해
                .boxed()  // Collectors.toList 사용 시 필요한 문법
                .collect(Collectors.toList()); // List 함수로 만들려고 할 때는 collect 사용


        sc.close();
    }
}