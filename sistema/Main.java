package sistema;

import dados.Aluguel;
import dados.Carros;
import dados.Clientes;
import dados.Motos;
import dados.Avioes;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Clientes cliente1 = new Clientes("João", "123.456.789-00");

        // Criando veículos
        Carros carro1 = new Carros("Uno 2021", 100);
        Motos moto1 = new Motos("Honda Biz", 50);
        Avioes aviao1 = new Avioes("Jato Particular", 5000);

        // Criando aluguéis
        Aluguel aluguelCarro = new Aluguel(cliente1, carro1, 3);
        Aluguel aluguelMoto = new Aluguel(cliente1, moto1, 5);
        Aluguel aluguelAviao = new Aluguel(cliente1, aviao1, 1);

        // Exibindo os recibos
        aluguelCarro.exibirRecibo();
        System.out.println("---------------------");
        aluguelMoto.exibirRecibo();
        System.out.println("---------------------");
        aluguelAviao.exibirRecibo();
        System.out.println("---------------------");
    }
}

