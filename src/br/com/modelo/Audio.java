package br.com.modelo;

public class Audio {
    private String titulo;
    private int duracaoMinuos;
    private int totalRepoducao = 0;
    private int curtidas = 0;
    private int nota = 0;
    private String letra;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getDuracaoMinuos() {
        return duracaoMinuos;
    }

    public void setDuracaoMinuos(int duracaoMinuos) {
        this.duracaoMinuos = duracaoMinuos;
    }

    public int getTotalRepoducao() {
        return totalRepoducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getNota() {
        return nota;
    }


    public void curtir(){
        curtidas++;
    }

    public String reproduzir(String conteudo){
        return conteudo;
    }

    public void darNota(int nota){
        this.nota += nota;
    }

    public String reproduzir(){
        totalRepoducao ++;
        return letra;
    }

}
