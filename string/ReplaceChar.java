package string;

import java.util.Scanner;

public class ReplaceChar {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Enter a words");
        String word=sc.next();
        String result= word.replace('e','i' );


        System.out.println("original :"+word);
        System.out.println("result :"+result);
        sc.close();
        
    }
}
