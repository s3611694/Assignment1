package socialnet;

public class Mother {
	private String father;
	private  String dependent;
	
	public Mother(String father, String dependent) {
		super();
		this.father = father;
		this.dependent = dependent;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getDependent() {
		return dependent;
	}

	public void setDependent(String dependent) {
		this.dependent = dependent;
	}
	
	
}
