/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan41;

/**
 *
 * Nama     :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi : Program ini berisi program untuk menampilkan masa jenis
 */
public class Kubus {
    private int sisi,massa;
    
    public int getSisi(){
        return this.sisi;
   } 
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public int getMassa(){
        return this.massa;
    }
    
    public void setMassa(int massa){
         this.massa = massa;
    }    
    
    public int hitungVolume(int parSisi){
        return parSisi*parSisi*parSisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa/volume;
    }
    
}
