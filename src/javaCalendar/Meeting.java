package javaCalendar;

public class Meeting extends Event {
	
	//si je veux rajouter un attribut propre a meeting je peux ici 

	public Meeting(String name, String description, String type) {
		super(name, description, type);
		// TODO Auto-generated constructor stub
	}
	public Meeting() {
		
	}

	@Override
	public String addEvent() {
		// TODO Auto-generated method stub
		return "je suis un meeting";
	}

	

}
