/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas18052026;

/**
 *
 * @author nofer
 */
public abstract class Transportasi {
    protected String namaPenumpang;
    protected double jumlahBayar;

    public Transportasi(String namaPenumpang, double jumlahBayar) {
        this.namaPenumpang = namaPenumpang;
        this.jumlahBayar = jumlahBayar;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }
    
    public abstract void prosesPembayaran();
}
