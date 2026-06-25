/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum27042026;

/**
 *
 * @author nofer
 */
public class PesawatMain1 {

    public static void main(String[] args) {

        Pesawat p1 = new Pesawat(
                "Boeing 737",
                2020,
                true,
                150
        );

        System.out.println("=== DATA PESAWAT ===");
        p1.cetak();

        System.out.println();

        // reset data
        p1.reset(
                "Cessna",
                2018,
                true,
                50
        );

        System.out.println("=== SETELAH RESET ===");
        p1.cetak();
    }
}