package org.example;

class A {
    public A() {
        System.out.println("suis dans constructeur de A !");
    }

    public A(int n) {
        System.out.println("suis dans constructeur de A n !");
    }
}

class B extends A {
    public B() {
        System.out.println("suis dans constructeur de B !");
    }

    public B(int n) {
        //super(n);
        this();
        System.out.println("suis dans constructeur de B n !");
    }
}
public class Main {
    public static void main(String[] args) {
        B obj = new B(9);
    }
}

