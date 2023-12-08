package edu01.ch02;

public class Test07 {
    public static void main(String[] args) {
        int a = 10; // 변수 a를 선언하고 값을 10으로 초기화
        a++; // 변숫값을 1 증가 (후위)
        System.out.println(a); // 11
        ++a; // 변숫값을 1 증가 (전위)
        System.out.println(a); // 12

        int b = 10; // 변수 b를 선언하고 값을 10으로 초기화
        b--; // 변숫값을 1 감소 (후위) : 다른 명령문을 먼저 처리한 뒤 감소 연산 처리
        System.out.println(b); // 9
        --b; // 변숫값을 1 감소 (전위) : 감소 연산 처리한 뒤 다른 명령문 수행
        System.out.println(b); // 8

        int c = 10;
        int d = 10;
        System.out.println(++c); // 11 : c 에 대해 증가 연산 먼저 수행 뒤 출력
        System.out.println(d++); // 10 : d 에 대해 출력 명령문 먼저 수행한 뒤 증가 연산 수행
        // 출력되는 d 의 값은 10이지만 실제 d가 갖고 있는 데이터의 값은 11이다.
        System.out.println(d); // 11
    }
}
