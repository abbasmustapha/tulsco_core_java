package org.example;



class A {
    public void show(){
        System.out.println("I am in A.show()");
    }
}

class B extends A{
    public void show(){
        System.out.println("I am in B.show()");
    }
}



public class Main {
    public static void main(String[] args) {

        B b = new B();

        b.show();

    }
}

