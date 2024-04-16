//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nA, nB, nC, nD, diferenca;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        nA = ler.nextInt();

        System.out.println("Informe o valor de B:");
        nB = ler.nextInt();

        System.out.println("Informe o valor de C:");
        nC = ler.nextInt();

        System.out.println("Informe o valor de D:");
        nD = ler.nextInt();

        diferenca =  nA * nB - nC * nD;
        System.out.println("A diferença entre o produto de "+nA+" x "+nB+" e o produto de "+nC+" x "+nD+" é: "+diferenca);





    }
}