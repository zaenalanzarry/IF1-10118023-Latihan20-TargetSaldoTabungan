/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan20;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Target Saldo Tabungan
 */

public class Latihan20 {

    public static void main(String[] args) {
        //kamus lokal
        double saldoawal = 3500000;
        double saldo;
        double bunga;
        int i = 1;
        
        saldo = saldoawal;
        
        do {          
            bunga = saldo * 0.08;
            saldo = saldo + bunga;
            System.out.println("Saldo di bulan ke-" + i + " Rp " + saldo);
            i++;
        }while (saldo < 6000000);
        
        System.out.println("");
        System.out.println("Developed by : Zaenal Anzarry");
        
    }
    
}
