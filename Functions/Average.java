package Functions;

import java.util.Scanner;

public class Average {


    public static int calculateAverage(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;


        return avg;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three numbers :");
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        sc.close();

        System.out.println("Average of the given 3 numbers is :" + calculateAverage(first,second,third));
    }
}
