package javaCalendar;

import java.time.LocalDateTime;

public abstract class Event {
	
	//ATTRIBUTES
	private String name; 
	private String description; 
	private String type; 
	private LocalDateTime date; 
	//private organizer;
	//private participants; //arraylist
	
	//CONSTRUCTOR
	public Event(String name, String description, String type) {
		super();
		this.name = name;
		this.description = description;
		this.type = type;
		//date = new LocalDateTime(null, null) //on peut rajouter le jour ou l'ann�e etc. 
	}
	public Event() {
		
	}

	
	//GETTERS & SETTERS
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	//HASHCODE & EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public abstract String addEvent();


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
}
