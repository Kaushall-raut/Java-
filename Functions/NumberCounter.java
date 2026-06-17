package Functions;

import java.util.Scanner;

public class NumberCounter {

    public static void counter(int n) {
        int positive=0;
        int negative=0;
        int zeroes=0;

        Scanner sc=new Scanner(System.in);

        
        for (int i = 1; i <=n; i++) {
            System.out.println("Enter a number :");
            int input=sc.nextInt();
            // sc.close();
            if(input>0){
                positive++;
            }else if(input<0){
                negative++;
            }else{
                zeroes++;
            }
        }
        System.out.println("Total positive number you entered are :"+positive);
        System.out.println("Total negative number you entered are :"+negative);
        System.out.println("Total zeroes number you entered are :"+zeroes);
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many number you want to add :");
        int n=sc.nextInt();
        // sc.close();
        counter(n);
sc.close();
      
    }
}
