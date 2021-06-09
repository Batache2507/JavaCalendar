package javaCalendar;

public class PhoneCall extends Event {
	
	//ATTRIBUTES
	private String type;

	//CONSTRUCTOR
	public PhoneCall(String name, String description) {
		super(name, description);
		this.type = "PhoneCall";
	}
	
	public PhoneCall() {
		this.type = "PhoneCall"; 
	}
	
	//GETTERS & SETTERS
	public String getType() {
		return type;
	}
	
	//PERSONALIZED TO STRING
	@Override
	public String toString() {
		return super.toString() + "\nType d'événement : " + type + "\n*********************************************************";
	}
	
	
}
