package org.example;


//모든 문제 for 로 다시 풀기

//문제 : 1부터 5까지 출력해주세요.

class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }
}

// 문제 : -100부터 25까지 출력해주세요.

class Main {
    public static void main(String[] args) {

        for (int i = -100; i <=25; i++){
            System.out.println(i);
        }

    }
}

// 문제 : 단을 `* 1000`부터 `* 1'까지 출력해주세요.

class Main {
    public static void main(String[] args) {
        int dan = 8;

        for (int i = 1000; i >= 1; i--) {
            System.out.println(dan + " *  " + i + " = " + dan * i);
        }

    }
}

// 문제 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.


class Main {
    public static void main(String[] args) {
        int dan = 8;

        for (int i = 1000; i >= -500; i--) {
            System.out.println(dan + " *  " + i + " = " + dan * i);
        }

    }
}

// 문제 1부터 5까지의 합을 출력해주세요.

class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <=5; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}


// 문제 -100부터 25까지의 합을 출력해주세요.

class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i =-100; i <=25;i++){
            sum += i;
        }

        System.out.println(sum);


    }
}

// 문제 1부터 3까지 출력하는 작업을 10번 해주세요 (2중 for문 사용)

class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 3;j++){
                System.out.println(j);
            }
        }
    }
}
