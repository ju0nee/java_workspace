package edu01.ch02;

public class Test10 {
    public static void main(String[] args) {
        boolean isOn = true;
        isOn = !isOn; //부정 연산자(!)
        System.out.println(isOn);
        // 연산 대상이 true이면 false로 변환하고, false이면 true로 변환하는 기능
        // 변수에 직접 사용 & 조건식에서 사용 모두 가능
    }
}
