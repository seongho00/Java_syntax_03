package org.example;



class Main {
    public static void main(String[] args) {
        int age = 10;

        System.out.println("당신의 나이 : " + age);

        if (age >= 20) { // 조건식 / True or False 가 나와야함 / 숫자가 아닌 논리를 담음.
            System.out.println("성인");
        }

        if (age <= 19) {
            System.out.println("미성년자");
        }
        // 조건문 안에 들어가는 연산자는 '비교 연산자'


        // 그리고(&&) / 또는(||)
        if (10 > 20 || 1 == 1 || 3 > 2) {
            System.out.println("실행됨"); // 실행됨
        }

        if (10 > 20 || 1 != 1 || 3 < 2) {
            System.out.println("실행됨"); // 실행되지 않음.
        }
        // 또는(||)은 True 하나라도 있을 시 True

        if (10 > 20 && 1 == 1 && 3 > 2) {
            System.out.println("실행됨"); // 실행되지 않음.
        }

        if (10 < 20 && 1 == 1 && 3 > 2) {
            System.out.println("실행됨"); // 실행됨
        }
        // 그리고(&&)는 False 하나라도 있을 시 False

        if (10 < 20 || 1 == 1 && 3 > 2) {
            System.out.println("실행됨"); // 실행됨
        }
        // 또는(||)과 그리고(&&)는 합쳐서 사용가능 앞에서부터 계산
    }
}