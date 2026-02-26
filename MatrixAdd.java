import java.util.Scanner;
public class matrixAdd{
        public static void main(String[] args){
                    int row,column;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter no: of rows:");
                    row=sc.nextInt();
                    System.out.println("Enter no: of column:");
                    column=sc.nextInt();
                    int[][] matrix1=new int[row][column];
                    int[][] matrix2=new int[row][column];
                    int[][] sum=new int[row][column];
                    System.out.println("Enter first matrix  elements:");
                    for(int i=0;i<row;i++){
                            for(int j=0;j<column;j++){
                                    matrix1[i][j]=sc.nextInt();
                            }
                    }
                    System.out.println("Enter second matrix  elements:");
                    for(int i=0;i<row;i++){
                            for(int j=0;j<column;j++){
                                    matrix2[i][j]=sc.nextInt();
                            }
                    }

                    for(int i=0;i<row;i++){
                            for(int j=0;j<column;j++){
                                    sum[i][j]=matrix1[i][j]+matrix2[i][j];
                            }
                    }
                    System.out.println("Sum of matrix:");
                    for(int i=0;i<row;i++){
                            for(int j=0;j<column;j++){
                                    System.out.print(sum[i][j] + " ");
                                }
                              System.out.println();
                            }





                    }

        }
