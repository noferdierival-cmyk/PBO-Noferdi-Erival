/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum27042026;

/**
 *
 * @author nofer
 */
public class Kendaraan {
    
    private String nama;
    private int tahunProduksi;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public  int getTahunProduksi(){
        return tahunProduksi;
    }
    
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi=tahunProduksi;
    }
    
    public Kendaraan(){
        
    }
    
    public Kendaraan(String nama,int tahunProduksi){
        this.nama=nama;
        this.tahunProduksi=tahunProduksi;
    }
    
    public void cetak(){
        System.out.println("Nama kendaraan = " + nama);
        System.out.println("Tahun produksi = " + tahunProduksi);
    }
}
