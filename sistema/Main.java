package sistema;

import dados.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculos> automovel = new ArrayList<>();
        ArrayList<Clientes> clientela = new ArrayList<>();
        ArrayList<Aluguel> alugueis = new ArrayList<>();

        while (true) {
            System.out.println("\n=====+ LOCAÇÃO DE VEÍCULOS +=====\n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Veículo");
            System.out.println("3 - Alugar Veículo");
            System.out.println("4 - Listar Aluguéis");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int op = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            if (op == 1) {
                // Cadastrar Cliente
                System.out.print("Nome do cliente: ");
                String nome = sc.nextLine();
                System.out.print("CPF do cliente: ");
                String cpf = sc.nextLine();
                clientela.add(new Clientes(nome, cpf));
                System.out.println("Cliente cadastrado com sucesso!");

            } else if (op == 2) {
                // Cadastrar Veículo
                System.out.println("Escolha o tipo de veículo: 1-Carro | 2-Moto | 3-Avião");
                int tipo = sc.nextInt();
                sc.nextLine();

                System.out.print("Modelo do veículo: ");
                String modelo = sc.nextLine();
                System.out.print("Preço da diária: ");
                double precoDiaria = sc.nextDouble();

                if (tipo == 1) automovel.add(new Carros(modelo, precoDiaria));
                else if (tipo == 2) automovel.add(new Motos(modelo, precoDiaria));
                else if (tipo == 3) automovel.add(new Avioes(modelo, precoDiaria));

                System.out.println("Veículo cadastrado com sucesso!");

            } else if (op == 3) {
                // Alugar Veículo
                if (clientela.isEmpty() || automovel.isEmpty()) {
                    System.out.println("Cadastre pelo menos um cliente e um veículo antes de alugar.");
                    continue;
                }

                System.out.println("Clientes disponíveis:");
                for (int i = 0; i < clientela.size(); i++) {
                    System.out.println(i + " - " + clientela.get(i));
                }
                System.out.print("Escolha um cliente: ");
                int clienteIndex = sc.nextInt();

                System.out.println("Veículos disponíveis:");
                for (int i = 0; i < automovel.size(); i++) {
                    System.out.println(i + " - " + automovel.get(i));
                }
                System.out.print("Escolha um veículo: ");
                int veiculoIndex = sc.nextInt();

                System.out.print("Quantos dias deseja alugar? ");
                int dias = sc.nextInt();

                Aluguel aluguel = new Aluguel(clientela.get(clienteIndex), automovel.get(veiculoIndex), dias);
                alugueis.add(aluguel);
                System.out.println("Aluguel realizado com sucesso!");
                aluguel.exibirRecibo();

            } else if (op == 4) {
                // Listar Aluguéis
                if (alugueis.isEmpty()) {
                    System.out.println("Nenhum aluguel registrado.");
                } else {
                    System.out.println("\n=== Lista de Aluguéis ===");
                    for (Aluguel aluguel : alugueis) {
                        System.out.println(aluguel);
                    }
                }

            } else if (op == 5) {
                // Sair do sistema
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}
