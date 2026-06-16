package Functions;

import java.util.Scanner;

public class Vote{

    

    public static void ageChecker(int age){
        if(age>18){
            System.out.println("You are eligible for vote ");
        }else{
            System.out.println("Underage , You are not eligible for vote ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        sc.close();

        ageChecker(age);
    }
}