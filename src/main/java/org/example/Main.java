package org.example;

import java.util.Objects;

class Alien {

    private int id;
    private String name;

    public Alien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        return id == alien.id && Objects.equals(name, alien.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


record Alien2(int id, String name) {}

public class Main {

    public static void main(String[] args)  {

        System.out.println("Coucou");

        Alien a1 = new Alien(1,"premier");
        Alien a2 = new Alien(2,"second");
        Alien a3 = new Alien(2,"second");

        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a2.equals(a3));

        // même chose avec le record

        System.out.println("même chose avec le record : ");

        Alien2 b1 = new Alien2(1,"premier");
        Alien2 b2 = new Alien2(2,"second");
        Alien2 b3 = new Alien2(2,"second");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b2.name());

        System.out.println(b2.equals(b3));
     }
}
