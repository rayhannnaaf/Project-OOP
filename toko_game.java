package Prak_Bab_1;

public class toko_game extends Game {
    
        public toko_game(String kategori, String t_rilis, String genre, String nama, int harga,String tanggal_transaksi) {
        super(kategori, t_rilis, genre, nama, harga,tanggal_transaksi);
    }

//    public toko_game(String kategori, String t_rilis, String genre, String nama, int harga,String tanggal_transaksi) {
//        this.kategori = kategori;
//        this.t_rilis = t_rilis;
//        this.genre = genre;
//        this.nama_game = nama;
//        this.harga_game = harga;
//        this.tanggal_transaksi = tanggal_transaksi;
//    }

  
@Override
public void displayInfo() {
    System.out.println("=== Game dari Toko ===");
    super.displayInfo(); // dari Game
    System.out.println("Harga: " + getHarga());
}
    public void comparePrice(toko_game gameLain) {
        if (this.getHarga() < gameLain.getHarga()) {
            System.out.println(this.getNama() + " lebih murah dari " + gameLain.getNama());
        } else if (this.getHarga() > gameLain.getHarga()) {
            System.out.println(this.getNama() + " lebih mahal dari " + gameLain.getNama());
        } else {
            System.out.println(this.getNama() + " dan " + gameLain.getNama() + " memiliki harga yang sama.");
        }
    }
    public void setGame(String nama, String kategori) {
    setNama(nama);
    setKategori(kategori);
}
}
