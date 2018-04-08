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
        s.jenis="KRCHitachi";
        s.kursi=80;
        s.gerbang=8;
        s.kecepatan=120;
        s.awak="28";
        
        s.cetakInfo();
        
    }
}
