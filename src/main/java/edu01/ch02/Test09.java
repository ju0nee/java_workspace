package edu01.ch02;

public class Test09 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        // 복합 대입 연산자
        a += b;
        System.out.println(a); // 12
        a -= b;
        System.out.println(a); // 10
        a *= b;
        System.out.println(a); // 20
        a /= b;
        System.out.println(a); // 10
        a %= b;
        System.out.println(a); // 0
    }
}
