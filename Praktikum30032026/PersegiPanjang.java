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

public class PersegiPanjang {
    
        int panjang;
        int lebar;
        
        //konstruktor
        PersegiPanjang(){
            
        }
        
        PersegiPanjang(int a,int b){
            panjang=a;
            lebar=b;
        }
        
        //method
        int hitungLuas(){
            return (panjang*lebar);
        }
        
        int hitungKeliling(){
            return (2*(panjang*lebar));
        }
    }

