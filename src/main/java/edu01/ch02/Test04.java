package edu01.ch02;

public class Test04 {
    public static void main(String[] args) {
        // float, double: 실수 타입 - 소수점이 있는 숫자 표현시 사용
        float exchangeRate = 1136.50F; // float: 8 바이트, float 사용시 데이터 뒤에 'f'나 'F'를 붙여야 함
        double USDAmount = 600.50; // double: 4 바이트
        double KRWAmount = 682468.25;

        System.out.println(exchangeRate);
        System.out.println(USDAmount);
        System.out.println(KRWAmount);

    }
}
