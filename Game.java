package Prak_Bab_1;

public class Game {
    private String kategori;
    private String t_rilis;
    private String genre;
    private String nama_game;
    private String tanggal_transaksi;
    private int harga_game;

    public Game(String kategori, String t_rilis, String genre, String nama_game, int harga_game,String tanggal_transaksi) {
        this.kategori = kategori;
        this.t_rilis = t_rilis;
        this.genre = genre;
        this.nama_game = nama_game;
        this.harga_game = harga_game;
        this.tanggal_transaksi = tanggal_transaksi;
    }

    // Getter & Setter (enkapsulasi)
    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public String getT_rilis() { return t_rilis; }
    public void setT_rilis(String t_rilis) { this.t_rilis = t_rilis; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getNama() { return nama_game; }
    public void setNama(String nama_game) { this.nama_game = nama_game; }

    public int getHarga() { return harga_game; }
    public void setHarga(int harga_game) { this.harga_game = harga_game; }

    public String getTanggal_transaksi() { return tanggal_transaksi; }
    public void setTanggal_transaksi(String tanggal_transaksi) { this.tanggal_transaksi = tanggal_transaksi; }

    
    public void displayInfo() {
        System.out.println("Nama Game: " + nama_game);
        System.out.println("Kategori: " + kategori);
        System.out.println("Genre: " + genre);
        System.out.println("Tahun Rilis: " + t_rilis);
        System.out.println("Harga: " + harga_game);
    }

    public boolean isFreeToPlay() {
        return harga_game == 0;
    }
}

