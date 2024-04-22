package exercicios.variaveisEmetodosSTATICOS.test;

import exercicios.variaveisEmetodosSTATICOS.dominio.Contador;

import java.util.Scanner;

public class ContadorTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continuarPrograma = 'S';
        int escolha;
        Contador cont01 = new Contador();
        Contador cont02 = new Contador();
        Contador cont03 = new Contador();
        System.out.println(cont03);
        System.out.println();

        while (continuarPrograma == 'S'){
            System.out.println("Informe qual opção deseja realizar: ");
            System.out.println("1- INCREMENTAR CONTADOR / 2- ZERAR CONTADOR / 3- EXIBIR O CONTADOR / 4- ENCERRAR PROGRAMA");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    System.out.println();
                    System.out.println("Você escplheu incrementar o contador: ");
                    cont01.incrementarContador();
                    System.out.println(cont01);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Você escplheu zerar o contador: ");
                    cont01.zerarContador();
                    System.out.println(cont01);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Você escplheu exibir o contador: ");
                    System.out.println(cont01);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Você encerrou o programa!");
                    continuarPrograma = 'N';
                    System.out.println();
                    break;
            }
        }

    }
}
