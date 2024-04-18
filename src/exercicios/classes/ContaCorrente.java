package exercicios.classes;

public class ContaCorrente {
    public String nomeBanco = "Nubank";
    private int numeroConta;
    private double saldo;
    private boolean isEspecial;
    private double limite;

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

    @Override
    public String toString() {
        return "Informações de sua conta corrente na Nubank: " +
                "Seu numero de conta é: " + this.numeroConta +
                " seu saldo é de R$ " + this.saldo +
                " seu tipo de conta é especial? " + this.isEspecial +
                " e seu limite atual é de: " + this.limite;
    }
}
