package org.example;


class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }


        int num = 0;

        while (num < 10) {

            if (num == 5) {
                break; // 반복문 탈출
            }

            System.out.println("num : " + num);

            num++;
        }
        // 0~4까지 출력

        while (num < 10) {

//            if (num == 5) {
//                break;
//            } // 0~4까지 출력

            System.out.println("num : " + num);

//            if (num == 5) {
//                break;
//            } // 0~5까지 출력

            num++;

//            if (num == 5) {
//                break;
//            } // 0~4까지 출력
        }
        // if문의 위치에 따라 출력 순서가 달라 출력이 달라짐.

        while (num < 10) {

            num++;

            if (num == 3) {
                continue; // 다시 조건식 체크로 넘어감스킵
            }
            System.out.println("num : " + num);
        }
        // brak , continue : 반복문 컨트롤

    }
}