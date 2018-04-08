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
public class kereta {
    private String jenis;
    private int kursi;
    private int gerbang;
    private int kecepatan;
    private String awak;
     
    void cetakInfo () {
        System.out.println("jenis \t: "+jenis+"\n"+
                "kursi \t: "+kursi+"\n"+
                "gerbang \t: "+gerbang+"\n"+
                "kecepatan \t: "+kecepatan+" km/j"+"\n"+
                "awak \t: "+awak+"\n");
    }
}
