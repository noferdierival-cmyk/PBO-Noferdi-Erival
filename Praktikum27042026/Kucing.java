/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum27042026;

/**
 *
 * @author nofer
 */
public class Kucing extends Hewan {
    
    public Kucing(String nama){
        super(nama); // mengakses property super class
    }
    
    @Override
    public void bersuara(){
        super.bersuara(); // mengakses method super class
        System.out.println(nama +"berkata Meong!!!");
    }
}
