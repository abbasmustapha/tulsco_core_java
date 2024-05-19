package org.example;

import org.other.A;


public class Main {
    public static void main(String[] args) {

        /* 7:03:37
                                PUBLIC          PRIVATE         PROTECTED           DEFAULT

        Same class              YES             YES             YES                 YES

        Same package            YES             NO              YES                 YES
        subclass

        Same package            YES             NO              YES                 YES
        non-subclass

        Different package       YES             NO              YES                 NO
        subclass

        Different package       YES             NO              NO                  NO
        non-subclass




         */

        A objA = new A();
        B objB = new B();

        System.out.println(objA.marks); // marks doit être public car pas dans le meme package
        System.out.println(objB.bmarks); // bmarks default accessible car dans le meme package

    }
}

