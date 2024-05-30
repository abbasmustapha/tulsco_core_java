package org.example;

import java.io.IOException;

class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {

            System.out.println("Hi : "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {

            System.out.println("Hello : "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {

    public static void main(String[] args) throws IOException {

        A a = new A();
        B b = new B();

        System.out.println(a.getPriority());
        System.out.println(b.getPriority());

        a.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) { throw new RuntimeException(e); }
        b.start();

    }
}
