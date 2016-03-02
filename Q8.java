/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

/**
 *
 * @author Edu
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrix a = new matrix();
        a.maiorValor();
    }

}

class matrix {

    int matrix[][] = {
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
        {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
        {41, 42, 43, 440, 45, 46, 47, 48, 49, 50},
        {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
        {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
        {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
        {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
        {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
    };
    int aux = matrix[0][0];
    int coordX,coordY;

    void maiorValor() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (aux < matrix[i][j]) {
                    aux = matrix[i][j];
                    coordX = i+1;
                    coordY = j+1;
                }
            }
        }
        System.out.println("O maior valor é : "+aux+" , suas coordenadas são : "+coordX+","+coordY);

    }
}
