package javaCalendar;

public class Meeting extends Event {
	
	//ATTRIBUTES
	private String type;

	//CONSTRUCTOR
	public Meeting(String name, String description) {
		super(name, description);
		this.type = "Meeting"; 
	}
	
	
	public Meeting() {
		this.type = "Meeting"; 	
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
