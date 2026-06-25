/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas18052026;

/**
 *
 * @author nofer
 */
public class Mobil extends Transportasi {
    private String tujuan;

    public Mobil(String tujuan, String namaPenumpang, double jumlahBayar) {
        super(namaPenumpang, jumlahBayar);
        this.tujuan = tujuan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Transportasi Melalui Mobil");
        System.out.println("Lokasi Tujuan : " + tujuan);
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Jumlah Bayar : Rp" + jumlahBayar);
    }
}
