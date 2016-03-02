/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

/**
 *
 * @author Edu
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vetor a = new vetor();
        a.contarPares();
    }
    
}
class vetor {
    int vetor [] = { 
        1,2,3,4,5,6,7,8,9,10,
        11,12,13,14,15,16,17,18,19,20,
        21,22,23,24,25,26,27,28,29,30,
        31,32,33,34,35,36,37,38,39,40 };
    int cont = 0;
    void contarPares(){
        for (int i = 1; i <= 40; i++) {
            if(vetor[i-1]%2==0&vetor[i-1]!=0){      //a condição é : O resto da divisão de inteiros do valor, da posição i-1, ser 0 e valor dessa posição ser diferente de zero , já que 0 não é par 
                System.out.println("O valor da "+i+"ª posição é par ! ");
                cont ++;
            }
            
        }
        System.out.println("O vetor possui "+cont+" valor(es) pare(s)");
    }
}