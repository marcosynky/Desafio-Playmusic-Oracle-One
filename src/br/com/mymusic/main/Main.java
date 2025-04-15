package br.com.mymusic.main;

import br.com.mymusic.models.Music;
import br.com.mymusic.models.Podcast;
import br.com.mymusic.models.MyFavorites;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto Music e configurando seus atributos
        Music mymusic = new Music();
        mymusic.setTitle("Come Together");  // Definindo o título da música
        mymusic.setArtist("The Beatles");
        mymusic.setAlbum("Abbey Road");
        mymusic.setGenre("Rock");

        // Reproduzindo a música
        for(int i = 0; i <= 100; i++) {
            mymusic.reproduce();
        }
        // Dando likes à música
        for (int i = 0; i <= 50; i++) {
            mymusic.liked();
        }

        // Criando um objeto Podcast e configurando seus atributos
        Podcast mypodcast = new Podcast();
        mypodcast.setTitle("Podcast do Marco Antônio");  // Definindo o título do podcast
        mypodcast.setHost("Marco Antônio");
        mypodcast.setDescription("O Podcast sobre o Mundo Atual");

        // Reproduzindo o podcast
        for (int i = 0; i <= 1000; i++) {
            mypodcast.reproduce();
        }
        // Dando likes ao podcast
        for (int i = 0; i <= 50; i++) {
            mypodcast.liked();
        }

        // Criando um objeto MyFavorites para adicionar os áudios aos favoritos
        MyFavorites myFavorites = new MyFavorites();

        // Tentando adicionar a música e o podcast aos favoritos
        myFavorites.includes(mymusic);  // Música
        myFavorites.includes(mypodcast);  // Podcast
    }
}
