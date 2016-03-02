/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author Edu
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vetor a = new vetor();
        a.printVet();
        a.acumularValores();
        a.printVet();
    }

}

class vetor {

    int vetor[] = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
    int aux = 0;

    void acumularValores() {
        for (int i = 1; i < 40; i++) {
            aux = vetor[i - 1];
            vetor[i] += aux;

        }
    }

    void printVet() {
        System.out.println("Vetor: ");
        for (int i = 1; i <= 40; i++) {
            System.out.print(vetor[i - 1] + " ");
        }
        System.out.println("\n");
    }
}