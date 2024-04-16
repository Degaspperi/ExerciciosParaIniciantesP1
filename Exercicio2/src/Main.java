//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double raio, p = 3.14159, area;
    Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do raio do círculo");
        raio = ler.nextDouble();

        area = p * (raio*raio);

        System.out.printf("O valor da área deste círculo é: %.4f\n",area);


    }
}