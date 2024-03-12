package com.mycompany.algoritimo500;

import java.util.Arrays;

public class Vetor {

    public boolean vetor() {
        return true;
    }

    public String imprimeVetor(int[] vetor) {
        String resultado = Arrays.toString(vetor);
        return resultado;
    }

    public int[] somaVetor(int[] vetorA, int[] vetorB) {
        int[] somaVetor = new int[5];
        for (int i = 0; i < 5; i++) {
            somaVetor[i] = vetorA[i] + vetorB[i];
        }
        return somaVetor;
    }
    
    public int[] subtracaoVetor(int[] vetorA, int[] vetorB){
        int[] subtracaoVetor = new int[5];
        for (int i = 0; i < 5; i++) {
            subtracaoVetor[i] = vetorA[i] - vetorB[i];
        }
        return subtracaoVetor;
    }
}
