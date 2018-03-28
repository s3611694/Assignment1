package socialnet;

import java.util.ArrayList;
import java.util.Scanner;
/*	Assignment : 1
 *  Application: MiniNet
 *  Class	   :Connection
 *  Author	   :Pardon Gumbo (s3611694)
 *  Date       :24/03/2018
 *  Description:
 */
 class Connection implements Relation{
	
	private String firstPerson;
	private String secondPerson;
	private String connexion;
	
	public Connection(String firstPerson, String secondPerson, String connexion) {
		super();
		this.firstPerson = firstPerson;
		this.secondPerson = secondPerson;
		this.connexion = connexion;
	}
	
	public Connection() {}

	public String getFirstPerson() {
		return firstPerson;
	}

	public void setFirstPerson(String firstPerson) {
		this.firstPerson = firstPerson;
	}

	public String getSecondPerson() {
		return secondPerson;
	}

	public void setSecondPerson(String secondPerson) {
		this.secondPerson = secondPerson;
	}

	public String getConnection() {
		return connexion;
	}

	public void setConnection(String connexion) {
		this.connexion = connexion;
	}

	public void authenticateRelationship() {
		
	}
	public void buildConnection() {
	}
	
	public void deleteConnection() {}
	
    public void updateConnection() {} 

	public void displayConnection() {}
}
