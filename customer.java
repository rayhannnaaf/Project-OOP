package Prak_Bab_1;

public class customer extends Game {
    private String namaCustomer;
    private String email;
    private String noHp;

    public customer(String kategori, String t_rilis, String genre, String nama_game, int harga_game, String tanggal_transaksi,
                    String namaCustomer, String email, String noHp) {
        super(kategori, t_rilis, genre, nama_game, harga_game, tanggal_transaksi);
        this.namaCustomer = namaCustomer;
        this.email = email;
        this.noHp = noHp;
    }

    public String getNamaCustomer() { return namaCustomer; }
    public void setNamaCustomer(String namaCustomer) { this.namaCustomer = namaCustomer; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getNoHp() { return noHp; }
    public void setNoHp(String noHp) { this.noHp = noHp; }

    // Method 1: Menentukan apakah email valid (sangat sederhana)
    public boolean isEmailValid() {
        return email != null && email.contains("@") && email.contains(".");
    }

    // Method 2: Format data customer lengkap
    public String infoCustomerLengkap() {
        return "Customer: " + namaCustomer + "\nEmail: " + email + "\nNo HP: " + noHp +
               "\nGame Dibeli: " + getNama() + " (" + getGenre() + ") Rp" + getHarga();
    }
}
