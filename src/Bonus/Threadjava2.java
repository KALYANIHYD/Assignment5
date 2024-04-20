/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bonus;

/**
 *
 * @author ARAY KALYANI
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



class Threadjava2 extends Thread {
    private final FilePlayer filePlayer;
    private final String[] notesThread2 = new String[]{"la", "la"};

    public Threadjava2(FilePlayer filePlayer) {
        this.filePlayer = filePlayer;
    }

    public void run() {
        try {
            sleep(5000L);
            this.filePlayer.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\la.wav");
            System.out.println("la");
            System.out.println("Run Thread two");
            sleep(1000L);
            this.filePlayer.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\la.wav");
            System.out.println("la");
            System.out.println("Run Thread two");
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }

    }
}

