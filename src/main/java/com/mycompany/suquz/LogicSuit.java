/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.suquz;

/**
 *
 * @author rizal
 */
public class LogicSuit {
    public static int tentukanPemenangSuit(Pemain p1, Pemain p2) {
        if (p1.getPilihan().equals(p2.getPilihan())) {
            return 0;
        }
        if ((p1.getPilihan().equals("batu") && p2.getPilihan().equals("gunting")) ||
            (p1.getPilihan().equals("gunting") && p2.getPilihan().equals("kertas")) ||
            (p1.getPilihan().equals("kertas") && p2.getPilihan().equals("batu"))) {
            return 1;
        } else {
            return -1;
        }           
    }
    
    public static void hitungDamage(Pemain menang, Pemain kalah) {
        int damage = 10;
        
        if (InteraksiElemen.seranganCritical(menang.getElemen(), kalah.getElemen())) {
            damage = 20;
        } else if (InteraksiElemen.seranganLemah(menang.getElemen(), kalah.getElemen())) {
            damage = 5;
        }
        kalah.setHp(damage);
        System.out.println(menang.getNama() + "Memberikan damage sebesar" + damage + "kepada" + kalah.getNama());
    }
}
