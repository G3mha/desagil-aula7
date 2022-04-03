package br.edu.insper.desagil.aula7.tikstik;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Video> videos;

    public Usuario(String nome) {
        this.nome = nome;
        this.videos = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void adicionaVideo(Video video) {
        this.videos.add(video);
    }

    public double mediaAvaliacoes() {
        double soma = 0;
        for (Video video : this.videos) {
            soma += video.mediaAvaliacoes();
        }
        return soma / this.videos.size();
    }
}
