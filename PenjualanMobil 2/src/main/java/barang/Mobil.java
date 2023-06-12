/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barang;

/**
 *
 * @author budi
 */
public class Mobil {
    protected String merek;
    private String model;
    private int tahun;
    private double harga;
    String warna;

    public Mobil(String merek, String model, int tahun, double harga) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
        this.harga = harga;
    }

    // Getter dan setter untuk atribut-atribut mobil

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
