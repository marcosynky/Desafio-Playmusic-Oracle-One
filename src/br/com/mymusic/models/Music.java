package br.com.mymusic.models;

// A classe Music é uma extensão da classe Audio, indicando que Music é um tipo de Audio com mais propriedades.
public class Music extends Audio {

    // Atributos específicos da classe Music que representam informações sobre a música.
    private String artist; // Artista da música
    private String album;  // Álbum no qual a música está
    private String genre;  // Gênero musical da música

    // Método getter para o atributo 'artist'
    public String getArtist() {
        return artist; // Retorna o nome do artista
    }

    // Método setter para o atributo 'artist'
    public void setArtist(String artist) {
        this.artist = artist; // Atribui um valor ao nome do artista
    }

    // Método getter para o atributo 'album'
    public String getAlbum() {
        return album; // Retorna o nome do álbum
    }

    // Método setter para o atributo 'album'
    public void setAlbum(String album) {
        this.album = album; // Atribui um valor ao nome do álbum
    }

    // Método getter para o atributo 'genre'
    public String getGenre() {
        return genre; // Retorna o gênero musical
    }

    // Método setter para o atributo 'genre'
    public void setGenre(String genre) {
        this.genre = genre; // Atribui um valor ao gênero musical
    }

    // Método sobrescrito para obter a classificação da música.
    @Override
    public int getClassification() {
        // Se o número total de "likes" for maior que 500, a classificação será 10
        if(this.getTotalLikes() > 50) {
            return 10;
        }
        // Se o número total de "likes" for maior que 100, a classificação será 8
        else if(this.getTotalLikes() > 10) {
            return 8;
        }
        // Se não se enquadrar nas condições anteriores, utiliza a implementação da classe pai (Audio)
        return super.getClassification();
    }
}
