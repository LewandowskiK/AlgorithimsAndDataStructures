//comments here...
package week1.exercise4;

import java.util.Scanner;

public class TestPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        do{

            System.out.print("\nPlease enter the new password: ");
            password = input.nextLine();

        }while(!Password.isValid(password));

        System.out.println("\nSuccessful password change!");

        System.exit(0);
    }
}
