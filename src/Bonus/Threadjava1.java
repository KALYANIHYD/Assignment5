//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Bonus;

import threadsinjava.FilePlayer;

class Threadjava1 extends Thread {
    private final FilePlayer filePlayer;
    private final String[] notesThreadjava1 = new String[]{"do", "do", "sol", "sol"};

    public Threadjava1(FilePlayer filePlayer) {
        this.filePlayer = filePlayer;
    }

    Threadjava1(Bonus.FilePlayer filePlayer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void run() {
        try {
            this.filePlayer.play("\"C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\do.wav\"");
            System.out.println("do");
            System.out.println(" Run Thread One");
            sleep(1000L);
            this.filePlayer.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\do.wav");
            System.out.println("do");
            System.out.println("Run Thread One");
            sleep(1000L);
            this.filePlayer.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\sol.wav");
            System.out.println("sol");
            System.out.println("Run Thread One");
            sleep(1000L);
            this.filePlayer.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\sol.wav");
            System.out.println("sol");
            sleep(1000L);
            this.filePlayer.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\sol.wav");
            System.out.println("sol");
            sleep(1000L);
            this.filePlayer.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\mi.wav");
            System.out.println("mi");
            sleep(1000L);
            this.filePlayer.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\mi.wav");
            System.out.println("mi");
            sleep(1000L);
            this.filePlayer.play("C:\\Users\\ARAY KALYANI\\OneDrive\\Desktop\\Documents\\NetBeansProjects\\ThreadsInJava\\Sounds\\do.wav");
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }

    }
}
