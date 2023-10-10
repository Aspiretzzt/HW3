/*
 * Class description: This Person class, I did Person value constructor, setter, getter, and 
 * toString output.
 * name: Zhongtian Zhai
 * zzhai4@u.rochester.edu
 * last modified at 9 October,2023
 * Assignment name: DesignHW
*/
package Object_Oriented;

public class Person {
	private String name;
	private int birthdate;
	private String occupation;
	private boolean alivestatus;

	public Person(String name, int birthdate) {
		this.name = name;
		this.birthdate = birthdate;
		this.occupation = "";
		this.alivestatus = false;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setOccupation(String o) {
		this.occupation = o;
	}

	public void setAliveStatus(String alive) {
		if (alive.equals("dead"))
			alivestatus = false;
		else
			alivestatus = true;
	}

	public String getName() {
		return this.name;
	}

	public int getBirthDate() {
		return this.birthdate;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public String getStatus() {
		if (this.alivestatus == false)
			return "dead";
		else
			return "alive";
	}

	public String toString() {
		String s = this.occupation.toLowerCase();
		char firstChar = s.charAt(0);
		if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
			if (this.alivestatus == true)
				return String.format("%s is an %s born in %d.", this.name, this.occupation, this.birthdate);
			else
				return String.format("%s was an %s born in %d.", this.name, this.occupation, this.birthdate);
		} else {
			if (this.alivestatus == true)
				return String.format("%s is a %s born in %d.", this.name, this.occupation, this.birthdate);
			else
				return String.format("%s was a %s born in %d.", this.name, this.occupation, this.birthdate);
		}

	}
}
