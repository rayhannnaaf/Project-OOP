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
public class main {
   public static void main(String[] args){ 
      
       toko_game game1 = new toko_game("mobile","2015","rpg","mobile legend",0); //membuat objek baru dari kelas tokogame dengan constructor
         toko_game game2 = new toko_game("pc","2023","rpg","Resident evil 4 remake",200000); //membuat objek baru dari kelas tokogame dengan constructor
 

       game1.displayInfo();//method yang digunakan untuk output dari setiap atribut yang memiliki value
             if (game1.isFreeToPlay()) {//method yang digunakan untuk memeriksa apakah game ini gratis atau berbayar
    System.out.println(game1.nama + " adalah game gratis!");
} else {
    System.out.println(game1.nama + " adalah game berbayar.");
}
                 game2.displayInfo();//method yang digunakan untuk output dari setiap atribut yang memiliki value
             if (game2.isFreeToPlay()) {//method yang digunakan untuk memeriksa apakah game ini gratis atau berbayar
    System.out.println(game2.nama + " adalah game gratis!");
} else {
    System.out.println(game2.nama + " adalah game berbayar.");
}
             game1.comparePrice(game2);
}
}
