/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.java;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        // Meminta pengguna memasukkan batas awal dan batas akhir
        int awal = masukanAngka("Masukkan batas awal: ", masukan);
        int akhir = masukanAngka("Masukkan batas akhir: ", masukan);
        
        // Menampilkan bilangan prima dalam rentang yang ditentukan
        System.out.print("Bilangan prima dari " + awal + " hingga " + akhir + " adalah: ");
        tampilkanPrima(awal, akhir);
        
        // Menampilkan bilangan komposit dalam rentang yang ditentukan
        System.out.print("Bilangan komposit dari " + awal + " hingga " + akhir + " adalah: ");
        tampilkanKomposit(awal, akhir);
    }
    
    // Method untuk meminta pengguna memasukkan angka
    public static int masukanAngka(String pesan, Scanner masukan) {
        System.out.print(pesan);
        return masukan.nextInt();
    }
    
    // Method untuk menampilkan bilangan prima dalam rentang yang ditentukan
    public static void tampilkanPrima(int awal, int akhir) {
        for (int i = awal; i <= akhir; i++) {
            if (apakahPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Membuat baris baru
    }
    
    // Method untuk menampilkan bilangan komposit dalam rentang yang ditentukan
    public static void tampilkanKomposit(int awal, int akhir) {
        for (int i = awal; i <= akhir; i++) {
            if (!apakahPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Membuat baris baru
    }
    
    // Fungsi untuk memeriksa apakah suatu bilangan adalah prima atau bukan
    public static boolean apakahPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}

