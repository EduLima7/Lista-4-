/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q13;

/**
 *
 * @author Edu
 */
public class Q13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrix a = new matrix ();
        a.printMat();
        a.matTri();
        a.printMat();
    }

}

class matrix {

    int matrix[][] = {
        {1, 2, 3, 4, 5, 6, 7, 8},
        {9, 10, 11, 12, 13, 14, 15, 16},
        {17, 18, 19, 20, 21, 22, 23, 24},
        {25, 26, 27, 28, 29, 30, 31, 32},
        {33, 34, 35, 36, 37, 38, 39, 40},
        {41, 42, 43, 44, 45, 46, 47, 48},
        {49, 50, 51, 52, 53, 54, 55, 56},
        {57, 58, 59, 60, 61, 62, 63, 64}};
    void matTri(){
        for (int i = 0; i < 8; i++) {
            for (int j = 1+i; j < 8; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    void printMat(){
        System.out.println("---------------------------------");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("---------------------------------");
    }
}
