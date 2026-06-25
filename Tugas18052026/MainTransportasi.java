/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas18052026;

import java.util.Scanner;

/**
 *
 * @author nofer
 */
public class MainTransportasi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Deklarasi variabel objek dengan inisialisasi nilai awal null
        Transportasi transportasi = null;
        
        System.out.println("====Sistem Trasnportasi Online====");
        System.out.println("Masukkan Nama Penumpang = ");
        String id = scanner.nextLine();
        
        System.out.println("Masukkan jumlah bayar = ");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih metode transportasi = ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Bus");
        System.out.println("4. Kereta");
        System.out.println("Pilihan metode pembayaran (1/2/3/4) : ");
        int pilihan=scanner.nextInt();
        scanner.nextLine();//bufferd clear
        
        switch(pilihan){
            case 1 :System.out.println("Metode Transportasi Mobil");
                    System.out.println("Masukkan lokasi tujuan");
                    String mobil=scanner.nextLine();
                    transportasi = new Mobil(mobil,id,jumlah);
                    break;
            
            case 2 :System.out.println("Metode Transportasi Motor");
                    System.out.println("Masukkan lokasi tujuan");
                    String motor=scanner.nextLine();
                    transportasi = new Motor(motor,id,jumlah);
                    break;
                    
            case 3 :System.out.println("Metofe Transportasi Bus");
                    System.out.println("Masukkan lokasi tujuan");
                    String bus=scanner.nextLine();
                    transportasi = new Bus(bus,id,jumlah);
                    break;
                    
            case 4 :System.out.println("Metofe Transportasi Kereta");
                    System.out.println("Masukkan lokasi tujuan");
                    String kereta=scanner.nextLine();
                    transportasi = new Kereta(kereta,id,jumlah);
                    break;
        }
        
        System.out.println("\n===Konfirmasi Bukti Pembayaran===");
        transportasi.prosesPembayaran();
    }
}
