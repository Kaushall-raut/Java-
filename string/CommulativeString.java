package string;

import java.util.Scanner;

public class CommulativeString {
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("how many words you want to insert");

        int size=sc.nextInt();

        String words[]=new String[size];

        int result=0;

        System.out.println("Enter your words :");

        for(int i=0;i<size;i++){
            words[i]=sc.next();
        }

        for(int i=0;i<words.length;i++){
            
                result+=words[i].length();
            
        }

        System.out.println("commulative of the input strings are : "+ result);
        
        sc.close();
    }

}
