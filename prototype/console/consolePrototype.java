

import java.util.Scanner;
public class consolePrototype{



	public static void startConsole(){//this acts as the main
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

				case "help":
					help();
					break;

				default:
					System.out.println(line + " is not a valid command. Try \"help\" for a list of commands.");

			}



			System.out.println();
		}

	}

	public static void mail(){
		System.out.println("> You have no mail");
	}

	public static void help(){
		System.out.println("Some typical commands are:");
		System.out.println("		-help");
		System.out.println("		-mail");
		System.out.println("		-exit");

	}

	public static void exit(){//exits the program and says thanks for playing
		System.out.println("Thank you for playing Antecedent");
		// Thread.sleep(500);
		System.out.println("Goodbye");
		// Thread.sleep(500);
		System.exit(0);
	}

	public static void main(String[] args){
		startConsole();
	}
}