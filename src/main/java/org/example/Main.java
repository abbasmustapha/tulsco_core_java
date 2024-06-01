package org.example;

sealed class A permits B,C{}   // la class A est sealed et B et C peuvent en heriter pas D
non-sealed class B extends A{}      // comme B etend une class sealed, elle doit être final ou sealed ou non-sealed
sealed class C extends A permits D{}     // comme C etend une class sealed, elle doit être final ou sealed ou non-sealed
final class D extends C {}

public class Main {

    public static void main(String[] args)  {

        System.out.println("Coucou");
     }
}
