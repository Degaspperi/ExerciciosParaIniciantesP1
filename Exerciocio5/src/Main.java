//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cod1, pecas1, cod2, pecas2;
        double valorPeca1, valorPeca2, total;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o código da 1° peça:");
        cod1 = ler.nextInt();

        System.out.println("Informe o número de unidades da 1° peça:");
        pecas1 = ler.nextInt();

        System.out.println("Infome o valor de unitário da 1° peça:");
        valorPeca1= ler.nextDouble();

        System.out.println("Informe o código da 2° peça:");
        cod2 = ler.nextInt();

        System.out.println("Informe o número de unidades da 2° peça:");
        pecas2 = ler.nextInt();

        System.out.println("Infome o valor de unitário da 2° peça:");
        valorPeca2= ler.nextDouble();

        total = (pecas1 * valorPeca1)+(pecas2 * valorPeca2);
        System.out.println("Valor a pagar: R$"+total);



    }
}