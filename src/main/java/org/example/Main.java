package org.example;

class A {
    public A() {
        System.out.println("suis dans constructeur de A !");
    }

    public void show() {
        System.out.println("suis dans A.show() !");
    }
}


public class Main {
    public static void main(String[] args) {
        // anonymous object pas de nom de variable donc pas dans la stack just dans le heap !
        new A().show();

        // pareil mais avec nom de variable donc réutilisable et créé dans la stack
        A objA = new A();
        objA.show();
    }
}

