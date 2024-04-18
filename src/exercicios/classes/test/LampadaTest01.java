package exercicios.classes.test;

import exercicios.classes.Lampada;

import java.util.Scanner;

public class LampadaTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lampada lampada = new Lampada();

        System.out.println("Informe a marca da lampada: ");
        lampada.setMarca(input.nextLine());
        System.out.println();

        System.out.println("Informe o preço da lampada: ");
        lampada.setPrice(input.nextDouble());
        System.out.println();

        System.out.println("Informe a cor da luz da lampada: ");
        input.nextLine();
        lampada.setCor(input.nextLine());
        System.out.println();

        System.out.println("Informe o formato desta lampada: ");
        lampada.setFormato(input.nextLine());
        System.out.println();

        System.out.println(lampada);
    }


}
