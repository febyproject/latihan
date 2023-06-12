/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class kandidat {
    public static void main(String[] args) {
        ProfileOsis kandidat1 = new ProfileOsis("Feby","11 IPA ", 2110010473, 570);
        
        System.out.println("Nama : " + kandidat1.Nama);
        System.out.println("Kelas : " + kandidat1.Kelas);
        System.out.println("NIM : " + kandidat1.NIM);
        System.out.println("Suara : " + kandidat1.Suara);
        
        kandidat1.setTambahSuara();
        System.out.println("Hasil Suara Setelah di tambahkan " +kandidat1.getTambahSuara());
    }
}
