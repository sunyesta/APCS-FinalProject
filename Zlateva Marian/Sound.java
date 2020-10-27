
/**
 * I just added this recencly bc the audio imports were patched after java 9
 */
 
 
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;




public class Sound {


	public static void playSound(String filepath) {
		playSound(filepath,false);
	}
 

    public static void playSound(String filepath,boolean loop) {
        try{
			File musicPath =  new File(filepath);

			if(musicPath.exists()){
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				if(loop){
					clip.loop(Clip.LOOP_CONTINUOUSLY);
				}

			}else{
				System.out.println("Can't find file");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
    }
}