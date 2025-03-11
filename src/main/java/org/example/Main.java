package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;

// 문제 - 함수를 실행하면 값을 돌려주도록 만들어주세요.

class Main {
    public static void main(String[] args) {
        int 결과;

        결과 = 계산기.합(10, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 30

        결과 = 계산기.합(30, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 50

        결과 = 계산기.합(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 100

        결과 = 계산기.차(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : -40

        결과 = 계산기.곱(3, 7);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 21
    }
}

class 계산기{

    static int 합(int a, int b) {
        return a + b;
    }

    static int 차(int a, int b) {
        return a - b;
    }

    static int 곱(int a, int b) {
        return a * b;
    }
}


// 문제 - 1부터 n까지의 합을 반환하는 함수

class Main {
    public static void main(String[] args) {
        // 예시 시작
        int c = 20 + Math.더하기(10, 20);
        System.out.println(c);
        // 예시 끝

        int 결과1 = Math.oneToSum(3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 6

        int 결과2 = Math.oneToSum(10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55
    }
}

class Math {
    // static => 본사직원
    // static은 현재 클래스에 지금당장 존재한다.
    static int 더하기(int a, int b) {
        // 메인 메서드의 int c와 아래 int c는 전혀 관계가 없다.
        int c = a + b;

        // return 값의 타입과 함수명의 앞부분이 같아야 한다.
        // return => 변신
        return c;
    }

    static int oneToSum(int a) {
        int answer = 0;

        for (int i = 1; i <= a; i++) {
            answer += i;
        }
        return answer;
    }
}


// 문제 :  n부터 m까지의 합을 반환하는 함수

class Main {
    public static void main(String[] args) {
        int 결과1 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math {
    static int nToMSum(int a, int b) {
        int answer = 0;

        for (; a <= b; a++) {
            answer += a;
        }

        return answer;
    }
}

// 문제 : 일반변수에 값 할당과정 설명

class Main {
    public static void main(String[] args) {
        // 설명
        //정수만 담을 수 있는 x라는 이름의 변수 생성
        int x;

        // 설명
        //정수만 담을 수 있는 x라는 이름의 변수에 20이라는 값을 담기.
        x = 20;
    }
}


// 문제 : 레퍼런스변수에 값 할당과정 설명

class Main {
    public static void main(String[] args) {
        // 설명
        // 오직 자동차 객체와 이어주는 주소만을 담을 수 있는 a자동차라는 이름의 변수 생성
        자동차 a자동차;

        // 설명
        //자동차()라는 설계도를 통해 새로운 객체를 생성한 후 그 객체와 이어지는 주소를 a자동차라는 이름의 변수에 담기
        a자동차 = new 자동차();

        // 설명
        //a자동차라는 이름의 변수와 이어진 주소를 통해 자동차 객체 안에 있는 달리다()라는 이름의 함수 실행하기
        a자동차.달리다();

        // 모든 객체들은 서로를 평생 볼 수 없다.
        // 모든 객체들은 서로를 원격조종한다.
    }
}

// 자동차 설계도!, 절대 자동차가 아니다.!!!
class 자동차 {
    // 이 메서드(함수)의 2가지 용도
    // - ???
    // - ???
    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}


// 문제 : 레퍼런스변수에 값 할당과정 설명

// 과정설명
// 자동자 클래스를 만든다.
    // class 자동차 { }
// 자동차 클래스 안에 달리다라는 이름의 함수를 만들고 "자동차가 달립니다."문장을 출력하는 코드를 입력한다.
    // class 자동차 {
    //      void 달리다(){
    //          System.out.println("자동차가 달립니다.");
    //      }
    // }
// 오직 자동차 객체의 주소만 연결할 수 있는 a자동차라는 이름의 변수를 생성한다.
    // 자동차 a자동차;
// 자동차()라는 설계도를 이용해 새로운 객체를 만들고 이 객체를 연결하는 주소를 a자동차라는 이름의 변수에 넣는다.
    // a자동차 = new 자동차();
// a자동차라는 변수 안에 있는 주소를 통해서 객체 안에 있는 달리다()라는 이름의 함수 버튼을 눌러 실행한다.
    // a자동차.달리다()


class Main {
    // 메인 함수
    public static void main(String[] args) {
        // 설명
        // 오직 자동차 객체의 주소만 연결할 수 있는 a자동차라는 이름의 변수를 생성한다.
        자동차 a자동차;

        // 설명
        // 자동차()라는 설계도를 이용해 새로운 객체를 만들고 이 객체를 연결하는 주소를 a자동차라는 이름의 변수에 넣는다.
        a자동차 = new 자동차();

        // 설명
        // a자동차라는 변수 안에 있는 주소를 통해서 객체 안에 있는 달리다()라는 이름의 함수 버튼을 눌러 실행한다.
        a자동차.달리다();
    }
}

// class => 설계도, 틀(객체를 만들기 위한)
class 자동차 {
    // 달리다 함수/메서드
    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}



// 문제 : 사람을 말하게 해주세요.

class Main {
    public static void main(String[] args) {
        사람 a = new 사람();
        a.말하다();
    }
}

class 사람 {
    // 사람은 `말하다` 라는 기능을 가지고 있습니다.
    void 말하다() {
        System.out.println("사람이 말합니다.");
    }
}

// 문제 : 아래 코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        거북이 a거북이 = new 거북이();

        a거북이.걷다();
        // 출력 => 걷다
        a거북이.수영하다();
        // 출력 => 수영하다
    }
}

class 거북이{
    void 걷다(){
        System.out.println("걷다");
    }
    void 수영하다(){
        System.out.println("수영하다");
    }
}


// Main 클래스 안의 내용을 올바르게 수정해주세요.

class Main {
    public static void main(String[] args) {
        자동차 a자동차 = new 자동차();

        a자동차.달리다();
    }
}

class 자동차 {
    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}


// 문제 : 클래스 5개 이상 만들고 각각을 객체화 하여 메서드를 호출해주세요.

class Main {
    public static void main(String[] args) {
        class1 c1 = new class1();
        class2 c2 = new class2();
        class3 c3 = new class3();
        class4 c4 = new class4();
        class5 c5 = new class5();

        c1.호출();
        c2.호출();
        c3.호출();
        c4.호출();
        c5.호출();

    }
}

class class1 {
    void 호출(){
        System.out.println("class1 호출");
    }
}
class class2 {
    void 호출(){
        System.out.println("class2 호출");
    }
}
class class3 {
    void 호출(){
        System.out.println("class3 호출");
    }
}
class class4 {
    void 호출(){
        System.out.println("class4 호출");
    }
}
class class5 {
    void 호출(){
        System.out.println("class5 호출");
    }
}


class Main {

    public static void main(String[] args) {
        String msg = greet("Jin"); //greet라는 이름의 함수에 "Jin" 이라는 글자를 넣은 return 값을 msg 변수에 넣는다.
        System.out.println(msg); // 출력: "Hello, Jin!"

        Point point = createPoint(5, 10); //createPoint라는 이름의 함수에 정수 5와 10을 넣은 후 나온 return 값을 Point point 변수에 넣는다.
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");

        int[] evens = firstNEvenNumbers(5);
        //firstNEvenNumbers라는 이름의 함수에 정수 5를 넣은 후 나온 return 값을 정수만 넣을 수 있는 배열의 리모콘를 evens 변수에 넣는다.
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));

    }

    public static String greet(String name) { // 매개변수로 String을 받고 String 타입의 값을 output한다.
        return "Hello, " + name + "!"; // 받은 매개변수를 이용해 "Hello, " + 매개변수 값 + "!" 을 return한다.
    }

    public static Point createPoint(int x, int y) { // 매개변수로 2개의 정수를 받고 Point 타입의 값을 output한다.
        return new Point(x, y); // Point 타입에 x,y(매개변수)를 넣은 새로운 객체를 output한다.
    }

    public static int[] firstNEvenNumbers(int n) { // 매개변수로 1개의 정수를 받고 정수만 넣을 수 있는 배열 타입을 output한다.(return한다)
        int[] evenNumbers = new int[n]; // 받은 n(매개변수)만큼의 정수가 들어갈 수 있는 객체를 생성하고 그 리모콘을 evenNumbers 변수에 넣는다.

        for (int i = 0, num = 2; i < n; i++, num += 2) { // i가 0에서 n보다 클때 까지 1씩 증가하면서 반복한다. 반복하는 동안 num 변수 2부터 2씩 증가한다.
            evenNumbers[i] = num; // evenNumbers라는 배열 변수에 num변수를 넣는다.
        }
        return evenNumbers; // evenNumbers 값을 배열타입으로 output한다.
    }
}
