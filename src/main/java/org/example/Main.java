package org.example;

import java.io.CharArrayReader;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        페라리 a페라리 = new 페라리();

        자동차 a자동차;

        // 자동형변환, 자동캐스팅
        // 자바가 판단하기에 안전한 경우만 자동형변환이 가능하다.
        // 리모콘의 버튼 개수를 줄이는 경우는 언제나 안전하다.
        a자동차 = a페라리;

        페라리 b페라리 = a자동차; // a자동차가 무슨 타입인지 컴파일러는 모른다.
        // a자동차가 페라리 클래스가 아닐 수도 있기 때문에 에러 발생.

        // 아래에서는 `a자동차`변수에 들어있던 리모콘에 `뚜껑이_열리다` 버튼이 추가된다.
        // 자바에서는 리모콘에 버튼이 빠지는건 상관하지 않지만 추가되는건 굉장히 무서워 한다.
        // 왜냐하면 추가된 버튼에 해당된 기능이 연결된 객체에 없을 수도 있기 때문이다. (위의 설명)
        // 그렇기 때문에 여기서는 무조건 수동형변환을 사용한다.
        // 수동형변환을 사용하는 이유는 자바에게 개발자의 의도(이게 실수가 아니라는 뜻)를 명확히 밝히는 것과 같다.
        페라리 a페라리2 = (페라리)a자동차;

        a페라리2.뚜껑이_열리다(); // 페라리 타입으로 되었기 때문에 함수가 추가됨?
    }
}
class 자동차 {
    void 달리다() {}
    void 서다() {}
}
class 페라리 extends 자동차 {
    void 뚜껑이_열리다() {}
}


//올바른 리턴타입으로 메서드를 만들어주세요
public class Main {
    public static void main(String[] args) {
        int i = 로봇.get정수();
        boolean b = 로봇.get논리();
        사람 a사람 = 로봇.get사람();
        사람 a사람2 = 로봇.get사람2();
        사람 a사람3 = 로봇.get사람3();
        사람 a사람4 = 로봇.get사람4();
        사람 a사람5 = 로봇.get사람5(123, false);
        로봇.get사람6(123, false); // 아무것도 하는 게 없는 코드

    }
}

class 로봇 {
    static int get정수() {
        return 0;
    }

    static boolean get논리() {
        return true;
    }

    static 사람 get사람() {
        return new 사람(); // 아무거나 리턴해줘도 됨.
        // return null; 가능
        
    }

    static 사람 get사람2() {
        사람 a사람 = null;
        return a사람; // null이 출력됨.
    }

    static 사람 get사람3() {
        사람 a사람 = new 사람();
        return a사람; // 객체 생성 및 연결
    }

    static 사람 get사람4() {
        return new 사람();
    }

    static 사람 get사람5(int 학번, boolean 출결) {
        사람 a사람 = new 사람();
        a사람.학번 = 학번;
        a사람.출결 = 출결;
        return a사람; // 값이 채워진 객체와 연결시킴.
    }

    static void get사람6(int 학번, boolean 출결) {

    }

}

class 사람 extends 로봇 {
    int 학번;
    boolean 출결;
}

