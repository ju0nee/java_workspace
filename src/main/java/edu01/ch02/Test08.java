package edu01.ch02;

public class Test08 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 비교 연산자 : 값의 결과 true/false 중 하나, '~인지 아닌지' 판단시 사용
        System.out.println(a > b); // a 가 b 보다 큰 값인지 판단
        System.out.println(a < b); // a 가 b 보다 작은 값인지 판단
        System.out.println(a >= b); // a 가 b 보다 크거나 같은 값인지 판단
        System.out.println(a <= b); // a 가 b 보다 작거나 같은 값인지 판단
        System.out.println(a == b); // a 와 b 가 같은 값인지 판단
        System.out.println(a != b); // a 와 b 가 다른 값인지 판단

        // 부호 연산자 : 부호 지정하기 위해서는 기본적으로 데이터를 int 타입으로 저장해야 함 => 에러 발생 시 데이터 타입 int로 변환해보자
        int c = +10; // 변수 c 에 대한 데이터 값을 양수 10으로 지정
        int d = -10; // 변수 d 에 대한 데이터 값을 음수 10으로 지정
        int e = +a; // 변수 e의 값은 양수 10
        int f = -d; // 변수 f의 값은 양수 10
    }
}
