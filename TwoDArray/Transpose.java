package TwoDArray;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i=0;i<5;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=j;
            }
        }
System.out.println("Original Matrix");
        for (int i=0;i<5;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }


        System.out.println("Transpose Matrix");

         for (int i=0;i<5;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println();
        }


    }
}
