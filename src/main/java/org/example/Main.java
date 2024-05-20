package org.example;

@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
    void show(int i);
}

@FunctionalInterface
interface C{
    void add(int x,int y);
}

@FunctionalInterface
interface D{
    int mult(int x,int y);
}

public class Main {

    // Types of interface :
    // Normal : at least 2 methode
    // Functional or SAM (Single Abstract Methode) : one methode
    // Marker (no methode blank interface) : zero methode
    public static void main(String[] args) {
        A obj = () -> System.out.println("In show !");
        obj.show();

        B objB = n-> System.out.println("In B show receiving : "+n);
        objB.show(78);

        C objC = (a,b)-> System.out.println("In C add("+a+","+b+") = "+ (a+b));
        objC.add(7,8);

        D objD = (a,b) -> a*b;
        int result = objD.mult(7, 8);
        System.out.println(result);


    }
}
