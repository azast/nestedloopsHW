package com.company;

public class Main {

    public static void main(String[] args) {

        //Homework 3
        int k = 0;
        int[] nums = {3,4,7,1};
        while(k < nums.length){
            int l = 0;
            while(l < nums.length){
                if(k!=l){
                    System.out.println(10*nums[k]+nums[l]);
                }
                l = l +1;
            }
            k = k + 1;
        }

        System.out.println();

        //Homework 4
        String symbol = "*";

        for(int x = 0; x < 8; x++){
            for(int i = 6; i > x; i--){
                System.out.print(symbol);
            }
            System.out.println();
        }



        String symbol2 = "-";


        for(int x = 0; x < 6; x++){
            for(int i = -1; i < x; i++){
                System.out.print(symbol);
            }
            for(int i = 5; i > x; i--){
                System.out.print(symbol2);
            }
            System.out.println();
        }

        System.out.println();



        //Homework 1
        int[] array1 = {1, 2, 3, 4, 5};

        for (int i = 1; i < 6; i++) {
            for (int x : array1) {
                System.out.print(" " + x);
            }
            System.out.println();
        }

        System.out.println();



        int[] array2 = {0, 1, 2, 3, 4};
        for(int o = 1; o < 6; o++){
            for(int i = 0; i < array2.length; i++){
                array2[i] = array2[i] + 1;
            }
            System.out.println();
            for(int s: array2) {
                System.out.print(" " + s);
            }
        }
    }
}
