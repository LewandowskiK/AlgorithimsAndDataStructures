//comments here...
package week1.exercise4;

public class Password {
    public static boolean isValid(String password){
        if(password.length()>=8){
            boolean containsUppercase = false,containsLowercase = false,containsDigit = false;

            for(int i = 0; i < password.length(); i++){

                if(!containsDigit && Character.isDigit(password.charAt(i))){
                    containsDigit = true;
                }

                if(!containsUppercase && Character.isUpperCase(password.charAt(i))){
                    containsUppercase = true;
                }

                if(!containsLowercase && Character.isLetter(password.charAt(i)) && !Character.isUpperCase(password.charAt(i))){
                    containsLowercase = true;
                }
            }

            if(containsDigit && containsLowercase && containsUppercase){
                return true;
            }
            else {
                if(!containsDigit){
                    System.out.println("Password must contain at least 1 digit!");
                }
                if(!containsUppercase){
                    System.out.println("Password must contain at least 1 uppercase character!");
                }
                if(!containsLowercase){
                    System.out.println("Password must contain at least 1 lowercase character!");
                }
                return false;
            }
        }
        System.out.println("Password must contain at least 8 characters!");
        return false;
    }
}
