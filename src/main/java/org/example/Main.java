package org.example;


class A
{
    int age;
    public void show()
    {
        System.out.println("in show");
    }

    class B
    {
        public void config(){
            System.out.println("in config");
        }
    }

    static class C
    {
        public void affiche(){
            System.out.println("in affiche");
        }
    }
}
public class Main {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();  // on crée un objet de l'inner class à partir de l'objet outer class
        obj1.config();

        A.C obj2 = new A.C();  // comme C est static on n'a pas besoir de l'objet outer class pour l'instancier
        obj2.affiche();




    }


}

