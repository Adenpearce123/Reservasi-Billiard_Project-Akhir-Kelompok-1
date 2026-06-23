/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billiard_asik;

/**
 *
 * @author Lenovo
 */
public class TestKoneksi {
     public static void main(String[] args) {

        if(Koneksi.getConnection() != null) {

            System.out.println(
                    "Koneksi Berhasil"
            );

        } else {

            System.out.println(
                    "Koneksi Gagal"
            );
        }
    }
    
}
