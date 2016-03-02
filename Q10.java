/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10;

/**
 *
 * @author Edu
 */
public class Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrix a = new matrix();
        a.maioresVal();
        a.printMatrix();
    }

}

class matrix {

    int matrix1[][] = {
        {1, 2, 3, 4}, 
        {5, 6, 7, 8}, 
        {9, 10, 11, 12}, 
        {13, 14, 15, 16}};
    int matrix2[][] = {
        {1, 2, 3, 4}, 
        {5, 6, 7, 8}, 
        {9, 10, 11, 12}, 
        {13, 14, 15, 16}};
    int matrix3[][] = {
        {0, 0, 0, 0, 0}, 
        {0, 0, 0, 0, 0}, 
        {0, 0, 0, 0, 0}, 
        {0, 0, 0, 0, 0}};

    void maioresVal() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix1[i][j] > matrix2[i][j]) {
                    matrix3[i][j] = matrix1[i][j];
                } else {
                    matrix3[i][j] = matrix2[i][j];
                }
            }
        }
    }

    void printMatrix() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
