package org.example;

import java.util.Scanner;


class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //입력하는 참조타입

        int num = sc.nextInt(); // 정수 입력 가능
        // 정수를 입력하지 않을 경우 , inputmismatchexception 오류 뜸

        String s = sc.nextLine();

        System.out.println(num);


    }
}
