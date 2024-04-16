//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, resultado;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro número:");
        n1 = ler.nextInt();

        System.out.println("Informe o valor do segundo número:");
        n2 =  ler.nextInt();

        resultado = n1 + n2;
        System.out.println("O resultado da soma de "+n1+"+"+n2+" é:"+resultado);

    }
}