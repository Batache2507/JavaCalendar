package javaCalendar;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
	
public class Controller {
	Scanner scanner = new Scanner(System.in);
	EventFactory eventfactory = new EventFactory();
	ArrayList<User> contacts = new ArrayList<User>();
	ArrayList<Event> events = new ArrayList<Event>();
	
	/**
	 * welcome menu, so he can choose what he wants to do 
	 * 
	 * 
	 */	/*
	public void welcomeMenu() {
		System.out.println("*************************************************");
		System.out.println("MBA1 - POO - Travail individuel - Nathan Bataille");
		System.out.println("*************************************************");
		System.out.println("Bienvenue sur votre mini-agenda !");
	}*/
	
	
	/**
	 * action menu for the user, so he can choose what he wants to do 
	 * @param switch menu 
	 * @return the method associated to the number chosen by the user 
	 * @throws IllegalArgumentException if number for menu is incorrect
	 */	
		public void actionMenu() {
		System.out.println("*************************************************");
		System.out.println("MBA1 - POO - Travail individuel - Nathan Bataille");
		System.out.println("*************************************************");
		System.out.println("Bienvenue sur votre mini-agenda !");
		System.out.println("Que voulez-vous faire ?");
		System.out.println("*************************************************");
		System.out.println();
		System.out.println("Choisissez le chiffre correspondant : ");
		System.out.println("1 -> Cr�er un nouvel �v�nement");
		System.out.println("2 -> Cr�er un nouveau contact");
		System.out.println("Afficher la liste des �v�nements pr�vu pour le jour");
		System.out.println("3 -> Lister tous les �v�nements");
		System.out.println("4 -> Lister tous les contacts");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1 : 
			createEvent();
			break;
		case 2 : 
			createContact();
			break;
		case 3 : 
			listAllEvents();
			break;
		case 4 : 
			listAllContacts();
			break;
		default:
			throw new IllegalArgumentException("Ce choix n'est pas pr�sent sur le menu : " + "'" + choice + "'" +". Veuillez choisir un chiffre pr�sent ci-dessus.");
		}
	}
	
	/**
	 * method to create a new event 
	 * @return toString of the event 
	 * 
	 */
	private void createEvent() {
		System.out.println("Pr�cisez le type de l'�v�nement : Meeting - PhoneCall");
		Event event = eventfactory.create(scanner.next()); //type event
		System.out.println("Entrez le nom de l'�v�nement (max 1 mot) : "); //only one word 
		String name = scanner.next();
		event.setName(name);
		System.out.println("Ajoutez une description � cet �v�nement (max 1 mot) : "); //only one word 
		String description = scanner.next();
		event.setDescription(description);
		//System.out.println("Citez les contacts qui sont invit�s � cet �v�nement : ");
		//
		System.out.println("Quelle est la date et l'heure de cet �v�nement :");
		System.out.println("Indiquez le jour (entre 1 et 31) : ");
		int day = scanner.nextInt();
		System.out.println("Indiquez le mois (entre 1 et 12) : "); 
		int month = scanner.nextInt();
		System.out.println("Indiquez l'ann�e (yyyy) : ");
		int year = scanner.nextInt();
		System.out.println("Indiquez l'heure (HH) : ");
		int hour = scanner.nextInt();
		System.out.println("Indiquez les minutes (mm) : ");
		int minute = scanner.nextInt();
		LocalDateTime date = LocalDateTime.of(year, month, day , hour, minute);
		event.setDate(date);
		System.out.println("Votre �v�nement a �t� ajout� avec succ�s !");
		System.out.println(event.toString());
		events.add(event);
		actionMenu();
	}
	
	/**
	 * method to create a new event 
	 * @return toString of the event 
	 * 
	 */
	private void createContact() {
		User user = new User(); //CHANGER CA, MAIS COMMENT???
		System.out.println("Entrez son pr�nom : ");
		String firstname = scanner.next();
		user.setFirstname(firstname); 
		System.out.println("Entrez son nom : ");
		String lastname = scanner.next();
		user.setLastname(lastname);
		System.out.println("Entrez son adresse email : ");
		String email = scanner.next(); 
		user.setEmail(email);
		System.out.println("*********************************************************");
		System.out.println("Votre contact a �t� ajout� avec succ�s !");
		System.out.println(user.toString());
		contacts.add(user);
		actionMenu();
	}
	
	/**
	 * method to list event
	 * @return a toString with all the events
	 *
	 */
	private void listAllEvents() {
		for (Event event : events) {
			System.out.println(event.toString());
		}
		actionMenu();
	}
	
	/**
	 * method to list all contacts from all events
	 * @return a toString of all the contacts
	 * 
	 */
	private void listAllContacts() {
		for (User user : contacts) {
			System.out.println(user.toString());
		}
		actionMenu();
	}
	
	//private void listTodaysEvents() {
		//TODO
	//}

}


