package exercicios.ConstrutoresEncapsulamentoSobrecarga.dominio;

public class Lampada {
    private String marca;
    private double price;
    private String cor;
    private String formato;

    public Lampada(String marca, double price, String cor, String formato) {
        this.marca = marca;
        this.price = price;
        this.cor = cor;
        this.formato = formato;
    }

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

    public void  ligarLampada(){
        System.out.println("**LAMPADA LIGADA**");
    }

    public void  desligarLampada(){
        System.out.println("**LAMPADA DESLIGADA**");
    }

    @Override
    public String toString() {
        return "A marca da lampada é: " + this.marca + "\n" +
                "O seu preço é de: " + this.price + "\n" +
                "A luz da lampada é da cor: " + this.cor + "\n" +
                "E ela é: " + this.formato;
    }
}
