package Functions;

import java.util.Scanner;

public class Gcd {

    public static void greatestCommonDivisor(int num1,int num2){

        int a=num1;
        int b=num2;

       while (b !=0) {
        int remainder=a%b;
        a=b;
        b=remainder;
       }
        System.out.println("Greatest common divisor of first number :"+a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sc.close();


        greatestCommonDivisor(num1, num2);
    }
}
