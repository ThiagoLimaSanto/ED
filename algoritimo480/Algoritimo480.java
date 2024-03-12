package com.mycompany.algoritimo480;

import java.util.Scanner;

public class Algoritimo480 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VerificaCapicua verificador = new VerificaCapicua();
        
        System.out.println("Digite alguma coisa: ");
        String text = scan.nextLine();
        
        boolean retorno = verificador.verificadaor(text);
        
        if(retorno){
            System.out.println("E un numero capicua");
        }else{
            System.out.println("Nao e um numero capicua");
        }
    }
}
