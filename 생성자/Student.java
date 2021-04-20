package com.company;

public class Student extends People{
    public int studentNum;

    public Student(String name, String ssn, int studentNum){
        super(name, ssn); // 부모 생성자 호출
        this.studentNum = studentNum;
    }
}
