package edu01.ch02;

public class Test11 { // Test12 포함
    public static void main(String[] args) {
        int a = 0b00001100; // 2진수(4 바이트) 표현 시 0b로 시작
        int b = 0b11110100; // * -12가 나와야 하는데 왜 값이 저렇게 나오지?
        // 2진수 형태 : 0b + 0/1(양수/음수) + 0000 ... 111
        // 음수 값 표현 시 양수의 비트 값을 반대로 적은 뒤(0의 자리에 1을 넣는다) 끝자리에 1을 더하면 값이 나온다

        int c = 017; // 8진수는 '0'으로 시작
        int d = 0xf; // 16진수는 '0x'로 시작

        System.out.println(a); // 10진수로 출력
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
