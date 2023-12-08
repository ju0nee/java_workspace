package edu01.ch02;

public class Test03 {
    public static void main(String[] args) {
        // 정수를 표현하는 데이터 타입(메모리의 크기에 따라 구분)
        byte age; // 1 바이트
        short point; // 2 바이트
        int price; // 4 바이트
        long totalSales; // 8 바이트
        // 저장하는 데이터의 성격에 따라 4가지 타입 중에서 선택해서 사용할 경우 메모리 공간을 효율적으로 사용 가능

        age = 23;
        point = 32000;
        price = 350000;
        totalSales = 214783648L; // 메모리에 임시로 저장할 때 int 범위 벗어나는 큰 값인 경우 : long 타입으로 저장
        // 숫자 뒤에 'l' 이나 'L'을 붙여주면 long 타입으로 메모리에 임시 저장 완료
        // 참고: int 타입은 2147483647까지만 저장 가능

        System.out.println(age);
        System.out.println(point);
        System.out.println(price);
        System.out.println(totalSales);

    }
}
