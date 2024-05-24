package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("A que coucou combien ? ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        int num2 =0;

        BufferedReader br = null;
        try {
            System.out.println("donnez un autre nombre : ");

            br = new BufferedReader(new InputStreamReader(System.in));
            num2 = Integer.parseInt(br.readLine());
            System.out.println(num2);

        }
        finally {
           //  br.close();
        }

        int num3=0;

        try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("encore un nombre : ");
            num3 = Integer.parseInt(br2.readLine());
            System.out.println(num3);
        }


    }
}
