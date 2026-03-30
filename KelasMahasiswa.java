/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum30032026;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;

public class KelasMahasiswa {
    int nim;
    char nama;
    double tugas;
    double uts;
    double uas;
    
    //konstruktor
    KelasMahasiswa(){
        
    }
    
    KelasMahasiswa(int a,char b,double c,double d, double e){
        nim=a;
        nama=b;
        tugas=c;
        uts=d;
        uas=e;
    }
    
    //method
    double hitungAkhir(){
        return (0.25*tugas+0.35*uts+0.40*uas);
    }
}
