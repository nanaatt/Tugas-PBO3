/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Careen Emilza
 */
public class Utama {

    public static void main(String[] args) {
        Olahraga badminton = new Badminton();
        Olahraga tenisMeja = new TenisMeja();
        Olahraga voli = new Voli();

        badminton.jenisKelaminAtlet();
        tenisMeja.jenisKelaminAtlet();
        voli.jenisKelaminAtlet();
        System.out.println();

        System.out.println("Atlet Badminton: ");
        badminton.informasi();
        badminton.informasi(2);
        badminton.informasi("Shuttlecock");
        System.out.println();

        System.out.println("Atlet Tenis Meja: ");
        tenisMeja.informasi();
        tenisMeja.informasi(2);
        tenisMeja.informasi("Bola Tenis");
        System.out.println();

        System.out.println("Atlet Voli: ");
        voli.informasi();
        voli.informasi(12);
        voli.informasi("Bola voli");

    }

}
