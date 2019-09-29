package model;

public class Measurements {

	private String time; 
	private double resistance; 
	
	public Measurements (String time, double resistance) {
		this.time = time; 
		this.resistance = resistance; 
	}
	
	public Measurements (double resistance) {
		time = "00:00"; 
		this.resistance = resistance; 
	}
	
	public String getTime() {
		return time;
	}
	
	public double getResistance () {
		return resistance; 
	}
	
	public String toString() {
		return "Time: " + getTime() + " Resistance: " + getResistance(); 
	}
	
}
