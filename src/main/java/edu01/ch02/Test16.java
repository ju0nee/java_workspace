package edu01.ch02;

public class Test16 {
    // 데이터 타입 변경(type casting)
    public static void main(String[] args) {
        byte a = 23;
        int b = a;
        System.out.println(b); // 23 : 자동 타입 변경 (int로 변형되어 값 출력)

        byte c = 23;
        short d = 47;
        int e = 65;
        int f = c + d + e;
        System.out.println(f); // 135 : 자동 타입 변경(byte, short, int 값은 모두 int로 타입 변경되어 연산 수행

        int g = 23;
        byte h = (byte) g;
        System.out.println(h); // 23
        // 직접 타입 변경 : (데이터 타입)변수명 또는 값;

        byte i = 10;
        byte j = 20;
        byte k  = (byte) (i + j); // 데이터 직접 변환
        // 데이터 타입을 'byte'로 변환하지 않으면 오류 발생
        // 연산은 int 타입에서만 가능하므로 더하기 연산 수행을 위해 i와 j는 int 타입으로 변환, 따라서 연산 수행 후 다시 byte 타입으로 변환
        // i와 j는 괄호로 감싸 연산을 먼저 수행한 뒤 byte 타입으로 변환할 수 있도록
        System.out.println(k); // 30
    }
}
