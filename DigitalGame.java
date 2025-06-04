package Prak_Bab_1;

public class DigitalGame extends Game {
//    public DigitalGame(String kategori, String t_rilis, String genre, String nama, int harga) {
//        super(kategori, t_rilis, genre, nama, harga);
//    }

    
    
    public DigitalGame(String kategori, String t_rilis, String genre, String nama_game, int harga_game, String tanggal_transaksi) {
        super(kategori, t_rilis, genre, nama_game, harga_game, tanggal_transaksi);
    }

    public void downloadInfo() {
        System.out.println(getNama() + " tersedia untuk diunduh di platform digital.");
    }
}
