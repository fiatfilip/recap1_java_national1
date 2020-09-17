package org.example;

public abstract class Sorter {
    public abstract double[] init();

    public double[] getSortedArray(){
        double[] array = init();
        // algoritmul de sortare
        boolean isSorted = false;
        while(isSorted == false){
            isSorted = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    double temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
        }

        return array;
    }

    public void printArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
