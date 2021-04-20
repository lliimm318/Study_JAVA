package com.company;

public class ComputerExample {
    public static void main(String[] args){
        int r =10;

        Calculator calculator = new Calculator();
        System.out.println("원의 넓이: " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원의 넓이: " + computer.areaCircle(r));
    }
}
