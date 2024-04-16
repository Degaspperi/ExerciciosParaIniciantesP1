//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double valorA, valorB, valorC, triangulo, circulo, trapezio, quadrado, retangulo;
        Scanner ler = new Scanner(System.in);
        String teste;

        System.out.println("Informe o valor de A:");
        valorA = ler.nextDouble();

        System.out.println("Informe o valor de B:");
        valorB = ler.nextDouble();

        System.out.println("Informe o valor de C:");
        valorC = ler.nextDouble();

        triangulo = valorA * valorC /2;
        circulo = 3.14159 * (valorC*valorC);
        trapezio = (valorA+valorB) * valorC / 2;
        quadrado = valorB * valorB;
        retangulo =  valorA * valorB;

        System.out.printf("A área de um triângulo retângulo de acordo com as medidas informadas é: %.3f\n",triangulo);
        System.out.printf("A área de um círculo de acordo com as medidas informadas é: %.3f\n",circulo);
        System.out.printf("A área de um trapézio de acordo com as medidas informadas é: %.3f\n",trapezio);
        System.out.printf("A área de um quadrado de acordo com as medidas informadas é: %.3f\n",quadrado);
        System.out.printf("A área de um retangulo de acordo com as medidas informadas é: %.3f\n", retangulo);

    }
}