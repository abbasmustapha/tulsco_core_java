package org.example;


// final
/*
    final variable : une fois affectée la valeur de la vaiable ne peut pas être modifiée (constante)
    final class    : la classe ne peut pas être étendue (extended) cela stoppe l'héritage
    final methode  : la méthode ne peut pas être re-definie (stoppe l'overriding)

 */
class Calc{

    public final void show(){
        System.out.println("in Calc show");
    }

    public void add (int n1, int n2) {
        System.out.println(n1+n2);
    }
}


class AdvClass extends Calc{
    /*
    // redefinition ci-dessous interdite
    public void show(){
        System.out.println("in AdvClass show");
    }

     */

}
public class Main {
    public static void main(String[] args) {

        final int num=8;
        // réaffectation ci-dessous interdite
        // num=12;
        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(7,9);


    }
}

