/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsinjava;

/**
 *
 * @author ARAY KALYANI
 */


public class Thread1 extends Thread{

    public void run(){

        FilePlayer file = new FilePlayer();

        try {

            file.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\do.wav");
            System.out.println("do");
            Thread1.sleep(1000);

            file.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\mi.wav");
            System.out.println("mi");
            Thread1.sleep(2000);

            file.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\sol.wav");
            System.out.println("sol");
            Thread1.sleep(1000);

            file.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\si.wav");
            System.out.println("si");
            Thread1.sleep(2000);

            file.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\do-octave.wav");
            System.out.println("do-octave");
            Thread1.sleep(1000);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
