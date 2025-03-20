package dados;

public class Aluguel {
    private Clientes cliente;
    private Veiculos veiculo;
    private int dias;

    public Aluguel(Clientes cliente, Veiculos veiculo, int dias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dias = dias;
    }

    public double calcularTotal() {
        return veiculo.calcularAluguel(dias);
    }

    public void exibirRecibo() {
        System.out.println("\nRecibo de Aluguel:\n");
        System.out.println("Cliente: " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
        System.out.println("Veículo: " + veiculo.getModelo());
        System.out.println("Dias alugados: " + dias);
        System.out.println("Total a pagar: R$ " + calcularTotal() + "\n");
    }
}
