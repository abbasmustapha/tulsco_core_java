package org.example;


// class object

import java.util.Objects;

class Laptop{
    String model;
    int price;

    public boolean equalsm(Laptop that){
        return this.model.equals(that.model) && this.price== that.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}


public class Main {
    public static void main(String[] args) {

        Laptop obj1 = new Laptop();
        Laptop obj2 = new Laptop();

        obj1.model = "Dell";
        obj2.model = "Dell";
        //obj2.model = "Apple";

        obj1.price = 1000;
        obj2.price = 1000;
        //obj2.price = 1700;

        System.out.println(obj1.equals(obj2));


    }
}

