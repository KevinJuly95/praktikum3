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
public class keretaapilokomotif extends kereta{
    private String jenisKelas;
    
    void throttle() {
        System.out.println("KERETA KHUSUS WIBU. . .");
        
    }

    public String getJenisKelas() {
        return jenisKelas;
    }

    public void setJenisKelas(String jenisKelas) {
        this.jenisKelas = jenisKelas;
    }
    
    
}
