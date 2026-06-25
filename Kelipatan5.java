/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum02032026;

/*
 *  Program : KElipatan5.java
 *  Pembuat : Noferdi Erival
 *  Tanggal : 2 Maret 2026
 *  Deskripsi : Menentukan sebuah bilangan merupakan kelipatan 5 atau tidak
 */

import java.util.Scanner;
public class Kelipatan5 {
    public static void main(String[]args){
        int bilangan;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("===Program Menentukan Kelipatan 5 atau Tidak===");
        System.out.print("Bilangan = ");
        bilangan = in.nextInt();
        if (bilangan%5==0)
            System.out.println(bilangan +" merupakan bilangan kelipatan 5");
        else 
            System.out.println(bilangan +" BUKAN bilangan kelipatan 5");
    }
}