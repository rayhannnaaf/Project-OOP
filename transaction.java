/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak_Bab_1;

/**
 *
 * @author rayha
 */
public class transaction extends Game {
    int harga_game;
    String nama_game;
    String t_rilis;
    String kategori;
    String tanggal_transaksi;
    String genre;
    
     public transaction(int harga_game,String nama_game, String t_rilis, String kategori, String tanggal_transaksi,String genre) {
        super(kategori,t_rilis,tanggal_transaksi,nama_game,harga_game,genre);
        this.kategori = kategori;
        this.t_rilis = t_rilis;
        this.tanggal_transaksi = tanggal_transaksi;
        this.nama_game = nama_game;
        this.harga_game = harga_game;
    }
     
     
        
     
}
