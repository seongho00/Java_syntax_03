package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        MyClass a = new MyClass();
        a.hi();

        new MyClass().hi();

        // hi(); 메인 클래스에 없기 때문에 바로 호출 불가능

        funA(); //메인 클래스 안에 있기 때문에 실행 가능


        //1
        MyClass b = new MyClass();
        a.hi();
        a.bye();

        //2
        new MyClass().hi();
        new MyClass().bye();

        //3
        MyClass.hi();  //static 객체화 없이 설계도의 함수를 바로 쓴다.
        MyClass.bye(); //static 함수가 아니기 때문에 불가능
        

    }

    static void funA() {
        System.out.println("funA 실행됨");
    }
}



class MyClass {
    // static : 객체화 하지 않고 쓰겠다, 설계도 차원에서 기능 뽑아서 쓴다.
    //그럼 static을 하지 않을 이유가 있나?
    static void hi() {
        System.out.println("hi 실행됨");
    }

    void bye() {
        System.out.println("bye 실행됨");
    }
}
