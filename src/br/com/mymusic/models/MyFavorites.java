package br.com.mymusic.models;

public class MyFavorites {

    // Método que adiciona um áudio aos favoritos com base na sua classificação
    public void includes(Audio audio) {

        // Verifica se a classificação do áudio é maior ou igual a 9
        if (audio.getClassification() >= 9) {
            // Se a classificação for 9 ou superior, a música é considerada boa e é adicionada aos favoritos
            System.out.println("A musica " + audio.getTitle() + " foi adicionada aos favoritos");
        } else {
            // Se a classificação for menor que 9, a música não é considerada favorita
            System.out.println("A musica " + audio.getTitle() + " não foi adicionada aos favoritos");
        }

    }
}
