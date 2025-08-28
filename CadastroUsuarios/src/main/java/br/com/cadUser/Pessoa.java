package br.com.cadUser;

import java.util.ArrayList;
import java.util.List;

public class Pessoa{

    private String nome;
    private List <String> nomesCadastrados = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomesCadastrados() {
        return nomesCadastrados;
    }
    public void setNomesCadastrados(List<String> nomesCadastrados) {
        this.nomesCadastrados = nomesCadastrados;
    }

    public String cadastrar() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomesCadastrados.add(nome);
            nome = "";
        }
        return null;
    }
}
