/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quisinheritance;

/**
 *
 * @author Acer
 */
public class Tabung extends Lingkaran{
    double t=10;
    Lingkaran ling =new Lingkaran ();
    
    public void Input (){
    System.out.println("Jari-jari Lingkaran :"+jari);
    System.out.println("'V' Lingkaran :"+v);
    }
    public void LKLingkaran(){
        System.out.println("Luas Lingkaran :"+ling.Lingkaran());
        System.out.println("keliling Lingkaran :"+ling.Keliling());
    }
    public double Tabung (){
        return Lingkaran()*t;
    }
    public double LuasTabung(){
        return (2*Lingkaran())+(Keliling()*t);
    }
}
