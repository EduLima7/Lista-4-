/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.Scanner;

/**
 *
 * @author FACOMP
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vetor a = new vetor();
        a.somarPosicao();
        // TODO code application logic here
    }

}

class vetor {

    Scanner a = new Scanner(System.in);
    int soma;
    int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    void somarPosicao() {
        System.out.println("Qual é a posição 1 ?");
        int i = a.nextInt();
        System.out.println("Qual a posição 2 ?");
        int j = a.nextInt();
        soma = vetor[i -1] + vetor[j -1];
        System.out.println(soma);
    }
}
