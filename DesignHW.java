/*
 * Class description: This DesignHW class contain three imported classed, namely, Person, Animal, and 
 * Smartphone. For Person Class, I did getter, setter, and toString output.For Animal, I did getter, 
 * setter, System output, aging method, and toString output. For Smartphone, I did getter, setter, battery 
 * life and toString output. 
 * name: Zhongtian Zhai
 * zzhai4@u.rochester.edu
 * last modified at 9 October,2023
 * Assignment name: DesignHW
*/
package Object_Oriented;

public class DesignHW {
	public static void person() {
		Person p1 = new Person("Albert Einstein", 1879);
		Person p2 = new Person("Barack Obama", 1961);
		Person p3 = new Person("Jims Jazzy", 1954);
		p1.setOccupation("physicist");
		p1.setAliveStatus("dead");
		System.out.println(p1.getName());
		System.out.println(p1.getBirthDate());
		System.out.println(p1.getOccupation());
		System.out.println(p1.getStatus());
		p1.toString();
		System.out.println(p1);

		p2.setOccupation("politician");
		p2.setAliveStatus("alive");
		System.out.println(p2.getName());
		System.out.println(p2.getBirthDate());
		System.out.println(p2.getOccupation());
		System.out.println(p2.getStatus());
		p2.toString();
		System.out.println(p2);
		p3.setName("Frida Ke");
		p3.setOccupation("artist");
		p3.setAliveStatus("dead");
		p3.toString();
		System.out.println(p3);

	}

	public static void dogs() {
		Animal d1 = new Animal();
		Animal d2 = new Animal();
		Animal d3 = new Animal();
		d1.setDog("Jack", 4, "alive");
		d2.setDog("John", 12, "dead");
		d3.setDog("Jess", 3, "alive");
		System.out.println(d1.getName() + " is " + d1.getDogAge() + ", " + d1.getDogStatus());
		System.out.println(d2.getName() + " is " + d2.getDogAge() + ", " + d2.getDogStatus());
		System.out.println(d3.getName() + " is " + d3.getDogAge() + ", " + d3.getDogStatus());
		d1.aging(10);
		d2.aging(3);
		d3.aging(5);
		System.out.println(d1.getName() + " is " + d1.getDogAge() + ", " + d1.getDogStatus());
		System.out.println(d2.getName() + " is " + d2.getDogAge() + ", " + d2.getDogStatus());
		System.out.println(d3.getName() + " is " + d3.getDogAge() + ", " + d3.getDogStatus());
		d1.toString();
		d2.toString();
		d3.toString();
		System.out.println();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

	public static void smartphone() {
		Smartphone p1 = new Smartphone(2200, "off", "off", "off", "off");
		p1.blc();
		p1.toString();
		System.out.println(p1);
		Smartphone p2 = new Smartphone(3200, "on", "off", "on", "off");
		p2.blc();
		p2.toString();
		System.out.println(p2);
		p2.deviceSet("on", "on", "on", "on");
		p2.blc();
		p2.toString();
		System.out.print("After Setting the device, ");
		System.out.println(p2);
		Smartphone p3 = new Smartphone(3200, "on", "on", "on", "off");
		p3.blc();
		p3.toString();
		System.out.println(p3);
		p3.deviceSet("on", "off", "off", "off");
		p3.blc();
		p3.toString();
		System.out.print("After Setting the device, ");
		System.out.println(p3);

	}

	public static void main(String[] args) {
		System.out.println("Person");
		person();
		System.out.println();
		System.out.println("Dogs");
		dogs();
		System.out.println();
		System.out.println("Smartphone");
		smartphone();
	}
}
