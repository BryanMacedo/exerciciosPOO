package exercicios.classes.test;

import exercicios.classes.Contato;

import java.util.Scanner;

public class ContatoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Contato contato = new Contato();

        System.out.println("Digite um nome para o contato: ");
        contato.setNome(input.nextLine());
        System.out.println();

        System.out.println("Digite um E-mail para o contato: ");
        contato.seteMail(input.nextLine());
        System.out.println();

        System.out.println("Digite um numero para o contato: ");
        contato.setNumero(input.nextInt());
        System.out.println();

        System.out.println("NOME: " + contato.getNome());
        System.out.println("E-MAIL: " + contato.geteMail());
        System.out.println("NUMERO: " + contato.getNumero());
    }
}
