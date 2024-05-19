package org.example;

enum Status{
    Running, Failed, Pending, Success;
}

enum Laptop{
    MacBook(2000), Surface(1800), XPS(1600), Amstrad(1000), Goupil(2400), Comodore(500), oufiyey;

    private int price;

    Laptop() {
        price=10;
    }

    Laptop(int price) {
        this.price = price;
        System.out.println("in laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {

        int i = 5;
        Status s = Status.Running;
        System.out.println(s);

        for (Status value : Status.values()) {
            System.out.println(value + " ordinal : "+value.ordinal()+" name : "+value.name());
        }

        for (Laptop laptop: Laptop.values()){
            System.out.println(laptop + " : " + laptop.getPrice());
        }

    }
}

