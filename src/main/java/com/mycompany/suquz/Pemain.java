/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.suquz;

/**
 *
 * @author rizal
 */
public class Pemain {
    private String nama;
    private int hp;
    private Pencocokan pilihanSuit;

    public Pemain(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getHp() {
        return hp;
    }
    
    public Pencocokan getPilihanSuit() {
        return pilihanSuit;
    }

    public void setHp(int hp) {
        this.hp = hp;
    } 
    
    public void setPilihanSuit(Pencocokan pilihanSuit) {
        this.pilihanSuit = pilihanSuit;
    }
}
