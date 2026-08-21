package recursion;

public class Printer {
    static int  first_five(int n){
    if (n==6){
        return n ;
    }
    System.out.println(n);
    return  first_five(n+1);

}
    public static void main(String[] args) {
        int n=1;
        first_five(n); 
       
    }
}
