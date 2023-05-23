/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts;

/**
 *
 * @author C-16
 */
//nama,nim,alamat,umur,tinggi
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

class data{
 String nama;
 String nim;
 String alamat;
 String umur;
 String tinggi;

}



public class Ujian {
    public static void main(String args[])throws Exception{
  
        
    PrintWriter cetakan = new PrintWriter("fileoutput.txt");
    
    int [] angka = {1,2,3,4,5,6,7,8,9,10};
    String [] nama =  {"Dimas, ","Restu, ","Kevin, ","Kholid, ","Fiki, "};
    
    data satu;
    satu = new data();
    satu.nama = "Dimas Arya Pradipta Sutandyo ";
    satu.nim = "22201194 ";
    satu.alamat = "Perumahan BMR, singosari ";
    satu.umur = "19 ";
    satu.tinggi = "166cm ";
    
    for (int angka1 : angka){
    cetakan.print(angka1);}
    
    cetakan.println("");
    
    for (String nama1 : nama){
    cetakan.print(nama1);}
    
   cetakan.println("");
    
    cetakan.print("Nama: "+satu.nama);
    cetakan.print("Nim: "+ satu.nim);
    cetakan.print("Alamat: "+satu.alamat);
    cetakan.print("Umur: "+satu.umur +"tahun");
    cetakan.print("Tinggi: "+satu.tinggi);
    
    cetakan.close();
    
    File folder = new File ("fileoutput.txt");
    Scanner baca = new Scanner(folder);
    
    while(baca.hasNextLine()){
    String keluar = baca.nextLine();
    System.out.println(keluar);
    
    }
    
    }
    
    
    
    
    
    
    
    }

