/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum02032026;

/*
 *  Program : GajiPegawai.java
 *  Pembuat : Noferdi Erival
 *  Tanggal : 2 Maret 2026
 *  Deskripsi : MEnghitung gaji bulanan pegawai berdasarkan jam kerja
 */

import java.util.Scanner;
public class GajiPegawai {
    public static void main(String[]args){
        int upahreguler=50000;
        int upahlembur=70000;
        int jamkerjareguler,jamkerjalembur,gajisebulan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Program Menghitung GAji Bulanan Pegawai===");
        System.out.print("\tJam kerja reguler\t= ");
        jamkerjareguler = input.nextInt();
        System.out.print("\tJam kerja lembur\t= ");
        jamkerjalembur = input.nextInt();
        gajisebulan = (jamkerjareguler*upahreguler)+(jamkerjalembur*upahlembur);
        System.out.println("\tGaji pegawai bulan ini\t= "+gajisebulan);
}
}
