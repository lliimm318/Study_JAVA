package com.company;

public class DmbCellPhoneExample {
    public static void main(String[] args){
        //객체 생성
        DmbCellPhone_Child Phone_Child = new DmbCellPhone_Child("삼성", "하늘", 15);

        //CellPhone_Parent로부터 상속받은 필드
        System.out.println("모델: " +Phone_Child.model);
        System.out.println("색: " +Phone_Child.color);

        //DmbCellPhone_Child 필드
        System.out.println("채널: " + Phone_Child.channel);

        //CellPhone_Parent로부터 상속받은 메소드 호출
        Phone_Child.poewrOn();
        Phone_Child.bell();
        Phone_Child.sendVoice("여보세용");
        Phone_Child.receiveVoice("아니요 뚱인데여");
        Phone_Child.sendVoice("게살버거 하나만,,,");
        Phone_Child.hangUp();

        //DmbCellPhone 메소드 호출
        Phone_Child.trunOnDmb();
        Phone_Child.changeCannelDmb(5);
        Phone_Child.turnOffDmb();
    }
}