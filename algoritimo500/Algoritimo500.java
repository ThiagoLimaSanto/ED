package com.mycompany.algoritimo500;

import java.util.Scanner;

public class Algoritimo500 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vetor vetor = new Vetor();

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        int escolha = 0;
        boolean resultadoVetorA = false;
        boolean resultadoVetorB = false;

        while (escolha != 6) {
            System.out.println(""
                    + "[1]-Dados do VETOR A\n"
                    + "[2]-Dados do VETOR B\n"
                    + "[3]-Imprime VETORES\n"
                    + "[4]-Soma VETORES\n"
                    + "[5]-Subtrai VETORES\n"
                    + "[6]-sair");
            escolha = scan.nextInt();
            scan.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Entrada do vetor A: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.printf("Digite o valor para a posicao %d: \n", i + 1);
                        vetorA[i] = scan.nextInt();
                    }
                    resultadoVetorA = vetor.vetor();
                    break;

                case 2:
                    System.out.println("Entrada do vetor B: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.printf("Digite o valor para a posicao %d: \n", i + 1);
                        vetorB[i] = scan.nextInt();
                    }
                    resultadoVetorB = vetor.vetor();
                    break;

                case 3:
                    if (resultadoVetorA && resultadoVetorB) {
                        System.out.println("Vetor A = "+vetor.imprimeVetor(vetorA));

                        System.out.println("Vetor B = "+vetor.imprimeVetor(vetorB));
                        break;
                    } else {
                        System.out.println("Escolha primeiro as opcoes 1 e 2!");
                        break;
                    }

                case 4:
                    if (resultadoVetorA && resultadoVetorB) {
                        System.out.println("Soma = "+vetor.imprimeVetor(vetor.somaVetor(vetorA, vetorB)));
                        break;
                    } else {
                        System.out.println("Escolha primeiro as opcoes 1 e 2!");
                        break;
                    }

                case 5:
                    if (resultadoVetorA && resultadoVetorB) {
                        System.out.println("Soma = "+vetor.imprimeVetor(vetor.subtracaoVetor(vetorA, vetorB)));
                        break;
                    } else {
                        System.out.println("Escolha primeiro as opcoes 1 e 2!");
                        break;
                    }

                case 6:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
}
