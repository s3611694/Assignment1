package socialnet;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.prism.Image;

public class Driver {
	
	public static void main(String[] args) { 
		
		ArrayList<Profile> member = new ArrayList<>();
		System.out.println("Loading  member profiles   ");
		member.add(new Profile("001", "Homer", "Simpson", "homer@hotmail.com", " ", "0" ));
		member.add(new Profile("002", "Tim", "Johnson", "tim@hotmail.com", " ", "0" ));
		member.add(new Profile("003", "Pardon", "Gumbo", "pardon@hotmail.com", " ", "1" ));
		member.add(new Profile("004", "Juda", "BenHur", "juda@hotmail.com", " ", "1" ));
		member.add(new Profile("005", "James", "Miller", "james@hotmail.com", " ", "0" ));
		ArrayList<Connection> connection = new ArrayList<>();
		connection.add(new Connection("James", "Rob", " are friends"));
		connection.add(new Connection("Philip", "Elizabeth", "are friends"));
		connection.add(new Connection("John", "Linda", " are friend"));
		connection.add(new Connection("Tim", "Andy", "are married"));
		connection.add(new Connection("Pardon", "Eddie", " are brothers"));
		connection.add(new Connection("Ben", "Maggie", "are collegues"));
		connection.add(new Connection("Ben", "Maggie", "are engaged"));
		connection.add(new Connection("James", "Rob", "colleagues"));
		connection.add(new Connection("Homer", "Lisa", "are father and daughter"));
		connection.add(new Connection("Homer", "Margie", "are a couple"));
		connection.add(new Connection("Philip", "Elizabeth", "are husband and wife"));
		connection.add(new Connection("John", "Linda", "are brother and sister"));
		connection.add(new Connection("Charles", "Mary", "parents of "));
		Menu menu = new Menu();
		menu.startMenu();
	}
}
