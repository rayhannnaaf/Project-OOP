package Prak_Bab_1;

public class RPGGame extends Game {

    public RPGGame(String kategori, String t_rilis, String nama, int harga) {
        super(kategori, t_rilis, "RPG", nama, harga); // genre fixed "RPG"
    }

    public void specialFeature() {
        System.out.println(nama + " memiliki fitur: Quest, Leveling, dan Storyline.");
    }
}
