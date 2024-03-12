package com.mycompany.algoritimo490;

import java.util.Scanner;

public class Algoritimo490 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RecebeVetor troca = new RecebeVetor();
        
        System.out.println("digite palavra em letras minusculas 1: ");
        String palavra = scan.nextLine();
        char[] vetor = new char[palavra.length()];
        
        System.out.println("digite um caractere: ");
        String caractereUnico = scan.nextLine();
        char caractere = caractereUnico.charAt(0);
        
        for(int i = 0; i < palavra.length() ; i++){
            vetor[i] = palavra.charAt(i);   
        }
        
        char[] resultado = troca.trocaCaractere(caractere, vetor);
        
        System.out.println(resultado);
        
    }
}

