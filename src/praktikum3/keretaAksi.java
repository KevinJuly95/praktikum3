/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author ACER
 */
public class keretaAksi {
    public static void main(String[] args) {
        kereta s = new kereta ();
       
        s.setJenis("KRCHitachi");
        s.setKursi(80);
        s.setGerbang(8);
        s.setKecepatan(120);
        s.setAwak("28");
        
        s.cetakInfo();
        
    }
}
