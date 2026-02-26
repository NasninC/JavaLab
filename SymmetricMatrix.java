import java.util.Scanner;

public class symmetric{
        public static void main(String[] args){
                int row,column;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter no: of rows:");
                row=sc.nextInt();
                System.out.println("Enter no: of columns:");
                column=sc.nextInt();

                if(row!=column){
                        System.out.println("Matrix is not symmetric!");
                }
                 int[][] matrix = new int[row][column];

                System.out.println("Enter matrix elements:");
                for (int i = 0; i < row; i++) {
                     for (int j = 0; j < column; j++) {
                            matrix[i][j] = sc.nextInt();
                     }
                  }

                boolean isSymmetric = true;
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < i; j++) {
                        if (matrix[i][j] != matrix[j][i]) {
                             isSymmetric = false;
                             break;
                        }
                    }
                }

                if (isSymmetric) {
                   System.out.println("The matrix is symmetric.");
                     } else {
                       System.out.println("The matrix is not symmetric.");
                    }
        }
}
