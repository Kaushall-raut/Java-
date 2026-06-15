package Functions;

import java.util.Scanner;

public class Factorial {

    public static int Fact(int a){
        int fact=1;
        if(a==1){
            return 1;
        }else if(a<1){
            System.out.println("we dont count Factorial of negative numbers ");
        }else{

            
            for (int i = a; i >=1; i--) {
                fact*=i;
            }
        }

        return fact ;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to find Factorial");
        int num=sc.nextInt();

        sc.close();

        System.out.println("Factorial of the number is :"+Fact(num));
    }
}
