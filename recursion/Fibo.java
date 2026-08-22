package recursion;
class Fibo{

    static int fibo_series(int a,int b, int n){
        int c=a+b;
        System.out.println(c);
        if(n==0){
            return 0;
        }

        return fibo_series(b, c, n-1);

    }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=8;
        System.out.println(a);
        System.out.println(b);

        fibo_series(a, b, n-2);

    }
}