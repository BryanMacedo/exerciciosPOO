package exercicios.ConstrutoresEncapsulamentoSobrecarga.test;

import exercicios.ConstrutoresEncapsulamentoSobrecarga.dominio.ContaCorrente;

import java.util.Scanner;

public class ContaCorrenteTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente(12454, 3500, false, 5000);
        char realizarAcoesConta = 'S';

        System.out.println("Bem vindo ao Banco " + contaCorrente.nomeBanco);
        System.out.println("Seu numero de conta é: " + contaCorrente.getNumeroConta());
        System.out.println("Seu saldo atual é de: " + contaCorrente.getSaldo());
        if (contaCorrente.isEspecial() == true){
            System.out.println("Sua conta é do tipo especial");
        }else {
            System.out.println("Sua conta não é do tipo especial");
        }
        System.out.println("Você tem um limite de " + contaCorrente.getLimite());
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
