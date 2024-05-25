package com.segunda.avaliacao;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;
    private boolean vendido;

    public Carro(String marca, String modelo, int anoFabricacao, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.vendido = false;
    }

    //* Getters and Setters...
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void venderCarro() {
        this.vendido = true;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Preço: R$" + preco);
        System.out.println("Status: " + (vendido ? "Vendido" : "Disponível"));
    }
}