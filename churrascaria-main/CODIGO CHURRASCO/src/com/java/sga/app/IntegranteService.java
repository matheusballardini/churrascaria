package com.java.sga.app;

import com.java.sga.model.Integrantes;

import java.util.ArrayList;
import java.util.List;

public class IntegranteService {
    private List<Integrantes> integrantes = new ArrayList<>();

    // CREATE
    public void adicionarIntegrante(Integrantes integrante) {
        integrantes.add(integrante);
    }

    // READ
    public List<Integrantes> listarIntegrantes() {
        return integrantes;
    }

    public Integrantes buscarPorId(int id) {
        return integrantes.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // UPDATE
    public boolean atualizarIntegrante(int id, String novoNome, int novaIdade) {
        Integrantes i = buscarPorId(id);
        if (i != null) {
            i.setNome(novoNome);
            i.setIdade(novaIdade);
            return true;
        }
        return false;
    }

    // DELETE
    public boolean removerIntegrante(int id) {
        return integrantes.removeIf(i -> i.getId() == id);
    }
}
