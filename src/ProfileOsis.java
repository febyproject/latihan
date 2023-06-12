/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ProfileOsis {
    String Nama, Kelas;
    int NIM , Suara ;
    
    //membuat konstruktor
    
    ProfileOsis(String Nama, String Kelas, int NIM, int Suara){
        this.Nama = Nama;
        this.Kelas = Kelas;
        this.NIM = NIM;
        this.Suara = Suara;
    }
    
    //Membuat method mutator
    void setTambahSuara (){
        Suara = Suara + 20;
    }
    
   //Memmbuat method Accesor
    int getTambahSuara (){
      return Suara;  
    }
}
