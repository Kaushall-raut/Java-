package Functions;

import java.util.Scanner;

public class Fibonacci {
    public static void fibo(int n){

        int a=0;
        int b=1;

        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;i<=n;i++){
            int next=a+b;
            a=b;
            b=next;
            System.out.print(next+" ");
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        sc.close();

        fibo(5);
    }
}
