package Functions;

import java.util.Scanner;

public class GreaterTwo{
    public static int Greater(int num1,int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any two number:");

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        sc.close();

        System.out.println(Greater(num1,num2)+" is greater than other number");

    }
}
