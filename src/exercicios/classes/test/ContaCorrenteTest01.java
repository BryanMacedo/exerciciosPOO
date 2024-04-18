package exercicios.classes.test;

import exercicios.classes.ContaCorrente;

import java.util.Scanner;

public class ContaCorrenteTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println("Bem vindo ao banco digital " + contaCorrente.nomeBanco + "\n");

        System.out.println("Digite o numero de sua conta: ");
        contaCorrente.setNumeroConta(input.nextInt());
        System.out.println();

        System.out.println("Digite o saldo de sua conta: ");
        contaCorrente.setSaldo(input.nextDouble());
        System.out.println();

        System.out.println("Você possue uma conta especial? Digire true para sim e false para não");
        contaCorrente.setEspecial(input.nextBoolean());
        System.out.println();

        System.out.println("Digite o limite de sua conta: ");
        contaCorrente.setLimite(input.nextDouble());
        System.out.println();

        System.out.println(contaCorrente);
    }
}
