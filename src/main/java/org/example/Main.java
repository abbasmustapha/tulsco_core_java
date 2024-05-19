package org.example;



abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Car playing music");
    }
}

class WagonR extends Car{

    @Override
    public void drive() {
        System.out.println("WagonR driving ");
    }
}


public class Main {
    public static void main(String[] args) {

        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();

    }


}

