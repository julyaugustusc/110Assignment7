
import java.util.Scanner;

public class Assignment7{
    //-------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
    public static void main(String[] args)
    {
		 	CharList list = null;
		 	char newChar, oldChar;
		 	Scanner scan = new Scanner (System.in);

			printMenu();
			// ask a user to choose a command
		    System.out.print("\nPlease enter a command or type? ");
		    String choice = scan.next().toLowerCase();
	        char command = choice.charAt(0);

			while (command != 'q')
	    	{

				switch(command)
	   			 {
	    			case 'a':// This option calls the constructor  and initilaizes the array with random characters
	    			         // it needs to be called first
						System.out.print("\nEnter an integer for the array size? ");
						int size = scan.nextInt();
						list = new CharList(size);
						list.randomize();
						break;
	    			case 'b'://this option prints the list of chracters
						System.out.println(list.toString());
						break;
	   				 case 'c': //adds a new character to the list
						System.out.print("\nEnter the new character to add to the list: ");
						newChar = scan.next().charAt(0);
						System.out.print("\nEnter the index where you want to add the new character: ");
						int index = scan.nextInt();
						list.addChar(newChar, index);
						break;
	   				 case 'd'://remove the character from the list
						System.out.print("\nEnter the character to delete: ");
						oldChar = scan.next().charAt(0);
						list.removeFirst(oldChar);
						break;
	    			case 'e'://prints the count of the letters in the list
                        int[] temp = list.countLetters();
                        for (int i=0; i<temp.length; i++)
                             System.out.println((char)(i + 'a')+ " " +  temp[i]);



						break;
					case '?':
						printMenu();
						break;
					case 'q':
					    break;

					default:
		                System.out.println("Invalid input");

	   			 }
	   			System.out.print("\nPlease enter a command or type? ");
				choice = scan.next().toLowerCase();
	            command = choice.charAt(0);
	    	}
    }



    		//-------------------------------------------------------
    		// Print the user's choices
    		//-------------------------------------------------------
    		public static void printMenu()
    		{

				System.out.println("\n   Menu   ");
				System.out.println("   ---------------");

				System.out.println("a: Create a new list (** do this first!! **)");
				System.out.println("b: Print the list of characters");
				System.out.println("c: Add a character to the list");
				System.out.println("d: Remove a character from the list");
				System.out.println("e: Count the number of letters in the list");
				System.out.println("q: Quit");
    		}


}
