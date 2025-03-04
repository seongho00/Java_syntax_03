package org.example;



class Main {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(10 + 10); // 20
        System.out.println(x + 10); // 20
        System.out.println("10" + 10); // 1010
        System.out.println("x" + 10); // x10
        System.out.println("10" + x); // 1010
        System.out.println("x : " + x * 5); // x * 5가 우선순위가 높기 떄문에 x : 50
        System.out.println("x : " + x + 5); // x : 105
        System.out.println("x : " + (x + 5)); // x : 15
        
        // 더할려면 같은 타입이여야 함
        // 문장 + 숫자 -> 숫자가 문자열로 바뀜 (문자열이 숫자를 포함하고 있기 떄문에)
        // 문장 + 문장 = 이어붙이기(문장문장)
    }
}