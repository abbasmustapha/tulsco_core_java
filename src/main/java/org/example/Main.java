package org.example;


class MabException extends Exception{

    public MabException(String s) {
        super(s);
    }
}

class A{

    public void show(B b, C c){
        try {
            b.showB();
        } catch (Exception e) {
            System.out.println("Pb dans showB:"+e);
        }
        try {
            c.showC();
        } catch (Exception e) {
            System.out.println("Pb dans showC:"+e);
        }
    }


}

class B{
    public void showB() throws Exception{
        int j = 8/0;
        System.out.println("Je suis dans B showB j="+j);
    }
}

class C{
    public void showC() throws Exception{
        int[] k = new int[3];
        System.out.println();
        System.out.println("Je suis dans C showC k[3]="+k[3]);
    }
}

public class Main {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        int[] nums = new int[5];

        try {
            j = 18 / i;
            if(j==0)
                throw new MabException("je veux pas de zero ! ");
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Limite index dépassée !"+e);
        }
        catch (MabException e) {
            j=18/1;
            System.out.println("suis dans catch MabException avec e = "+e+ " message : " + e.getMessage());
        }

        System.out.println(j);
        System.out.println("Bye");

        A a = new A();
        B b = new B();
        C c = new C();

        a.show( b, c);

    }
}
