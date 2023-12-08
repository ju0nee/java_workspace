package edu01.ch02;

public class Test15 {
    public static void main(String[] args) {
        char c = 'F';
        String gender = ( c == 'F') ? "여자" : "남자";
        // 삼항 연산자: 조건식 지정하여 조건식이 true일 때와 false일 때 서로 다른 명령을 실행하는 연산자
        // 변수 = 조건 ? 명령1 : 명령2
        // 조건: true/false 값 또는 결과값이 나오는 비교 연산식
        // 명령1: true일 때 실행하는 명령 / 명령2: false일 때 실행하는 명령
        System.out.println(gender);
    }
}
