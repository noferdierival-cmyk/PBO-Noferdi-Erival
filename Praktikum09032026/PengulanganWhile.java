/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum09032026;

/**
 *
 * @author LAB-SI-PC
 */
public class PengulanganWhile {
    
    public static void main(String[] args){
        System.out.println("Perulangan 1-10");
        int i = 1;
        while(i <= 10) 
        { 
            System.out.print("\t" + i);
            i++;
        }
        System.out.println("\nPerulangan 10-1");
        i = 10; // reset nilai i
        while(i >= 1) 
        { 
            System.out.print("\t" + i);
            i--;
        }
    }       
}
