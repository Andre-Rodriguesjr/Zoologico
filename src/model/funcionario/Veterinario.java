package model.funcionario;

import interfaces.Tratavel;
import zoologico.Zoologico;

public class Veterinario implements Tratavel  {
    private String nome;

    @Override
    public void tratar() {
        System.out.println("Está cuidando dos animais");
    }

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
