package javaCalendar;


import java.time.LocalDateTime;

public abstract class Event {
	
	//ATTRIBUTES
	private String name; 
	private String description; 
	private LocalDateTime date; 
	
	//CONSTRUCTOR
	public Event(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	//CONSTRUCTOR allowing to create an event without any attribute
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

	public abstract String getType();
	
	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
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
	
	//PERSONALIZED TO STRING
	public String toString() {
		String completeSentence = "*********************************************************" + "\nNom de l'événement : " + name + "\nDescription de l'événement : " + description +  "\nDate de l'événement (yyyy/MM/ddTHH:mm) : " + date;
		return completeSentence ;
	}


	
	
}
