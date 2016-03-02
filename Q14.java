/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q14;

/**
 *
 * @author Edu
 */
public class Q14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrix a = new matrix();
        a.printMat();
        a.matT();
        a.printMat();
    }

}

class matrix {

    int matrix[][] = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}};
    int aux;

    void matT() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0 + i; j < 5; j++) {
                if (i != j) {
                    aux = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = aux;
                }
            }
        }
    }

    void printMat() {
        System.out.println("---------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("---------------------------");
    }
}
