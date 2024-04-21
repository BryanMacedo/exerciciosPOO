package exercicios.ConstrutoresEncapsulamentoSobrecarga.test;

import exercicios.ConstrutoresEncapsulamentoSobrecarga.dominio.Lampada;

import java.util.Scanner;

public class LampadaTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lampada lampada = new Lampada("Philips", 15.00, "Amarela", "Redonda");
        String ligarDesligarLampada;
        System.out.println(lampada);
        System.out.println();

        do {
            System.out.println("Deseja ligar ou desligar a lampada? ");
            ligarDesligarLampada = input.nextLine();

            if (ligarDesligarLampada.equals("ligar")){
                lampada.ligarLampada();
                System.out.println();
            }
        }while (ligarDesligarLampada.equals("ligar"));

        System.out.println();
        lampada.desligarLampada();
    }
}
