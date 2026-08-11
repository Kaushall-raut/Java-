package sorting.Bubble_sort;

public class Decreasing_order {
    public static void main(String[] args) {
        int arr[]={7,3,9,3,4,6,2,9};

        // for sorting 

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


        // For printing
        for (int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
}
