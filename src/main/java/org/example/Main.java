package org.example;

// 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.

class Main {
    public static void main(String[] args) {

        int age = 36;

        if (age < 10 && age > 0) { // 0 < age < 10 은 안되나
            System.out.println("유아/아동");
        } else if (age < 20 && age >= 10) {
            System.out.println("10대");
        } else if (age < 30 && age >= 20) {
            System.out.println("20대");
        } else if (age < 40 && age >= 30) {
            System.out.println("30대");
        } else {
            System.out.println("40대 이상");
        }

        // else if 일 경우 참일 경우 뒤의 else if 코드는 실행하지 않음. (동시에 여러 개가 참으로 나오지 않음.)
        // if 와  else if 는 한 덩어리 취급
        // else는 모든 조건이 맞지 않는 경우
        // ctrl + shift + f : 정렬

        if (age < 10) { // 0 < age < 10 은 안되나
            System.out.println("유아/아동");
        } else if (age < 20) {
            System.out.println("10대");
        } else if (age < 30) {
            System.out.println("20대");
        } else if (age < 40) {
            System.out.println("30대");
        } else {
            System.out.println("40대 이상");
        }
        // else if 이기 떄문에 참이면 아래 코드가 작동하지 않기 떄문에 잘 작동함.
        // if 만 사용한 문장보다 step이 적어짐.
    }
}