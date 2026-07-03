import java.util.Scanner;

class Array1{
    public static void main(String args[]){
        int[] num=new int[5];

        Scanner sc=new Scanner(System.in);
        System.out.println("Insert elements");

        for(int i=0;i<5;i++){
            num[i]=sc.nextInt();
        }

        System.out.println("enter a number you want to find");

        int x=sc.nextInt();

        for(int i=0;i<5;i++){
            if(num[i]==x){
                System.out.println("Found at index "+ i);
            }
        }

        sc.close();
    }
}