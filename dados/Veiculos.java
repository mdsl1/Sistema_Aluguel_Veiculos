package dados;

public class Veiculos {
    private String modelo;
    private double precoDiaria;

    public Veiculos(String modelo, double precoDiaria) {
        this.modelo = modelo;
        this.precoDiaria = precoDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public double calcularAluguel(int dias) {
        return dias * precoDiaria;
    }
}
