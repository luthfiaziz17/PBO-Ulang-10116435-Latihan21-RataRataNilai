/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang10116435latihan21rataratanilai;
import java.util.Scanner;

/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al Paqih
 */
public class PBOUlang10116435Latihan21Rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int jumMhs;
       int i=1;
       double rataNilai;
       double jumNilai = 0;
       double nilaiMhs;
       
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan Banyaknya Mahasiswa = ");
        jumMhs = (int) sc.nextDouble();
        
        while (i <= jumMhs) {
            System.out.print("Nilai Mahasiswa Ke-" + i + " : ");
            
            nilaiMhs = sc.nextDouble();
            jumNilai = jumNilai + nilaiMhs;
            i++;
        }
        System.out.println(" ");
        
        //menghitung rata-rata nilai
        rataNilai = jumNilai / jumMhs;
        System.out.println("Maka, Rata-rata nilainya adalah " + rataNilai);
    
    }
    
}
