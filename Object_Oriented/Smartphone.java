package Object_Oriented;

public class Smartphone {
	private int capacity;
	private double battery_life;
	private boolean screen;
	private String sc;
	private boolean voice;
	private String vo;
	private boolean wifi;
	private String wi;
	private boolean bluetooth;
	private String bl;
	private int standby;

	public Smartphone(int capacity, String screen, String voice, String wifi, String bluetooth) {
		this.capacity = capacity;
		this.sc = screen;
		this.vo = voice;
		this.wi = wifi;
		this.bl = bluetooth;
		if (screen.equals("on"))
			this.screen = true;
		else
			this.screen = false;
		if (voice.equals("on"))
			this.voice = true;
		else
			this.voice = false;
		if (wifi.equals("on"))
			this.wifi = true;
		else
			this.wifi = false;
		if (bluetooth.equals("on"))
			this.bluetooth = true;
		else
			this.bluetooth = false;
		this.standby = 5;
	}

	public void blc() {
		int count = 5;
		if (this.screen == true)
			count += 500;
		if (this.voice == true)
			count += 300;
		if (this.wifi == true)
			count += 200;
		if (this.bluetooth == true)
			count += 100;
		double bl = 1.0 * this.capacity / count;
		this.battery_life = bl;
	}

	public void deviceSet(String screen, String voice, String wifi, String bluetooth) {
		this.sc = screen;
		this.vo = voice;
		this.wi = wifi;
		this.bl = bluetooth;
		if (screen.equals("on"))
			this.screen = true;
		else
			this.screen = false;
		if (voice.equals("on"))
			this.voice = true;
		else
			this.voice = false;
		if (wifi.equals("on"))
			this.wifi = true;
		else
			this.wifi = false;
		if (bluetooth.equals("on"))
			this.bluetooth = true;
		else
			this.bluetooth = false;
	}

	public String toString() {
		return String.format("The battery life is %.2f hours with screen is %s, "
				+ "the voice calling is %s, the wifi is %s, the bluetooth is %s." + "The capacity is %d in mAH.",
				this.battery_life, this.sc, this.vo, this.wi, this.bl, this.capacity);
	}
}
