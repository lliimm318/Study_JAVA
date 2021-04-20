package com.company;

public class Computer extends Calculator {
    @Override // 생략 가능 하지만 areaCircle() 메소드가 정확히 오버라이딩된 것인지 컴파일러가 체크
    double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
