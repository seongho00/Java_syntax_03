package org.example;


class Main {
    public static void main(String[] args) {
        int dan = 8;

        int i = 1;  // 1부터

        while (i <= 10) { //100까지
            System.out.println(dan + " * " + i + " = " + dan * i); // 이 코드를 반복
            System.out.println(10); // 10 3번 출력
            i++; // 1만큼 증가하면서
            // i += x // x만큼 증가하면서
        }
        // while 반복문 : 조건식이 참일 동안 계속 반복
        // 반복문의 3요소
        // 초기(값), (종료)조건, step(보폭, 방향)
        // i = 1;, 1 <= 100, i++;

        // step의 방향 : 증가하거나 감소하거나

        i = 10;

        while (i >= 5) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i--;
        }

        System.out.println("i : " + i);


    }
}