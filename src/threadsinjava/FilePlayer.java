/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsinjava;

/**
 *
 * @author ARAY KALYANI
 */


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class FilePlayer {


	public void play(String filePath) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);

			clip.start();

		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}

	}
}