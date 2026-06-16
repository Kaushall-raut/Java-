package Functions;

import java.util.Scanner;

public class SumOfOdd {

    public static int sumOfOdd(int n){

        int sum_odd=0;

        if(n==1){
            return 1;
        }

        for (int i = n; i >=1; i--) {
            if(i%2!=0){

                sum_odd+=i;
            }
        }

        return sum_odd;

    }

    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        sc.close();

        System.out.println("Sum of odd numbers is :"+ sumOfOdd(n));

    }
}
