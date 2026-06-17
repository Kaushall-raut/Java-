package Functions;

import java.util.Scanner;

public class Power {

    public static void calculatePower(int x,int n){
        int power=1;


        for(int i=1;i<=n;i++){
            power*=x;
        }

        System.out.println("Power of the number is :"+power);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("Enter n");
        int n=sc.nextInt();
        sc.close();

        calculatePower(x,n);
    }
}
