package exercicios.metodos.test;

import exercicios.metodos.dominio.ContaCorrente;

import java.util.Scanner;

public class ContaCorrenteTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();
        char realizarAcoesConta = 'S';

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
        System.out.println();

        while(realizarAcoesConta == 'S'){
            System.out.println("Informe qual operação deseja realizar: ");
            System.out.println("1- SAQUE / 2- DEPOSITO / 3-CONSULTAR SALDO / 4-SAIR DO PROGRAMA");
            int numeroOpracoes = input.nextInt();
            System.out.println();
            switch (numeroOpracoes){
                case 1:
                    contaCorrente.sacar();
                    break;
                case 2:
                    contaCorrente.depositar();
                    break;
                case 3:
                    contaCorrente.consultarSaldo();
                    break;
                case 4:
                    realizarAcoesConta = 'N';
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

            System.out.println();
            System.out.println("Informações atualizada de sua conta: ");
            System.out.println(contaCorrente);
        }
    }
}
