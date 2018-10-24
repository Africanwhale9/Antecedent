package prototype;
import java.util.Scanner;

public class playPrototype{
	public static String name;
	public static int waitTime = 3000;

	public playPrototype(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name:");
		System.out.print("> ");
		name =  input.nextLine();
		System.out.println();
		System.out.println("Hello "+name+". We've been expecting you.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void startConsole()throws InterruptedException{
		intro();
		Scanner input = new Scanner(System.in);
		String line = "";

		// while(true){
		// 	System.out.print(">");
		// 	line = input.nextLine();
		// 	System.out.println();

		// 	switch (line.toLowerCase()){
		// 		case "exit":
		// 			exit();
		// 			break;

		// 		case "mail":
		// 			mail();
		// 			break;

		// 		case "sound":
		// 			sound();
		// 			break;

		// 		case "help":
		// 			help();
		// 			break;

		// 		default:
		// 			System.out.println(line + " is not a valid command. Try \"help\" for a list of commands.");

		// 	}



		// 	System.out.println();
		// }

	}
	


	private static void intro()throws InterruptedException{
		System.out.println(name + ". . .");
		Thread.sleep(waitTime);

		System.out.println();
		System.out.println(name + ". . .");
		Thread.sleep(waitTime);

		System.out.println();
		System.out.println(name + ". . .");
		Thread.sleep(waitTime);

		System.out.println();
		Thread.sleep(waitTime/3);
		System.out.println();
		Thread.sleep(waitTime/3);
		System.out.println();
		Thread.sleep(waitTime/3);
		System.out.println();
		Thread.sleep(waitTime/3);
		System.out.println();

		System.out.println("You wake up on a beach. The cool waves lapping at your feet.\n"+
							"\"Where am I?\" you think. \"What happened?\"");

		System.out.println("...");
		System.out.println();
		Thread.sleep(waitTime);

		System.out.println("...");
		System.out.println();
		Thread.sleep(waitTime);

		System.out.println("...");
		System.out.println();
		Thread.sleep(waitTime);

		System.out.println("...\"What am I?\"");

	}

	public static void main(String[] args) throws InterruptedException {
		playPrototype test = new playPrototype();
		playPrototype.startConsole();
	}
	
}