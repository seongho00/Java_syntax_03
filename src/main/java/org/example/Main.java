package org.example;


class Main {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            int k = 1; // while문 안쪽에 있지 않으면 k가 4로 고정 떄문에 1번만 반복하게 됨.
            while (k <= 3) {
                System.out.println(k);
                k++;
            }
            i++;
        }


    }
}


class Main {
    public static void main(String[] args) {

        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= i; k++) { // 조건식에 i가 들어갈 수도 있음.
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 무슨 일이 발생하는지 글로 적기
        // 우선 i가 들어간 for문을 for_i, k가 들어간 for문을 for_k라 명명.
        // for_i 문에서 i가 1에서 시작된다.
        // for_i 문에서 i 가 1일 경우 for_k은 i가 1이기 떄문에 1번 반복한다.
        // 즉, "* "가 한 번 출력되고 for_k문을 나온다.
        // 그 후 for_i 문에 있는 ""(줄넘김)이 출력된 후 i 가 1증가한다.(i = 2)
        // 다시 for_i문이 작동하하는데 이는 i가 보다 row, 즉 4값보다 작기 때문에 for_i문을 실행한다.
        // i가 2인 상태에서 for_k문이 출력된다. 이 때, for_k문은 i보다 작거나 같은만큼 실행되기 떄문에
        // 2번 실행되며 "* "문자가 2번 출력된다
        // 이를 반복하여 i 가 row값인 4보다 클때까지 반복하여 (총 4번) 출력하게 된다.


    }
}


class Main {
    public static void main(String[] args) {

        // 2번
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }





        //3번
        for (int i = n-1; i >= 1; i--) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

