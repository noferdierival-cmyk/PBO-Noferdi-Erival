/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum27042026;

/**
 *
 * @author nofer
 */
public class MainHewan {
    
    public static void main(String[] args){
        // pembuatan objek
        Hewan hewanku=new Hewan("Makhluk hidup");
        Kucing kucingku=new Kucing("Bobby");
        Anjing anjingku=new Anjing("Helly");
        
        // mengakses super class
        System.out.println("Tampilkan akses super class Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        
        // mengakses sub class Kucing
        System.out.println("\nTampilkan akses sub class Kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        // mengakses sub class Anjing
        System.out.println("\nTampilkan akses sub class Anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
    }
}
