import java.io.File; 
import java.io.IOException; 
import java.util.Scanner; 
  
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException; 

public class soundPlayer{
	// this is to store the current position in playback
	Long currentFrame;
	Clip clip;

	String status;

	AudioInputStream stream;
	static String filePath;

	public soundPlayer(String filePath) throws LineUnavailableException, UnsupportedAudioFileException, IOException{
		//converts file into a stream
		stream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
		clip = AudioSystem.getClip();
		clip.open(stream);
		clip.setLoopPoints(0,-1);//set so that it starts at beginning, ends at the end
		clip.loop(1);
	}

	public void play(){
		clip.start();
	}

	public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException{
		soundPlayer player = new soundPlayer("testSounds/test.wav");
		player.play();
		for(int i = 0; i<10; i++){
			Thread.sleep(1000);
		}
	}
}

