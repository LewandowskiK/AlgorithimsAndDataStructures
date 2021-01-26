//comments here...
package week1.exercise2;

import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=1;
        int[] numbersTo100 = populateArray();
        int[] counter = new int[100];

        while(number > 0){
            System.out.print("Please enter the next number(negative number to exit): ");
            number = input.nextInt();

            if(number>0 && number<=100){
                counter[number-1] += 1;
            }
        }

        System.out.println("Outputting Results:\n\n");

        System.out.println(String.format("%-10s||%-10s","Number","Quantity"));
        System.out.println("--------------------");

        for(int i=0; i < numbersTo100.length; i++){
            System.out.println(String.format("%-10d||%-10d",numbersTo100[i],counter[i]));
        }
        System.exit(0);
    }

    private static int[] populateArray(){

        int[] array = new int[100];

        for(int i = 0; i < array.length; i++){

            array[i] = i+1;

        }

        return array;
    }
}
