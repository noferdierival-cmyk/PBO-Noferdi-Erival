/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum20042026;

/**
 *
 * @author nofer
 */
public class Author {
    private final String nama;
    private String email;
    private final char gender;
         
    public Author(String nama,String email,char gender){
        this.nama=nama;
        this.email=email;
        this.gender=gender;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public char getGender(){
        return gender;
    }
    
    public String toString(){
        return nama + " (" + gender + ") at " + email;
    }
}
