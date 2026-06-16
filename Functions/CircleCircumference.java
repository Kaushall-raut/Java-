package Functions;

import java.util.Scanner;


public class CircleCircumference {
    public static double circumference(double r){
        double circumference=2 * Math.PI * r;
          
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius :");
        int r=sc.nextInt();
        sc.close();

        System.out.println("Circumference of the circle is :"+circumference(r));
    }
}
