package org.example;


public class Main {
    public static void main(String[] args) {

        Calc calc = new Calc();
        AdvCalc advCalc = new AdvCalc();

        int r1 = calc.add(5,6);
        int r2 = calc.sub(7,3);
        int r3 = advCalc.multi(7,3);
        int r4 = advCalc.div(15,4);
        int r5 = advCalc.add(15,4);

        System.out.println("r1 = " + r1 +"   r2 = "+r2+"   r3 = " + r3 +"   r4 = "+r4+"   r5 = "+r5);

    }
}

