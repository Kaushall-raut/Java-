public class SortChecker {
    public static void main(String[] args) {
        // int num[]={2,3,4,6,8,1};
        int num[]={1,2,3,4,5};


        boolean sorted=true;

        for (int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                sorted=false;
            }
        }

        if(sorted){
            System.out.println("Array is in ascending order");
        }else{
            System.out.println("array is not in ascending order");
        }
    }
}
