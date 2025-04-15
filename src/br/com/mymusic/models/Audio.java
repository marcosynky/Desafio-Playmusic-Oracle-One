package br.com.mymusic.models;

public class Audio {

    // Atributos privados da classe Audio, representando informações básicas sobre o áudio
    private String title;           // Título do áudio (música, podcast, etc.)
    private int totalReproductions; // Número total de reproduções do áudio
    private int totalLikes;         // Número total de "likes" do áudio
    private int classification;     // Classificação do áudio, pode ser usada para representar uma avaliação média

    // Método getter para o atributo 'title', permitindo o acesso ao título do áudio
    public String getTitle() {
        return title; // Retorna o título do áudio
    }

    // Método setter para o atributo 'title', permitindo a alteração do título do áudio
    public void setTitle(String title) {
        this.title = title; // Atribui um novo valor ao título do áudio
    }

    // Método getter para o atributo 'totalReproductions', permitindo acessar o número de reproduções
    public int getTotalReproductions() {
        return totalReproductions; // Retorna o número de reproduções do áudio
    }

    // Método getter para o atributo 'totalLikes', permitindo acessar o número de likes
    public int getTotalLikes() {
        return totalLikes; // Retorna o número de likes do áudio
    }

    // Método getter para o atributo 'classification', permitindo acessar a classificação do áudio
    public int getClassification() {
        return classification; // Retorna a classificação do áudio
    }

    // Método para incrementar o número de likes quando o áudio recebe um "like"
    public void liked() {
        this.totalLikes++; // Aumenta o número de likes em 1
    }

    // Método para incrementar o número de reproduções quando o áudio é reproduzido
    public void reproduce() {
        this.totalReproductions++; // Aumenta o número de reproduções em 1
    }
}
