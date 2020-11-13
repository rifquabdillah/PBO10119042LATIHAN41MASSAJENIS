/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan41;

/**
 *
 * @author Muhammad Rifqu Abdillah
 */
public class PBO10119042LATIHAN41 {

    /**
     * Nama     :Muhammad Rifqu Abdillah
     * Kelas    :IF-1
     * NIM      :10119042
     * Deskripsi : Program ini berisi program untuk menampilkan masa jenis
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        
        kubus.setSisi(5);
        kubus.setMassa(250);
        int sisi = kubus.getSisi();
        int massa = kubus.getMassa();
        int volume = kubus.hitungVolume(sisi);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : " + sisi);
        System.out.println("Massa: " + massa);
        System.out.println();
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume      : " + volume);
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(massa,volume));
    }
    
    
}
