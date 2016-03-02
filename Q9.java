/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q9;

/**
 *
 * @author Edu
 */
public class Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrix a = new matrix();
        a.printMatrix();
        a.identityMatrix();
        a.printMatrix();
    }

}

class matrix {

    int matrix[][] = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10}, 
        {11, 12, 13, 14, 15}, 
        {16, 17, 18, 18, 20}, 
        {21, 22, 23, 24, 25}};

    void identityMatrix() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    void printMatrix() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
