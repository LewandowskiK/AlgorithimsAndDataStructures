//comments here...
package week1.exercise1;

public class TestMyMath {
    public static void main(String[] args) {
        System.out.println("Finding the smallest numbers: ");
        System.out.println(MyMath.findSmallest(18.6,19.8,15.4));//expected 15.4
        System.out.println(MyMath.findSmallest(17,12.8,18));//expected 12.8
        System.out.println(MyMath.findSmallest(-0.8,21.8,0.5));//expected -0.8

        System.out.println("\n\nFinding the power: ");
        System.out.println(MyMath.power(5,1));//expected 5
        System.out.println(MyMath.power(5,2));//expected 25
        System.out.println(MyMath.power(5,3));//expected 125

        System.out.println("\n\nFinding sum of all numbers to N:");
        System.out.println(MyMath.sumToN(5));//expected 15
        System.out.println(MyMath.sumToN(4));//expected 10
        System.out.println(MyMath.sumToN(3));//expected 6
        System.out.println(MyMath.sumToN(10));//expected 55
        System.out.println(MyMath.sumToN(8));//expected 55

        System.out.println("\n\nFinding the factorial:");
        System.out.println(MyMath.factorial(2));//expected 2
        System.out.println(MyMath.factorial(3));//expected 6
        System.out.println(MyMath.factorial(4));//expected 24
        System.out.println(MyMath.factorial(5));//expected 120
        System.out.println(MyMath.factorial(6));//expected 720

        System.out.println("\n\nChecking if a number is prime:");
        MyMath.isPrime(3);//expected yes
        MyMath.isPrime(4);//expected no
        MyMath.isPrime(5);//expected yes
        MyMath.isPrime(6);//expected no
        MyMath.isPrime(7);//expected yes
        MyMath.isPrime(11);//expected yes
        MyMath.isPrime(13);//expected yes
        MyMath.isPrime(15);//expected no
        MyMath.isPrime(20);//expected no
        MyMath.isPrime(21);//expected no
        MyMath.isPrime(23);//expected yes

        System.exit(0);
    }
}
