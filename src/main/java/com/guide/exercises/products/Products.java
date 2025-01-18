package com.guide.exercises.products;

import java.util.ArrayList;
import java.util.List;

public class Products<T>{

    // Lista para armazenar objetos da classe Produto
    private List<Produto> produtos;

    // Construtor
    public Products(){
        this.produtos = new ArrayList<>();
    }

    // Metodo para adicionar um produto
    public void addProduct(String nome, double preco,int quantidade){
        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
    }


    public void showProducts() {
        if (produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto); // Exibe os detalhes de cada produto
            }
        }
    }

    // Classe interna Produto
    private static class Produto{
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(String nome, double preco, int quantidade){
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        // Sobrescrevendo toString para exibir informações do produto
        @Override
        public String toString() {
            return "Produto{" +
                    "nome='" + nome + '\'' +
                    ", preco=" + preco +
                    ", quantidade=" + quantidade +
                    '}';
        }
    }
    public static void main(String[] args) {
        Products products = new Products();

        products.addProduct("Notebook", 2500.00, 5);

        products.showProducts();
    }
}
