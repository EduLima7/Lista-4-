/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vetor a = new vetor();
        a.buscarValor();
    }

}

class vetor {

    int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
    Scanner in = new Scanner(System.in);
    int aux;
    int cont = 0;

    void buscarValor() {
        System.out.println("Digite o valor de busca : ");
        aux = in.nextInt();
        for (int i = 1; i <= 16; i++) {
            if (vetor[i-1] == aux) {
                System.out.println("Seu valor está na : " + i + "ª posição");
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Seu valor não foi encontrado !");
        } else {
            System.out.println("Seu valor aparece " + cont + " vez(es) !");
        }

    }
}
