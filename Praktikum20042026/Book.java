/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum20042026;

/**
 *
 * @author nofer
 */
public class Book {
    private final String nama;
    private final Author author;
    private double price;
    private int qty;
    
    public Book(String nama,Author author,double price,int qty){
        this.nama=nama;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    
    public String getNama(){
        return nama;
    }
    
    public Author getAuthor(){
        return author;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    
    public int getQty(){
        return qty;
    }
    
    public void setQty(int qty){
        this.qty=qty;
    }
    
    public String toString(){
        return "'" + nama + "' by " + author;
    }
}
