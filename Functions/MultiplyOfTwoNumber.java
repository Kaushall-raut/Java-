package Functions;

import java.util.Scanner;

public class MultiplyOfTwoNumber {


    public static int multiplicationOfTwoNumber(int a,int b){
        int product=a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();

        int product=multiplicationOfTwoNumber(a,b);

        System.out.println("product of two number is :"+product);
    }
}
