package com.java.sga.app;

import com.java.sga.model.Itens;

public class TesteMain {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();

        // Criando e adicionando itens
        Itens item1 = new Itens(1, "Livro de Java", "Livro");
        Itens item2 = new Itens(2, "Notebook Dell", "Eletrônico");

        itemService.adicionarItem(item1);
        itemService.adicionarItem(item2);

        // Listando
        System.out.println("Itens cadastrados:");  // NOSONAR
        itemService.listarItens().forEach(i ->
            System.out.println(i.getId() + " - " + i.getNome() + " (" + i.getTipo() + ")") // NOSONAR
        );

        // Atualizando item
        itemService.atualizarItem(2, "Notebook Lenovo", "Eletrônico");

        // Buscando por ID
        System.out.println("\nBuscando item com ID 2:"); // NOSONAR
        Itens buscado = itemService.buscarPorId(2);
        if (buscado != null) {
            System.out.println(buscado.getNome() + " - " + buscado.getTipo()); // NOSONAR
        }

        // Deletando item
        itemService.removerItem(1);

        // Listando após deletar
        System.out.println("\nItens atualizados:"); // NOSONAR
        itemService.listarItens().forEach(i ->
            System.out.println(i.getId() + " - " + i.getNome()) // NOSONAR
        );
    }
}
