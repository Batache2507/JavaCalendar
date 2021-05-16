package javaCalendar;

public class EventFactory {


/**
* method to create a new event with his type
* @param eventType, the type of event
* @return the event and his type created 
* @throws IllegalArgumentException if unknown type
*/
	public Event create (final String eventType) {
		switch (eventType) {
		case "Meeting" : 
			return new Meeting();
		case "PhoneCall" :
			return new PhoneCall();
		default : 
			throw new IllegalArgumentException("Ce type d'événement n'existe pas : " + eventType);
		}
		
	}
	
	
}
