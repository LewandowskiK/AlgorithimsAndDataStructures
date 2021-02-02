//comments here...
package week1.exercise1;

import javax.swing.*;

public class MyMath {

    public static double findSmallest(double a ,double b, double c){
        double smallest = a;
        if(smallest > b){
            smallest = b;
        }
        if(smallest > c){
            smallest = c;
        }
        return smallest;
    }

    public static double power(double a, int b){
        if(b >= 0){
            double result = a;

            //anything to the power of 0 is 1
            if(b==0){
                return 1;
            }

            if(b != 1){

                for(int i = 1; i < b; i++){
                    result *= a;
                }

            }

            return result;
        }
        //b not a positive integer
        JOptionPane.showMessageDialog(null,"Invalid value entered","Error",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        //never gets here
        return 0;
    }

    public static int sumToN(int a){
        int result = 0;

        if(a > 0){
            //starting loop from 1 since +0 does nothing
            for (int i = 0; i <= a; i++){
                result += i;
            }
            return result;
        }

        return 0;
    }

    public static int factorial(int a){
        int result = a;

        for(int i = a-1; i > 1; i--){
            result *= i;
        }

        return result;
    }

    public static boolean isPrime(int a) {
        if (a % 2 != 0) {

            for (int i = 2; i <= a / 2; i++) {

                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
        //divisible by 2, return false
        return false;
    }
}