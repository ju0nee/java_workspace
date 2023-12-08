package edu01.ch01;

public class Test01 {
    public static void main(String[] args) {

        System.out.println("Hello!");

        char c = '\u0057';
        System.out.println(c);
        // char : 문자 타입, 2 바이트
        // 문자 한 글자만 저장 가능, 값을 표현할 때 반드시 ''로 감싸줘야 함
        // char 표현 시 유니코드를 직접 입력 가능

        boolean isMarried = false;
        if (c == '\u0057') {
            isMarried = true;
        }
        System.out.println(isMarried);
        // boolean: 논리 타입, 1 바이트
        // true/false(예약어: 이미 해당 단어에 의미가 정해져 있어 변수 등으로 사용 불가) 둘 중 하나만 출력 가능
        // 이진 탐색 등에 사용

        String greeting = "Good Morning!";
        System.out.println(greeting);
        // String : 문자열 타입, 문자열의 시작과 끝 ""로 감싸줘야 함

    }
}
