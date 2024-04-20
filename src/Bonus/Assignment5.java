/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bonus;

/**
 *
 * @author ARAY KALYANI
 */
public class Assignment5 {
    
    public Assignment5() {
    }

    public static void main(String[] args) {
        FilePlayer filePlayer = new FilePlayer();
        Threadjava1 t1 = new Threadjava1(filePlayer);
        Threadjava2 t2 = new Threadjava2(filePlayer);
        t1.start();
        t2.start();
    }
}


 