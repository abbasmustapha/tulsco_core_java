package org.example;

class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}

abstract class B
{
    public abstract void montre();
}
public class Main {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        // on redefinit une inner class sans nom donc anonymous
        A obj2 = new A(){
          public void show()
          {
              System.out.println("in new show");
          }
        };

        obj2.show();

        B objB = new B() {
            @Override
            public void montre() {
                System.out.println("suis dans B.montre !");
            }
        };

        objB.montre();

    }
}

