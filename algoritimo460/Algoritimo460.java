package com.mycompany.algoritimo460;

import java.util.Scanner;

public class Algoritimo460 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        while (num != 999) {
            System.out.println("Digite 1 número(999 para cancelar): ");
            num = scan.nextInt();
            if (num != 999) {
                Dobro numeroDobro = new Dobro(num);

                System.out.println("O dobro é: " + numeroDobro.numero);
            }
        }
    }
}
