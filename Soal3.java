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

public class Soal3 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        // Meminta pengguna memasukkan nilai N
        int N = masukanAngka("Masukkan nilai N (antara 1 dan 1000): ", masukan);
        
        // Validasi nilai N agar berada dalam rentang yang benar
        if (!validasiRentang(N, 1, 1000)) {
            System.out.println("Nilai N harus berada antara 1 dan 1000.");
            return;
        }
        
        // Mencetak pola bintang sesuai dengan nilai N
        cetakPolaBintang(N);
    }
    
    // Method untuk meminta pengguna memasukkan angka
    public static int masukanAngka(String pesan, Scanner masukan) {
        System.out.print(pesan);
        return masukan.nextInt();
    }
    
    // Method untuk validasi rentang angka
    public static boolean validasiRentang(int angka, int min, int max) {
        return angka >= min && angka <= max;
    }
    
    // Method untuk mencetak pola bintang
    public static void cetakPolaBintang(int N) {
        System.out.println("N = " + N );
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

