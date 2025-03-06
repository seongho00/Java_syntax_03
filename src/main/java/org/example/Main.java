package org.example;

import java.util.Collection;
import java.util.Collections;

// 코드 100 1026번

import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-"); // - 기준으로 잘라서 입력 받겠다는 뜻
        int a = sc.nextInt(); // - 기호가 나오기 전까지 입력 진행
        int b = sc.nextInt(); // - 기호가 나오기 전까지 입력 진행
        int c = sc.nextInt(); // - 기호가 나오기 전 or 입력의 마지막 부분까지 진행
        System.out.println(a + "\n" + b + "\n" + c);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner a = sc.useDelimiter(":");
        String b = a.nextLine();
//        String[] arr = a.split(":");
        System.out.println(b);

    }
}


 코드100 1025번

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split("");

        for (int i = 1; i <= arr.length; i++) {
            String zero = "";
            for (int j = arr.length; j > i; j--) {
                zero += "0"; // 문자열은 더하기가 안 되나?
            }

            System.out.println("[" + arr[i - 1] + zero + "]");

        }
    }
}

 코드100 1024번

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("'"+ arr[i] + "'");
        }


    }
}



class Main {
    public static void main(String[] args) {


        String zero;
        zero = "0"; // 문자열은 더하기가 안 되나?
        System.out.println(zero);
        zero = zero + "0";
        System.out.println(zero);


    }
}