package com.company;

import com.company.DmbCellPhone_Child;

public class DmbCellPhone_Child extends CellPhone_Parent {
    //필드
    int channel;

    //생성자
    DmbCellPhone_Child(String model, String color, int channel){
        this.model = model; //CellPhone으로 상속 받은 필드
        this.color = color; //CellPhone으로 상속 받은 필드
        this.channel = channel;
    }

    //메소드
    void trunOnDmb(){
     System.out.println("채널 " + channel + "번으로 DMB방송수신 시작");
    }
    void changeCannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널 " + channel + "번으로 바꾼댱!.");
    }
    void turnOffDmb(){
        System.out.println("DMB방송을 멈춘당!");
    }
}