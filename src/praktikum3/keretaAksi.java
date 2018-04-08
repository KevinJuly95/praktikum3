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
        
        System.out.print("Jenisnya \t:");
        System.out.println(s.getJenis());
        System.out.print("Kursinya \t:");
        System.out.println(s.getKursi());
        System.out.print("Gerbangnya \t:");
        System.out.println(s.getGerbang());
        System.out.print("Kecepatanya \t:");
        System.out.println(s.getKecepatan()+" km/j");
        System.out.print("Awaknya \t:");
        System.out.println(s.getAwak());
        
        keretaapilokomotif sm = new keretaapilokomotif ();
        sm.setJenis("Big Boy");
        sm.setKursi(75);
        sm.setGerbang(8);
        sm.setKecepatan(100);
        sm.setAwak("20");
        sm.setJenisKelas("Ekonomi");
        sm.cetakInfo();
        System.out.println("Jenis :"+sm.getJenisKelas());
        sm.throttle();
}
}