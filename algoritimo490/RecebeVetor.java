package com.mycompany.algoritimo490;

public class RecebeVetor {
    
    public char[] trocaCaractere(char caractere, char vetor[]){
        for(int i = 0; i < vetor.length; i++){
            if(caractere == vetor[i]){
                vetor[i] = '*';
            }
        }
        return vetor;
    }
}
