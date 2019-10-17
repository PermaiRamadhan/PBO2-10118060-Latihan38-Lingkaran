/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg38.lingkaran;
import java.util.Scanner;

/**
 *
 * @author Permai
 */
class Lingkaran {
    private double diameter;

    public double getR() {
        return diameter/2;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    
    public void Validasi(Scanner D){
        while (!D.hasNextInt()) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println("");
            System.out.print("Masukan Nilai Diameter Lingkaran : ");
            D.next(); // this is important!
        }
    }
    public double LuasLingkaran(){
         double Luas =Math.PI*getR()*getR();
         return Luas;
    }
    public double KelilingLingkaran(){
        double keliling = 2*Math.PI*getR();
        return keliling;
    }
    
}
