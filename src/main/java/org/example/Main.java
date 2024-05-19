package org.example;

import org.tools.*;


public class Main {
    public static void main(String[] args) {

        Calc calc = new Calc();
        AdvCalc advCalc = new AdvCalc();
        int r1 = advCalc.add(1, 2);
        int r2 = advCalc.sub(2, 3);
        int r3 = advCalc.mult(4, 5);
        int r4 = advCalc.div(12, 5);

        System.out.println( "r1:" +r1+"   r2:"+r2+"   r3:"+r3+"   r4:"+r4);

    }
}

