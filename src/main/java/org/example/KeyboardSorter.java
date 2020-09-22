package org.example;

import java.util.Scanner;

public class KeyboardSorter extends Sorter{

    @Override
    public double[] init() {
        Scanner tastatura = new Scanner(System.in);
        System.out.println("Dati lungimea sirului");
        int lungime = Integer.parseInt(tastatura.nextLine());
        double[] sir = new double[lungime];
        for(int i = 0; i< lungime; i++){
            System.out.println("Dati elementul " + (i+1));
            sir[i] = Double.parseDouble(tastatura.nextLine());
        }
        return sir;
    }
}
