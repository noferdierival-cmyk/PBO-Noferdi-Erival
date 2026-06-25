/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum09032026;

import java.util.Scanner;

/**
 *
 * @author LAB-SI-PC
 */
public class TugasPengulangan {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int banyak = 0;  
        int angka;

        System.out.println("Masukkan angka (berhenti jika angka <= 0)= ");

        while(true) 
        {
            angka = in.nextInt();
            if(angka <= 0) 
            {
                break; 
            }
            banyak++;
        }
        System.out.println("Jumlah angka yang diinputkan: " + banyak);
    }
}
