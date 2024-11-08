/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.suquz;

/**
 *
 * @author rizal
 */
public enum Pencocokan {
    BATU, GUNTING, KERTAS;
    
    public boolean pilihan(Pencocokan pilihan) {
        switch(this) {
            case BATU: 
                return pilihan == GUNTING;
            case GUNTING: 
                return pilihan == KERTAS;
            case KERTAS: 
                return pilihan == BATU;
            default: 
                return false;
        }
    }
}
