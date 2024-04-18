package exercicios.metodos;

public class Lampada {
    private String marca;
    private double price;
    private String cor;
    private String formato;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "A marca da lampada é: " + this.marca +
                " o seu preço é de R$: " + this.price +
                " a luz da lampada é da cor: " + this.cor +
                " e ela é: " + this.formato;
    }

    // M E T O D O S

    public void ligarLampada(){
        System.out.println("LAMPADA LIGADA!");
    }

    public void desligarLampada(){
        System.out.println("LAMPADA DESLIGADA!");
    }
}

