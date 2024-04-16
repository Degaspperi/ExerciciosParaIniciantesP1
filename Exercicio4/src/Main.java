//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int id, horas;
        double valorHora, salario;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu código de funcionário:");
        id = ler.nextInt();

        System.out.println("Informe a quantidade de horas completas trabalhadas:");
        horas = ler.nextInt();

        System.out.println("Informe o valor da sua hora trabalhada:");
        valorHora = ler.nextDouble();

        salario = horas * valorHora;

        System.out.println("O funcionário de código: "+id);
        System.out.printf("Receberá %.2f\n",salario);

    }
}