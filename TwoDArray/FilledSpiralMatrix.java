import java.util.Scanner;

public class FilledSpiralMatrix{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row and column");
        int m=sc.nextInt();
        int n=sc.nextInt();

        int matrix[][]=new int[m][n]; 

        
        
        int  rowStart=0;
        int rowEnd=m-1;
        int colStart=0;
        int colEnd=n-1;
        
        while(rowStart<=rowEnd && colStart <=colEnd ){
            
            // top boundary 
            
            for(int col=colStart;col<=colEnd;col++){
             matrix[rowStart][col]=sc.nextInt();
            }
            rowStart++;
            
            // right boundary
            
            for(int row=rowStart;row<=rowEnd;row++){
                matrix[row][colEnd]=sc.nextInt();
            }
            colEnd --;
            
            // bottom boundary 
            
            if(rowStart<=rowEnd){

                
                for(int col=colEnd;col>=colStart;col--){
                    matrix[rowEnd][col]=sc.nextInt();
                }
                rowEnd--;
            }
            
            
            // left boundary 
            
            for(int row=rowEnd;row>=rowStart;row--){
                matrix[row][colStart]=sc.nextInt();
            }
            colStart++;
            
            
            
        }
        
        
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        
        
        
        sc.close();
    }
}