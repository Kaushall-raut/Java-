package Functions;

import java.util.Scanner;

public class SumOfTwoNumber {

    public static int sumOfNumber(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any two numbers:");
       int firstNumber=sc.nextInt();
       int secondNumber=sc.nextInt();
       sc.close();

        System.out.println(sumOfNumber(firstNumber, secondNumber));
    }
}
