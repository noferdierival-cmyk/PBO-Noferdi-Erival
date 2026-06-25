/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum20042026;

/**
 *
 * @author nofer
 */
public class MainBook {
    public static void main(String[] args) {

        // Membuat object Author
        Author author1 = new Author(
                "Tere Liye",
                "tereliye@gmail.com",
                'M'
        );

        // Membuat object Book
        Book book1 = new Book(
                "Bumi",
                author1,
                85000,
                10
        );

        // Menampilkan data author
        System.out.println("=== DATA AUTHOR ===");
        System.out.println("Nama   : " + author1.getNama());
        System.out.println("Email  : " + author1.getEmail());
        System.out.println("Gender : " + author1.getGender());

        System.out.println();

        // Menampilkan data book
        System.out.println("=== DATA BOOK ===");
        System.out.println("Nama Buku : " + book1.getNama());
        System.out.println("Author    : " + book1.getAuthor());
        System.out.println("Harga     : " + book1.getPrice());
        System.out.println("Qty       : " + book1.getQty());

        System.out.println();

        // Mengubah data
        author1.setEmail("admin@tereliye.com");
        book1.setPrice(90000);

        System.out.println("=== SETELAH DIUBAH ===");
        System.out.println(author1);
        System.out.println(book1);
    }
}
