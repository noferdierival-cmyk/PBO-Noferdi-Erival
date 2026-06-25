/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum30032026;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        KelasMahasiswa pp1 = new KelasMahasiswa();
        pp1.nim = 250108200;
        pp1.nama = 10;
        pp1.tugas = 80;
        pp1.uts = 85;
        pp1.uas = 87;
        double akhir = pp1.hitungAkhir();
        System.out.println("Objek Nilai Akhir Pertama");
        System.out.println("Nama = "+pp1.nama);
        System.out.println("NIM = "+pp1.nim);
        System.out.println("Nilai Tugas = "+pp1.tugas);
        System.out.println("Nilai UTS = "+pp1.uts);
        System.out.println("Nilai UAS = "+pp1.uas);
        System.out.println("Nilai Akhir = "+akhir);
    }
    
}
