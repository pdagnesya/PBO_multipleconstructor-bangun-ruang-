
package bangunRuang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("PUTR DWI AGNESYA (21081010142)");
        
        System.out.println("~~Kubus~~");
        System.out.print("Input sisi :");
        int Sisi = input.nextInt();
        Kubus hitungkubus2 = new Kubus();
        hitungkubus2.ComputeAndSetVolume();
        Kubus hitungkubus = new Kubus(Sisi);
        hitungkubus.ComputeAndSetVolume();
        System.out.println("Volume Kubus adalah "+hitungkubus.getVolume());
        System.out.println("Volume Kubus adalah "+hitungkubus2.getVolume());

        System.out.println("--------------------------------------------------");
        
        System.out.println("~~Balok~~");
        System.out.print("Input panjang :");
        int panjang = input.nextInt();
        System.out.print("Input lebar :");
        int lebar = input.nextInt();
        System.out.print("Input tinggi :");
        int tinggi = input.nextInt();
        balok hitungBalok1 = new balok ();
        hitungBalok1.ComputeAndSetVolume();
        balok hitungBalok2 = new balok (panjang);
        hitungBalok2.ComputeAndSetVolume();
        balok hitungBalok3 = new balok (panjang, lebar);
        hitungBalok3.ComputeAndSetVolume();
        balok hitungBalok = new balok (panjang, lebar, tinggi);
        hitungBalok.ComputeAndSetVolume();
        System.out.println("Volume Balok adalah "+hitungBalok1.getVolume());
        System.out.println("Volume Balok adalah "+hitungBalok2.getVolume());
        System.out.println("Volume Balok adalah "+hitungBalok3.getVolume());
        System.out.println("Volume Balok adalah "+hitungBalok.getVolume());

        System.out.println("--------------------------------------------------");
        
        System.out.println("~~Tabung~~");
        System.out.print("Input radius :");
        int radius2 = input.nextInt();
        System.out.print("Input tinggi :");
        int tinggi1 = input.nextInt(); 
        Tabung hitungtabung1 = new Tabung ();
        hitungtabung1.ComputeAndSetVolume();
        Tabung hitungtabung2 = new Tabung (radius2);
        hitungtabung2.ComputeAndSetVolume();
        Tabung hitungtabung3 = new Tabung (radius2, tinggi1);
        hitungtabung3.ComputeAndSetVolume();
        System.out.println("Volume Tabung adalah "+hitungtabung1.getVolume());
        System.out.println("Volume Tabung adalah "+hitungtabung2.getVolume());
        System.out.println("Volume Tabung adalah "+hitungtabung3.getVolume()); 
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("~~Limas Segi Empat~~");
        System.out.print("Input sisi :");
        int sisi = input.nextInt();
        System.out.print("Input tinggi :");
        int tinggi2 = input.nextInt(); 
        LimasSegiEmpat hitunglimas1 = new LimasSegiEmpat ();
        hitunglimas1.ComputeAndSetVolume();
        LimasSegiEmpat hitunglimas2 = new LimasSegiEmpat (tinggi2);
        hitunglimas2.ComputeAndSetVolume();
        LimasSegiEmpat hitunglimas3 = new LimasSegiEmpat (sisi, tinggi2);
        hitunglimas3.ComputeAndSetVolume();
        System.out.println("Volume Limas Segi Empat adalah "+hitunglimas1.getVolume());
        System.out.println("Volume Limas Segi Empat adalah "+hitunglimas2.getVolume());
        System.out.println("Volume Limas Segi Empat adalah "+hitunglimas3.getVolume());
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("~~Bola~~");
        System.out.print("Input radius :");
        int radius = input.nextInt();
        Bola hitungBola1 = new Bola();
        hitungBola1.ComputeAndSetVolume();
        Bola hitungBola2 = new Bola(radius);
        hitungBola2.ComputeAndSetVolume();
        System.out.println("Volume Kubus adalah "+hitungBola1.getVolume());
        System.out.println("Volume Kubus adalah "+hitungBola2.getVolume());
    }
}

