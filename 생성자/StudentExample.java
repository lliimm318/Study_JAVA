package com.company;

public class StudentExample {
    public static void main(String[] args){
        Student student = new Student("임서영", "010 - 1111 - 1111", 15);
        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn);
        System.out.println("studentNum: " + student.studentNum);
    }
}
