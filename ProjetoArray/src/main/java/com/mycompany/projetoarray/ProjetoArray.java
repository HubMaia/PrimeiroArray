package com.mycompany.projetoarray;

import java.util.Scanner;

public class ProjetoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor[] = new int[8];
        double soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        // Recebendo valores agora..
        for (int i = 0; i < valor.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            valor[i] = sc.nextInt();
            soma = soma + valor[i];

            if (valor[i] > maior) {
                maior = valor[i];
            }
            if (valor[i] < menor) {
                menor = valor[i];
            }
        }
        
        // Exibindo a soma, maior e menor valor
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}
