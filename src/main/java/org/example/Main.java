package org.example;

// 문제 : 아래와 같이 출력해주세요.

//class Main {
//    public static void main(String[] args) {
//        System.out.println("8 * 1 = 8\n" +
//                "8 * 2 = 16\n" +
//                "8 * 3 = 24\n" +
//                "8 * 4 = 32\n" +
//                "8 * 5 = 40\n" +
//                "8 * 6 = 48\n" +
//                "8 * 7 = 56\n" +
//                "8 * 8 = 64\n" +
//                "8 * 9 = 72");
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//
//    }
//}

// 문제 : 아래와 같이 출력해주세요.
// 문제 : dan 변수의 값에 따라 첫번째로 곱하는 수가 변하게 해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 8;
//
//        System.out.println(dan + " * 1 = 8");
//        System.out.println(dan + " * 2 = 16");
//        System.out.println(dan + " * 3 = 24");
//        System.out.println(dan + " * 4 = 32");
//        System.out.println(dan + " * 5 = 40");
//        System.out.println(dan + " * 6 = 48");
//        System.out.println(dan + " * 7 = 56");
//        System.out.println(dan + " * 8 = 64");
//        System.out.println(dan + " * 9 = 72");
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}

// 문제 : 아래와 같이 출력해주세요.
// 문제 : dan 변수의 값에 따라 그에 해당하는 구구단이 출력 되도록 해주세요.

//class Main {
//    public static void main(String[] args) {
//        int dan = 9;
//
//        System.out.println(dan + " * 1 = " + dan * 1);
//        System.out.println(dan + " * 2 = " + dan * 2);
//        System.out.println(dan + " * 3 = " + dan * 3);
//        System.out.println(dan + " * 4 = " + dan * 4);
//        System.out.println(dan + " * 5 = " + dan * 5);
//        System.out.println(dan + " * 6 = " + dan * 6);
//        System.out.println(dan + " * 7 = " + dan * 7);
//        System.out.println(dan + " * 8 = " + dan * 8);
//        System.out.println(dan + " * 9 = " + dan * 9);
//
//        // 출력
//    /*
//    8 * 1 = 8
//    8 * 2 = 16
//    8 * 3 = 24
//    8 * 4 = 32
//    8 * 5 = 40
//    8 * 6 = 48
//    8 * 7 = 56
//    8 * 8 = 64
//    8 * 9 = 72
//    */
//    }
//}

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 2부터 9까지의 숫자를 사용하지 않고 구구단 출력을 완성 해주세요.

class Main {
    public static void main(String[] args) {
        int dan = 8;

        // 수정가능지역 시작
        int i = 1;

        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1;
        System.out.println(dan + " * " + i + " = " + dan * i);



        // 수정가능지역 끝

        // 출력
    /*
    8 * 1 = 8
    8 * 2 = 16
    8 * 3 = 24
    8 * 4 = 32
    8 * 5 = 40
    8 * 6 = 48
    8 * 7 = 56
    8 * 8 = 64
    8 * 9 = 72
    */
    }
}