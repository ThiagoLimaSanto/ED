package com.mycompany.algoritimo470;

import java.util.Scanner;

public class Algoritimo470 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VerificaPrimo verificador = new VerificaPrimo();
        
        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();
        
        boolean retorno = verificador.verificador(numero);
        
        if(retorno){
            System.out.println("O numero digitado e primo!");
        }else{
            System.out.println("O numero digitado nao e primo!");
        }   
    }
}
