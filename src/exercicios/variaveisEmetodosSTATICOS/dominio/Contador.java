package exercicios.variaveisEmetodosSTATICOS.dominio;

public class Contador {
    public static int  CONTADOR;

    public Contador() {
        CONTADOR++;
    }

    public void zerarContador(){
        CONTADOR = 0;
    }

    public void incrementarContador(){
        CONTADOR++;
    }

    @Override
    public String toString() {
        return "Contador: " + this.CONTADOR;
    }
}
