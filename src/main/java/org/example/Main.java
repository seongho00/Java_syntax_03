package org.example;


class Main {
    public static void main(String[] args) {
        int i = 1;
        float a = 1.11f; // float 는 f를 붙여야 함.
        double b = 1.11;

        //증감 연산자

        i = i + 1; // 등호 왼쪽 i는 변수, 오른쪽 i 는 값(1) / i의 값을 1 증가시킨다.
        // 같은 함수 : i++;, i += 1;

        i = i - 1; // i--;, i -= 1;


    }
}



class Main {
    public static void main(String[] args) {

        String s = "8 * 1 = 8"; // 참조 타입(기본타입을 제외한 모든 타입)
        String s2 = "8 * 2 = 16\n";

        System.out.println(s + "\n" + s2);

        s = "8 * 1 = 8\n"; // 8 * 1 = 8\n
        s = s + "8 * 2 = 16\n"; // 8 * 1 = 8\n8 * 2 = 16
        s += "8 * 3 = 24\n"; // 8 * 1 = 8\n8 * 2 = 16\n8 * 3 = 24

        System.out.println(s);

    }
}



// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.
// 조건 : * 1000 까지 출력해주세요. (for, while 금지)

class Main {
    public static void main(String[] args) {
        int dan = 8;

        int i = 1;


        if (i <= 100) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }
        if (i <= 100) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }
        if (i <= 100) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }
        if (i <= 100) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }
        if (i <= 100) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }
        if (i <= 100) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }


    }
}