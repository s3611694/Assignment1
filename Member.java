package socialnet;

import java.util.ArrayList;
import java.util.Scanner;

public class Member {
	
	private ArrayList<Profile> profile;
	ArrayList<Member> person = new ArrayList<>();	
	
	private String memberid, firstName, lastName, email, image, status;
		
	public Member(String memberid, String firstName, String lastName, String email, String image, String status) {
		super();
		this.memberid = memberid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.image = image;
		this.status = status;
	}

	public Member() {
		profile = new ArrayList<>();
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void listAll() {
		/*
		 * This will list all members of the social network
		 */
			System.out.println("Number of members  "  + profile.size());
			System.out.println("Listing of All Members of   MiniNet");
			for (int i=0; i < profile.size(); i++) {
				System.out.println(profile.get(i).getuID()  + " " + profile.get(i).getfName() + " " +
						profile.get(i).getlName() + " " + profile.get(i).getEmail() + " " +
						profile.get(i).getImage() + " " + profile.get(i).getStatus());		
				}
			}
		
		public void addMember( ) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Member ID:- ");
				String id = scanner.nextLine();
				setMemberid(id);
			
				System.out.println("Enter Member First Name:- ");
				String fn = scanner.nextLine();
				setFirstName(fn);
			
				System.out.println("Enter Member Last Name:- ");
				String ln = scanner.nextLine();
				setLastName(ln);
			
				System.out.println("Enter Member email:- ");
				String em = scanner.nextLine();
				setEmail(em);
			
				System.out.println("Enter Member image:- ");
				String im = scanner.nextLine();
				setImage(im);
			
				System.out.println("Enter Member status:- ");
				String st = scanner.nextLine();
				setStatus(st);
				person.add(new Member(getMemberid(), getFirstName(), getLastName(), getEmail(), getImage(), getStatus()));
		       	System.out.println("New Profile added ...");
		    	for (int i=0; i < person.size(); i++) {
					System.out.println(person.get(i).getFirstName() + " " + person.get(i).getFirstName());
		    	}
		   	}
				
		public void getProfile() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Person Name:- ");
			String input = scanner.nextLine(); 
			
			for (int i=0; i < profile.size(); i++) {
				if (input.equals(profile.get(i).getfName()))	{
					System.out.println(profile.get(i).getfName() + " " + profile.get(i).getlName() + "'s Profile"); 
					System.out.println("Member ID  : " +  profile.get(i).getuID() 	+ " "
									 + "First Name : " +  profile.get(i).getfName() + " " 
									 + "Last Name  : " +  profile.get(i).getlName() + " "
									 + "Email      : " +  profile.get(i).getEmail() + " "
									 + "Image      : " +  profile.get(i).getImage() + " "
									 + "Status     : " +  profile.get(i).getStatus());
					}
				}
			}
			

		public void displayProfile() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter person's First Name:-  ");
			String input = scanner.nextLine();
			for (int i=0; i<profile.size(); i++) {
				if (input.equals(profile.get(i).getfName())) {
						System.out.print("Member Name:  ");
						System.out.print(profile.get(i).getfName() + "  ");
						System.out.println(profile.get(i).getlName() + "  ");
						System.out.println(" ");
						System.out.print("Email Address:  ");
						System.out.println(profile.get(i).getEmail() + "  ");
						System.out.print("Image :  ");
						System.out.println(profile.get(i).getImage() + "  ");
						System.out.print("Status :  ");
						System.out.println(profile.get(i).getStatus());
					}
				}
			}
		
		
		public void updateProfile() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter person's First Name:-  ");
			String input = scanner.nextLine();
			for (int i=0; i<profile.size(); i++) {
				if (input.equals(profile.get(i).getfName())) 
					System.out.print("Member Name:  ");
					System.out.print(profile.get(i).getfName()   +  "  ");
					System.out.println(profile.get(i).getlName() +  " Change? " + " Y/N");
					System.out.println(" ");
					System.out.print("Email Address:  ");
					System.out.println(profile.get(i).getEmail()  + " Change eMail ?   Y/N ");
					System.out.print("Image :  ");
					System.out.println(profile.get(i).getImage()  + " Change image?    Y/N");
					System.out.println("Status   ");
					System.out.println(profile.get(i).getStatus() + "  Change status?  Y/N" );
				}
			}
			
		public void deleteMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter person's First Name:-  ");
		String input = scanner.nextLine();
		for (int i=0; i<profile.size(); i++) {
			if (input.equals(profile.get(i).getfName())) 
				profile.remove(i);
				System.out.print("Item removed ...  ");
				break;
			}
		}
	}
	
