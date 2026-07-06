

public class MinMax {
    public static void main(String[] args) {
        
        int num[]={2,3,1,5,6};
        int min=num[0];
        int max=num[num.length-1];

        System.out.println(num.length);

        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
            if(num[i]>max){
                max=num[i];
            }
        }

        System.out.println(min + " "+ max);

    }
}
