/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.suquz;

/**
 *
 * @author rizal
 */
public class Main {
    public static void main(String[] args) {
        Pemain pemain1 = new Pemain("Pemain 1");
        Pemain pemain2 = new Pemain("Pemain 2");
        KontrolGame kontrolGame = new KontrolGame(pemain1, pemain2);
        kontrolGame.MulaiGame();
    }
}
