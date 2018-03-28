package socialnet;

import java.util.ArrayList;
import java.util.Scanner;

public class Profile {

	ArrayList<Profile> profile = new ArrayList<>();
	//Menu menu = new Menu();
	//Profile attributes
	private String uID, fName, lName, email, image, status;
	private String selection;
	
	//Constructors
	public   Profile(String uID, String fName, String lName, String email, String image, String status) {
		super();
		this.uID    = uID;
		this.fName  = fName;
		this.lName  = lName;
		this.email  = email;
		this.image  = image;
		this.status = status;
	
	}
	
	public Profile() {}

	//Getters and Setters
	public String getuID() {return uID;	}

	public void setuID(String uID) { this.uID = uID; }

	public String getfName() { return fName;}

	public void setfName(String fName) {this.fName = fName;	}

	public String getlName() { return lName; }

	public void setlName(String lName) { this.lName = lName; }

	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }

	public String getImage() {return image;	}

	public void setImage(String im) {this.image = image;}

	public String getStatus() {	return status;	}

	public void setStatus(String status) {this.status = status;	}
	
	public String getSelection() {return selection;	}

	public void setSelection(String selection) {this.selection = selection;	}
}
