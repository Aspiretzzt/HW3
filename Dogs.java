package Object_Oriented;

public class Dogs {
	private String name;
	private int age;
	private boolean alivestatus;

	public Dogs() {
		this.name = "";
		this.age = 0;
		this.alivestatus = false;
	}

	public void setDog(String name, int age, String alive) {
		this.name = name;
		this.age = age;
		if (alive.equals("alive"))
			this.alivestatus = true;
		else if (alive.equals("dead"))
			this.alivestatus = false;
	}

	public String getName() {
		return this.name;
	}

	public int getDogAge() {
		return this.age;
	}

	public String getDogStatus() {
		if (this.alivestatus == false)
			return "dead";
		else
			return "alive";
	}
/* the meaning of this method is calculate the age of the dog after years passed, 
 * if the dog's age is over 13, then its alivestatus turn into false, which is dead,
 * otherwise, the dog's alivestatus is still true, which is alive 
*/
	public void aging(int years) {
		this.age += years;
		if (this.age > 13) {
			this.alivestatus = false;
		} else
			this.alivestatus = true;
	}
}
