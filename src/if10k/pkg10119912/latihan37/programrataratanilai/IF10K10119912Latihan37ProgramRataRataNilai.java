/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author hp
 */

class Nilai{
   public int i, banyak_mahasiswa;
   public float jum, nilai_mahasiswa, rata;
   
   public void hitungRataRata(){
       Scanner masuk = new Scanner(System.in);
        jum=0;
        i=1;
        while (i<=banyak_mahasiswa){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                nilai_mahasiswa = masuk.nextFloat ();
                jum += nilai_mahasiswa;
                i++;
        }
        rata = jum / banyak_mahasiswa;
        System.out.println ();
        System.out.println ("Maka, Rata-rata Nilainya adalah "+rata);        
        System.out.println ("Delevoped by : Rezki Ramadhan");
   }
}

public class IF10K10119912Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print ("Masukan Banyaknya Mahasiswa: ");
        Nilai val = new Nilai();
         
        Scanner masuk = new Scanner(System.in);
 
        val.banyak_mahasiswa = masuk.nextInt();
        val.hitungRataRata();
    }
    
}
