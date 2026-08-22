package recursion;

public class Stack_height {
    static int print_stack_height(int x,int n){
        if(x==0){
            
            return 0;
        }
        if(n==0){
            return 1;
        }
        // int pow=print_stack_height(x, n-1);
        // int power=x*pow;
            return x * print_stack_height(x, n-1);
    }

    public static void main(String[] args) {
        int x=2,n=4,ans; 
        ans =print_stack_height(x,n);
        System.out.println(ans);
    }
}


