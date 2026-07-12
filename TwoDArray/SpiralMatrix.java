import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int m=4;
        int n=4;
        int matrix[][]=new int[m][n];

        System.out.println("Enter elements");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }

        }

        int rowstart=0;
        int colstart=0;
        int rowEnd=m-1;
        int colEnd=n-1;

        while(rowstart<=rowEnd && colstart<=colEnd){

            //  top boundary

            for(int col=colstart;col<=colEnd;col++){
                System.out.print(matrix[rowstart][col]+" ");
            }
            rowstart++;



            //  right boundary 

            for(int row=rowstart;row<=rowEnd;row++){
                System.out.print(matrix[row][colEnd]+ " ");

            }

            colEnd--;


            // bottom boundary 
            if(rowstart<=rowEnd){

                
                for(int col=colEnd;col>=colstart;col--){
                    System.out.print(matrix[rowEnd][col]+ " ");
                }
                rowEnd -- ;
            }


            //  left boundary 

            if(colstart<=colEnd){

                
                for(int row=rowEnd;row>=rowstart;row--){
                    System.out.print(matrix[row][colstart]+" ");
                }
                colstart++;
            }

            // System.out.println();

        }


        sc.close();
    }
}
