package recursion;

public class Sum_of_first {
    static int first_n_sum(int n){
        if(n==0){
            return 0;
        }
       return n+first_n_sum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int store;
        store= first_n_sum(n);
        System.out.println(store);
    }
}
