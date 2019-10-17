/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg38.lingkaran;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Permai Ramadhan
 * NIM  :10118060
 */
public class PBO210118060LatihanKe38Lingkaran {

    /**
     * @param args the command line arguments
     */
    private static DecimalFormat df = new DecimalFormat("#.##");
    public static void main(String[] args) {
        // TODO code application logic here
         Lingkaran lk = new Lingkaran();
        System.out.println("========== Perhitungan Lingkaran ==========");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        Scanner D = new Scanner(System.in);
        lk.Validasi(D);
        lk.setDiameter(D.nextDouble());
        
        System.out.println("====== Hasil Perhitungan Lingkaran ======");
        System.out.println("Jari-jari Lingkaran \t ="+df.format(lk.getR())+" cm");
        System.out.println("Luar Lingkaran \t\t ="+df.format(lk.LuasLingkaran())+" cm");
        System.out.println("Keliling Lingkaran \t ="+df.format(lk.KelilingLingkaran())+" cm");
        System.out.println("Developed By : Permai Ramadhan");
    }
    
}
