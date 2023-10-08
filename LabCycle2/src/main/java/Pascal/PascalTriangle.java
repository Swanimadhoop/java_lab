/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pascal;
        

/**
 *
 * @author swani
 */
public class PascalTriangle {
     public static void main(String[] args) {
        int numRows = 5; // Number of rows in the triangle
        
        // Generate and print Pascal's Triangle
        generateAndPrintPascalsTriangle(numRows);
    }
    
    public static void generateAndPrintPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }
    public static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

