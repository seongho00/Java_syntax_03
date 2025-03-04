package org.example;



// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.

class Main {
    public static void main(String[] args) {
        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
        // `int` => a라는 공간에는 정수만 담을 수 있다.
        // `;` => 문장이 끝남을 알린다.
        int a;
        a = 5;

        System.out.println(a);
        System.out.println(a + 10);

        int b = 10;

        // `+` => 문장과 문자을 합친다.
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        a = b; // b는 값인 10을 나타내기 때문에 a에 10이 대입됨.
        b = 5; // a 는 이미 10이라는 값으로 지정했기 때문에 b는 따로 5라는 값을 지정함.
        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}