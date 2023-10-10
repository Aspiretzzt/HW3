package Object_Oriented;

public class Person {
	private String name;
	private int birthdate;
	private String occupation;
	private boolean alivestatus;

	public Person(String name, int birthdate, String occupation, String alivestatus) {
		this.name = name;
		this.birthdate = birthdate;
		this.occupation = occupation;
		if (alivestatus.equals("was"))
			this.alivestatus = false;
		else
			this.alivestatus = true;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setBirthDate(int b) {
		this.birthdate = b;
	}

	public void setOccupation(String o) {
		this.occupation = o;
	}

	public void setAliveStatus(String alive) {
		if (alive.equals("was"))
			alivestatus = false;
		else
			alivestatus = true;
	}

	public String toString() {
		String s = this.occupation.toLowerCase();
		char firstChar = s.charAt(0);
		if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
			if (this.alivestatus == true)
				return String.format("%s is an %s born in %d", this.name, this.occupation, this.birthdate);
			else
				return String.format("%s was an %s born in %d", this.name, this.occupation, this.birthdate);
		} else {
			if (this.alivestatus == true)
				return String.format("%s is a %s born in %d", this.name, this.occupation, this.birthdate);
			else
				return String.format("%s was a %s born in %d", this.name, this.occupation, this.birthdate);
		}

	}
}
