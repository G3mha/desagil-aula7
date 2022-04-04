package br.edu.insper.desagil.aula7.tikstik;

import java.util.HashMap;
import java.util.Map;

public class Video {
    private Produto produto;
    private Map<String,Integer> avaliacoes;

    public Video(Produto produto) {
        this.produto = produto;
        this.avaliacoes = new HashMap<>();
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void adicionaAvaliacao(Usuario usuario, int avaliacao) {
        String nome = usuario.getNome();
        this.avaliacoes.put(nome, avaliacao);
    }

    public int mediaAvaliacoes() {
        int soma = 0;
        for (int avaliacao : this.avaliacoes.values()) {
            soma += avaliacao;
        }
        return (int) Math.round(soma / this.avaliacoes.size());
    }
}
