import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of row:");
        int i,j;
        int row=sc.nextInt();
        System.out.println("enter the no of column:");
        int column=sc.nextInt();
        int a[][]=new int[row][column];
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                a[i][j]=sc.nextInt();}
                
            }
            for(i=0;i<row;i++){
                for(j=0;j<column;j++){
                    System.out.print(a[i][j]+" ");
                    
                    
                }
                 System.out.println(" ");
            
        }
        
    }
}



another method:upper matrix


import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of rows and columns
        System.out.print("enter the no of row: ");
        int rows = scanner.nextInt();
        System.out.print("enter the no of column: ");
        int cols = scanner.nextInt();
        
        // Initialize the matrix
        int[][] matrix = new int[rows][cols];
        
        // Read the matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Process and print the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j < i) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
