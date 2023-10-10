/*
 * name: Zhongtian Zhai
 * zzhai4@u.rochester.edu
 * last modified at 27 Sep,2023
 * Assignment name: MathLoops
*/
package Object_Oriented;

public class DesignHW {
	public static void person() {
		Person p1 = new Person("Albert Einstein", 1879, "physicist", "was");
		Person p2 = new Person("Barack Obama", 1961, "politician", "is");
		Person p3 = new Person("Frida Kahlo", 1954, "artist", "was");
		p1.toString();
		p2.toString();
		p3.toString();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p1.setName("Zhongtian Zhai");
		p1.setBirthDate(2004);
		p1.setOccupation("Student");
		p1.setAliveStatus("is");
		p1.toString();
		System.out.println(p1);
		p2.setName("Kobe Bean Bryant");
		p2.setBirthDate(1978);
		p2.setOccupation("professional basketball player");
		p2.setAliveStatus("was");
		p2.toString();
		System.out.println(p2);
	}

	public static void dogs() {
		Dogs d1 = new Dogs();
		Dogs d2 = new Dogs();
		d1.setDog("Jack", 4, "alive");
		d2.setDog("John", 12, "dead");
		System.out.println(d1.getName() + " is " + d1.getDogAge() + ", " + d1.getDogStatus());
		System.out.println(d2.getName() + " is " + d2.getDogAge() + ", " + d2.getDogStatus());
		d1.aging(10);
		d2.aging(3);
		System.out.println(d1.getName() + " is " + d1.getDogAge() + ", " + d1.getDogStatus());
		System.out.println(d2.getName() + " is " + d2.getDogAge() + ", " + d2.getDogStatus());
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
