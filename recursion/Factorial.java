package recursion;

public class Factorial {
    static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n* factorial(n-1);

    } 
    public static void main(String[] args) {
        int n=4;
        int store;
        store=factorial(n);
        System.out.println(store);
    }
}
