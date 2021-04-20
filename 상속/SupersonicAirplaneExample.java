package com.company;

public class SupersonicAirplaneExample {
    public static void main(String[] args){
        SupersonicAirplane s = new SupersonicAirplane();
        s.takeOff();
        s.fly();
        s.flyMode = SupersonicAirplane.SUPERSONIC;
        s.fly();
        s.flyMode = SupersonicAirplane.NORMAL;
        s.land();
    }
}
