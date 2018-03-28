package socialnet;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	Profile profile = new Profile();
	Connection connection = new Connection();
	Member member = new Member();
	//ArrayList<Profile> member = new ArrayList<>();
	//ArrayList<Connection> connection = new ArrayList<>();
	//ArrayList<Family> family = new ArrayList<>();
	
	public void startMenu() {
		System.out.println("     M I N I N E T   M A I N   M E N U             ");
		System.out.println("===================================================");
		System.out.println("                                                   ");
		System.out.println("1. List Everyone                                   ");
		System.out.println("2. Add a Person to the Network                     ");
		System.out.println("3. Select a Person By Name                         ");
		System.out.println("0. Exit                                            ");
		System.out.println("                                                   ");
		System.out.println("Select an item from the list above:-               ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int selection = input.nextInt();
		while (selection  < 0 || selection > 3) {
			System.out.println("Invalid selection. Should be in range 0 to 3   ");
			System.out.println("Try Again                                      ");
			selection = input.nextInt();
		}
		
		if (selection == 1) {
			System.out.println("Listing All Profiles                          ");
			member.listAll();
		} else if (selection == 2) {
			 System.out.println(" Adding new Member to Network                   ");
			 member.addMember();
		}else if (selection == 3) {
			this.startSubMenu();
		}else if (selection == 0) {
			 System.out.println("Program Terminating                            ");
			 System.exit(0);
			}
		}
	
	   void startSubMenu() {
		   System.out.println("    M I N I N E T  S U B M E N U             ");
			System.out.println("===================================================");
			System.out.println("                                                   ");
			System.out.println("1. Display Profile of Selected Member              ");
			System.out.println("2. Update Profile of Selected                      ");
			System.out.println("3. Delete Profile of Selected                      ");
			System.out.println("4. Connect two members in a relationship           ");
			System.out.println("5. Is this Member a direct friend of another       ");
			System.out.println("6. Member's children OR member's parents           ");
			System.out.println("0. Exit                                            ");
			System.out.println("                                                   ");
			System.out.println("Select an item from the list above:-               ");
			Scanner input = new Scanner(System.in);
			int selection = input.nextInt();
			while (selection < 0 && selection > 6) {
				System.out.println("Invalid selection. Should be in range 0 to 6 ");
				System.out.println("Try Again                                    ");
				selection = input.nextInt();
			}
			if (selection == 1) {
				System.out.println("Displaying profile of selected member ");
				member.displayProfile();
			}else
				if (selection == 2) {
					System.out.println("Updating Profile of selected member");
					member.updateProfile();
			}else
	   			if (selection == 3) {
				System.out.println("Deleting Profile of Selected Member");
				member.deleteMember();
			}else
				if (selection == 4) {
					System.out.println("Connection two members in a relationship");
					 connection.buildConnection();
			}else
				if (selection == 5) {
					System.out.println("Find relationship between two members");
					connection.displayConnection();
			}else
				if (selection == 6) {
					System.out.println("Find member's children or parents ");
				//	((Family) family).displayFamilyConnection();
				}
	   }
}
