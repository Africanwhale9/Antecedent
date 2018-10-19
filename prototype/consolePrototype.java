package prototype;
import java.util.Scanner;
import java.io.File; 
import java.io.IOException; 
import java.util.Scanner; 
  
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException;
import prototype.*;
public class consolePrototype{



	public static void startConsole()throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException{//this acts as the main
		System.out.println("Please enter your command");
		Scanner input = new Scanner(System.in);
		String line = "";

		while(true){
			System.out.print(">");
			line = input.nextLine();
			System.out.println();

			switch (line.toLowerCase()){
				case "exit":
					exit();
					break;

				case "mail":
					mail();
					break;

				case "sound":
					sound();
					break;

				case "help":
					help();
					break;

				default:
					System.out.println(line + " is not a valid command. Try \"help\" for a list of commands.");

			}



			System.out.println();
		}

	}

	public static void sound()throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException{
		soundPlayer player = new soundPlayer("prototype/assets/soundtrack/test.wav");
		System.out.println("Doot");
		for(int i = 0; i<3; i++){
			Thread.sleep(1000);
		}
	}

	public static void mail(){
		System.out.println("> You have no mail");
	}

	public static void help(){
		System.out.println("Some typical commands are:");
		System.out.println("		-help");
		System.out.println("		-mail");
		System.out.println("		-sound");
		System.out.println("		-exit");

	}

	public static void exit()throws InterruptedException{//exits the program and says thanks for playing
		System.out.println("Thank you for playing Antecedent");
		Thread.sleep(500);
		System.out.println("Goodbye");
		Thread.sleep(500);
		System.exit(0);
	}

	public static void main(String[] args)throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException{
		startConsole();
	}
}