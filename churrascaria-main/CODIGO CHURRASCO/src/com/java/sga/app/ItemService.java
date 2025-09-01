package com.java.sga.app;

import com.java.sga.model.Itens;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private List<Itens> itens = new ArrayList<>();

    // CREATE
    public void adicionarItem(Itens item) {
        itens.add(item);
    }

    // READ
    public List<Itens> listarItens() {
        return itens;
    }

    public Itens buscarPorId(int id) {
        return itens.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // UPDATE
    public boolean atualizarItem(int id, String novoNome, String novoTipo) {
        Itens item = buscarPorId(id);
        if (item != null) {
            item.setNome(novoNome);
            item.setTipo(novoTipo);
            return true;
        }
        return false;
    }

    // DELETE
    public boolean removerItem(int id) {
        return itens.removeIf(i -> i.getId() == id);
    }
}