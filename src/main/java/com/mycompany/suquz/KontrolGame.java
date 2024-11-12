/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.suquz;

import java.util.Scanner;

/**
 *
 * @author rizal
 */
public class KontrolGame {
    private Pemain pemain1;
    private Pemain pemain2;
    
    public KontrolGame(Pemain pemain1, Pemain pemain2) {
        this.pemain1 = pemain1;
        this.pemain2 = pemain2;
    }
    
    public void MulaiGame() {
        Scanner scanner = new Scanner(System.in);
        while (pemain1.getHp() > 0 && pemain2.getHp() > 0) {
            mulaiRonde(scanner);
            System.out.println(pemain1.getNama() + "HP: " + pemain1.getHp());
            System.out.println(pemain2.getNama() + "HP: " + pemain2.getHp());
        }
        
        if(pemain1.getHp() <= 0) {
            System.out.println(pemain2.getNama() + " menang!!");
        } else {
            System.out.println(pemain1.getNama() + " menang!!");
        }
        scanner.close();
    }
    
    public void mulaiRonde(Scanner scanner) {
        System.out.println("\n -----Ronde Baru-----");
        
        System.out.println(pemain1.getNama() + "Pilih batu, gunting atau kertas: ");
        pemain1.setPilihan(scanner.nextLine().toLowerCase());
        System.out.println(pemain1.getNama() + "Pilih elemen (api, air, angin, batu): ");
        pemain1.setElemen(scanner.nextLine().toLowerCase());
        
        System.out.println(pemain2.getNama() + "Pilih batu, gunting atau kertas: ");
        pemain2.setPilihan(scanner.nextLine().toLowerCase());
        System.out.println(pemain2.getNama() + "Pilih elemen (api, air, angin, batu): ");
        pemain2.setElemen(scanner.nextLine().toLowerCase());
        
        int hasil = LogicSuit.tentukanPemenangSuit(pemain1, pemain2);
        
        if(hasil == 1) {
            LogicSuit.hitungDamage(pemain1, pemain2);
        } else if(hasil == -1) {
            LogicSuit.hitungDamage(pemain2, pemain1);
        } else {
            System.out.println("Hasilnya seri!!");
        }
    }
}
