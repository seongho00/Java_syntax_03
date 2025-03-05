package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char c = 'a';
        System.out.println(c);
        System.out.printf("%c\n", c); // %c : 문자열 서식 지정자

        int a = 97;

        System.out.printf("%d\n", a); // %d : 정수형 서식 지정자
        System.out.printf("%c\n", a); // 출력 : a
        // %d %f %c %s 정도만 알고 있기
        // %c : 정수를 문자로 -> 97: a / 65 : A / 98 : b 정도 알고 있기
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //입력하는 참조타입

        int num = sc.nextInt(); // 정수 입력 가능
        // 정수를 입력하지 않을 경우 , inputmismatchexception 오류 뜸

        String s = sc.nextLine();

        System.out.println(num);


    }
}