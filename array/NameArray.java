import java.util.Scanner;

public class NameArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size= sc.nextInt();
        String name[]=new String[size+1];

        System.out.println("Enter names");
        for(int i =0;i<name.length;i++){
            name[i]=sc.nextLine();
        }

        System.out.println("Names list:");

        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }


        sc.close();
    }
}
