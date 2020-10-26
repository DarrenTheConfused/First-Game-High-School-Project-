import java.util.Scanner;
import java.lang.Math;

class Game {
  public static void main(String[] args)
  {
    //word art
    System.out.println(" __          ________ _      _____ ____  __  __ ______ ");
    System.out.println(" \\ \\        / |  ____| |    / ____/ __ \\|  \\/  |  ____|");
    System.out.println("  \\ \\  /\\  / /| |__  | |   | |   | |  | | \\  / | |__   ");
    System.out.println("   \\ \\/  \\/ / |  __| | |   | |   | |  | | |\\/| |  __|  ");
    System.out.println("    \\  /\\  /  | |____| |___| |___| |__| | |  | | |____ ");
    System.out.println("     \\/  \\/   |______|______\\_____\\____/|_|  |_|______|");
    
    System.out.println("  _______ ____  ");
    System.out.println(" |__   __/ __ \\ ");
    System.out.println("    | | | |  | |");
    System.out.println("    | | | |  | |");
    System.out.println("    | | | |__| |");
    System.out.println("    |_|  \\____/ ");
    
    System.out.println("  _____   _______     _______ _    _ _____ _____ ");
    System.out.println(" |  __ \\ / ____\\ \\   / / ____| |  | |_   _/ ____|");
    System.out.println(" | |__) | (___  \\ \\_/ | |    | |__| | | || |     ");
    System.out.println(" |  ___/ \\___ \\  \\   /| |    |  __  | | || |     ");
    System.out.println(" | |     ____) |  | | | |____| |  | |_| || |____ ");
    System.out.println(" |_|    |_____/   |_|  \\_____|_|  |_|_____\\_____|");
    
    System.out.println("  _____ _____ _____ ______ ");
    System.out.println(" |  __ |_   _/ ____|  ____| ");
    System.out.println(" | |  | || || |    | |__    ");
    System.out.println(" | |  | || || |    |  __|   ");
    System.out.println(" | |__| _| || |____| |____  ");
    System.out.println(" |_____|_____\\_____|______| ");
    
    
    Scanner scan = new Scanner(System.in);
    int dice = 0;
    String stop = "yeet";
    int stop2 = 1;
    String question = " ";
    while (stop2 != 0) {
      
      System.out.println("Ask the PSYCHIC DICE a yes or no question:");
      question = scan.nextLine();
      dice = (int)((Math.random()* 6) + 1);
      if (question.contains("?")) {
        
        if (dice == 1) {
          System.out.println("The Psychic Dice says:");
          System.out.println(" _________________");
          System.out.println("|                 |");
          System.out.println("|                 |");
          System.out.println("|   Absolutely!   |");
          System.out.println("|                 |");
          System.out.println("|_________________|");
        }
        
        if (dice == 2) {
          System.out.println("The Psychic Dice says:");
          System.out.println(" _________________");
          System.out.println("|                 |");
          System.out.println("|                 |");
          System.out.println("|     Maybe...    |");
          System.out.println("|                 |");
          System.out.println("|_________________|");
        }
        
        if (dice == 3) {
          System.out.println("The Psychic Dice says:");
          System.out.println(" _________________");
          System.out.println("|                 |");
          System.out.println("|                 |");
          System.out.println("|       No.       |");
          System.out.println("|                 |");
          System.out.println("|_________________|");
        }
        
        if (dice == 4) {
          System.out.println("The Psychic Dice says:");
          System.out.println("___________________");
          System.out.println("|                 |");
          System.out.println("|                 |");
          System.out.println("|      NEVER.     |");
          System.out.println("|                 |");
          System.out.println("|_________________|");          
        }
        
        if (dice == 5) {
          System.out.println("The Psychic Dice says:");
          System.out.println("  ____________________");
          System.out.println(" //                  \\ ");
          System.out.println("//                    \\");
          System.out.println("|     Yes. Indeed.      |");
          System.out.println("\\                    //");
          System.out.println(" \\__________________//");          
        }
        
        if (dice == 6) {
          System.out.println("The Psychic Dice says: Ask again later.");
          
        }
        System.out.println("Would you like to ask another question? \n --Enter 0 if you would not like to enter another question \n --Enter 1 if you would");
      }
      
      else if (question.indexOf("?") == -1) {
        System.out.println("That's not a question... \n Hint: Question needs question mark, you big dummy \n Try again.");
      }
      
      stop = scan.nextLine();
      if (stop.indexOf("?") > 0) {
        System.out.println("GOODBYE ;) ");
        System.out.println("Restarting...");
      }
      
      else if (stop.indexOf("0") == 0) {
        stop2 = 0;
        System.out.println("GOODBYE ;) ");
      }
      
    }
    
    
  }
}