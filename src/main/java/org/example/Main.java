package org.example;

interface A
{
    void show();
    void config();
}

interface A2
{
    void show2();
    void montre2();
}

class B implements A, A2 {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void show2() {
        System.out.println("in show2");
    }

    public void montre2() {
        System.out.println("in montre2");
    }
}



public class Main {
    public static void main(String[] args) {

        B obj = new B();

        obj.show();
        obj.config();
        obj.show2();
        obj.montre2();
        }
}

