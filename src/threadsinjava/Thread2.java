/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsinjava;

/**
 *
 * @author ARAY KALYANI
 */


public class Thread2 extends Thread{
   
        
    

    public void run() {

        FilePlayer file = new FilePlayer();

        try {


            Thread2.sleep(1000);

            file.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\re.wav");
            System.out.println("re");
            Thread2.sleep(2000);

            file.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\fa.wav");
            System.out.println("fa");

            Thread.sleep(1000);

            file.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\la.wav");
            System.out.println("la");

            Thread2.sleep(2000);


            file.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\do-octave.wav");
            System.out.println("do-octave2");

            Thread2.sleep(1000);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

