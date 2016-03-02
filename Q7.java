/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

/**
 *
 * @author Edu
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vetor a = new vetor();
        a.separaIguais();
    }

}

class vetor {

    int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    void separaIguais() {
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println(vetor[i]);
                }
            }
        }
    }
}
