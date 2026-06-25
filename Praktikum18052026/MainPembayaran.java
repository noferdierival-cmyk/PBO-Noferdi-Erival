/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum18052026;

import java.util.Scanner;

/**
 *
 * @author nofer
 */
public class MainPembayaran {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Deklarasi variabel objek dengan inisialisasi nilai awal null
        Pembayaran pembayaran = null;
        
        System.out.println("====Sistem Pembayaran Toko Online====");
        System.out.println("Masukkan ID Transaksi = ");
        String id = scanner.nextLine();
        
        System.out.println("Masukkan jumlah bayar = ");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih metode pembayaran = ");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.println("Pilihan metode pembayaran (1/2/3) : ");
        int pilihan=scanner.nextInt();
        scanner.nextLine();//bufferd clear
        
        switch(pilihan){
            case 1 :System.out.println("Metode Transfer Bank");
                    System.out.println("Masukkan nama bank tujuan");
                    String bank=scanner.nextLine();
                    pembayaran = new PembayaranTransfer(bank,jumlah,id);
                    break;
            
            case 2 :System.out.println("Metode Kartu Kredit");
                    System.out.println("Masukkan nomor kartu kredit");
                    String kartuKredit=scanner.nextLine();
                    pembayaran = new PembayaranKartuKredit(kartuKredit,jumlah,id);
                    break;
                    
            case 3 :System.out.println("Metofe E-wallet");
                    System.out.println("Masukkan jenis E-Wallet");
                    String wallet=scanner.nextLine();
                    pembayaran = new PembayaranEWallet(wallet,jumlah,id);
                    break;
        }
        
        System.out.println("\n===Konfirmasi Bukti Pembayaran===");
        pembayaran.prosesPembayaran();
    }
}
