package com.company;

public class CellPhone_Parent {
    //필드
    String model;
    String color;


    //생성자


    //메소드
    void poewrOn() {System.out.println("전원을 킨당!");}
    void powerOff() {System.out.println("전원을 끈당!");}
    void bell() {System.out.println("벨이 울린당!");}
    void sendVoice(String message) {System.out.println("나: " + message);}
    void receiveVoice(String message) {System.out.println("상대: " + message);}
    void hangUp() {System.out.println("전화를 끊는당!!");}
}
