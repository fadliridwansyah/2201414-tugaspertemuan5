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

public class Soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] angka = new int[3];
        
        masukkanAngka(scanner, angka); // Meminta pengguna memasukkan tiga angka
        
        // Memeriksa dan menampilkan output
        periksaDanTampilkan(angka);
    }
    
    // Method untuk meminta pengguna memasukkan tiga angka
    public static void masukkanAngka(Scanner scanner, int[] angka) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = scanner.nextInt();
        }
    }
    
    // Method untuk memeriksa apakah angka tersebut adalah ribuan dan menampilkan output
    public static void periksaDanTampilkan(int[] angka) {
        for (int i = 0; i < 3; i++) {
            if (isRibuan(angka[i])) {
                System.out.println("Angka ke-" + (i+1) + ": " + angka[i] + " adalah ribuan");
            } else {
                System.out.println("Angka ke-" + (i+1) + ": " + angka[i] + " adalah bukan ribuan");
            }
        }
    }
    
    // Method untuk memeriksa apakah angka tersebut adalah ribuan
    public static boolean isRibuan(int angka) {
        return angka >= 1000 && angka <= 9999;
    }
}

