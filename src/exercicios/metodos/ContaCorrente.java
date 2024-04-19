package exercicios.metodos;

import java.util.Scanner;

//Cria uma classe para representar uma conta corrente que possui um número,
// um saldo, um status, um status que informa se ela é especial ou não, um limite.
// Desenvolva métodos para realizar saque(verificando se o cliente pode realizar saques),
// depositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não.
// Desenvolva um programa para testar essa classe.
public class ContaCorrente {
    public String nomeBanco = "Nubank";
    private int numeroConta;
    private double saldo;
    private boolean isEspecial;
    private double limite;

    Scanner input = new Scanner(System.in);

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return isEspecial;
    }

    public void setEspecial(boolean especial) {
        isEspecial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(){
        if (this.saldo > 0.0){
            System.out.println("Quanto deseja sacar ? ");
            double valorSaque = input.nextDouble();
            System.out.println();

            if (valorSaque > saldo){
                System.out.println("VALOR DE SAQUE INDISPONIVEL!!");
            }else {
                saldo = saldo - valorSaque;
                System.out.println("Você sacou R$ " + valorSaque + " de sua conta!");
                System.out.println();
            }
        }else {
            System.out.println("NEGADA TENTATIVA DE SAQUE!");
            System.out.println("SUA CONTA ESTA ZERADA OU NEGATIVA!");
        }
    }

    public void depositar(){
        System.out.println("Qual o valor deseja depositar ? ");
        double valorDeposito = input.nextDouble();
        System.out.println();
        if (valorDeposito == 0){
            System.out.println("TENTATIVA DE DEPOSITO NÃO EFETUADA");
            System.out.println();
        }else {
            saldo = saldo + valorDeposito;
            System.out.println("Você depositou R$ " + valorDeposito);
            System.out.println();
        }
    }

    public void consultarSaldo(){
        if (saldo <= 0){
            System.out.println("Seu saldo é de R$ " + this.saldo);
            System.out.println("Você atualmente esta no *CHEQUE ESPECIAL*");
            System.out.println();
        }else {
            System.out.println("Seu saldo é de R$ " + this.saldo);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Informações de sua conta corrente na Nubank: \n" +
                "Seu numero de conta é: " + this.numeroConta + "\n" +
                "seu saldo é de R$ " + this.saldo + "\n" +
                "seu tipo de conta é especial? " + this.isEspecial + "\n"+
                "e seu limite atual é de: " + this.limite + "\n";
    }
}
