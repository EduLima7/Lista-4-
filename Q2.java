/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author Edu
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vetor a = new vetor();
        a.printVetor();
        a.alterarVetor();
        a.printVetor();
        // TODO code application logic here
    }

}

class vetor {

    int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    int aux;

    void alterarVetor() {
        for (int i = 0; i < 8; i++) {
            aux = vetor[i];
            vetor[i] = vetor[i + 8];
            vetor[i + 8] = aux;
        }

    }

    void printVetor() {
        System.out.println("Vetor : ");
        for (int i = 0; i < 16; i++) {
            System.out.print(" " + vetor[i] + " ");
        }

        System.out.println("\n");
    }
}
