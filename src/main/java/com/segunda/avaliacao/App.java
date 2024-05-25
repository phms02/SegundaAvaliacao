package com.segunda.avaliacao;

public class App {
    public static void main(String[] args) {
        //? Criando instâncias de Carro...
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 65000.0);
        Carro carro2 = new Carro("Honda", "Civic", 2023, 70000.0);

        //? Exibindo informações dos carros...
        System.out.println("Informações do Carro 1: ");
        carro1.exibirInformacoes();

        System.out.println("\nInformações do Carro 2: ");
        carro2.exibirInformacoes();

        //? Vendendo o Carro 1...
        carro1.venderCarro();

        //? Exibindo informações atualizadas do Carro 1 após a venda...
        System.out.println("\nInformações do Carro 1 Após Venda:");
        carro1.exibirInformacoes();
    }
}