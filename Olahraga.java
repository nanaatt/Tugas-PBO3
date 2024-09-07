/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Careen Emilza
 */
public abstract class Olahraga {

    //abstract method
    public abstract void jenisKelaminAtlet();

    //overload methode tanpa parameter
    public void informasi() {
        System.out.println("Dilakukan di lapangan");
    }

    //overload method dengan parameter1
    public void informasi(int jumlah) {
        System.out.println("Jumlah pemain: " + String.valueOf(jumlah));
    }

    //overload method dengan parameter2
    public void informasi(String alat) {
        System.out.println("Menggunakan: " + alat);
    }
}
