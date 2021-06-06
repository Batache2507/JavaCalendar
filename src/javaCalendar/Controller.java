package javaCalendar;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
public class Controller {
	Scanner scanner = new Scanner(System.in);
	EventFactory eventfactory = new EventFactory();
	ArrayList<User> contacts = new ArrayList<User>();
	
	/**
	 * action menu for the user, so he can choose what he wants to do 
	 * @param switch menu 
	 * @return the method associated to the number chosen by the user 
	 * @throws IllegalArgumentException if number for menu is incorrect
	 */	
	public void actionMenu() {
		System.out.println("MBA1 - POO - Travail individuel - Nathan Bataille");
		System.out.println("*************************************************");
		System.out.println("Bienvenue sur votre mini-agenda !");
		System.out.println("*************************************************");
		System.out.println("Que voulez-vous faire ?");
		System.out.println("*************************************************");
		System.out.println();
		System.out.println("Choisissez le chiffre correspondant : ");
		System.out.println("1 -> Créer un nouvel événement");
		System.out.println("2 -> Créer un nouveau contact");
		System.out.println("3 -> Lister les événements");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1 : 
			createEvent();
			break;
		case 2 : 
			createContact();
			break;
		case 3 : 
			listEvent();
			break;
		default:
			throw new IllegalArgumentException("Ce choix n'est pas présent sur le menu : " + "'" + choice + "'" +". Veuillez choisir un chiffre présent ci-dessus.");
		}
	}
	
	/**
	 * method to create a new event 
	 * @return toString of the event 
	 * 
	 */

	private void createEvent() {
		System.out.println("Précisez le type de l'événement : Meeting - PhoneCall");
		Event event = eventfactory.create(scanner.next()); //type event
		System.out.println("Entrez le nom de l'événement (max 1 mot) : "); //only one word 
		String name = scanner.next();
		event.setName(name);
		System.out.println("Ajoutez une description à cet événement (max 1 mot) : "); //only one word 
		String description = scanner.next();
		event.setDescription(description);
		//System.out.println("Citez les contacts qui sont invités à cet événement : ");
		//
		System.out.println("Quelle est la date et l'heure de cet événement :");
		System.out.println("Indiquez le jour (entre 1 et 31) : ");
		int day = scanner.nextInt();
		System.out.println("Indiquez le mois (entre 1 et 12) : "); 
		int month = scanner.nextInt();
		System.out.println("Indiquez l'année (yyyy) : ");
		int year = scanner.nextInt();
		System.out.println("Indiquez l'heure (HH) : ");
		int hour = scanner.nextInt();
		System.out.println("Indiquez les minutes (mm) : ");
		int minute = scanner.nextInt();
		LocalDateTime date = LocalDateTime.of(year, month, day , hour, minute);
		event.setDate(date);
		System.out.println("*********************************************************");
		System.out.println("Votre événement a été ajouté avec succès !");
		System.out.println(event.toString());
		actionMenu();

	}
	
	/**
	 * method to create a new event 
	 * @return toString of the event 
	 * 
	 */
	private void createContact() {
		User user = null;
		System.out.println("Entrez son prénom : ");
		String firstname = scanner.next();
		user.setFirstname(firstname); 
		System.out.println("Entrez son nom : ");
		String lastname = scanner.next();
		user.setLastname(lastname);
		String email = scanner.next(); 
		user.setEmail(email);
		System.out.println("*********************************************************");
		System.out.println("Votre contact a été ajouté avec succès !");
		System.out.println(user.toString());
		contacts.add(user);
		actionMenu();
	}
	
	/**
	 * method to list event
	 * @param 
	 * @return 
	 * @throws 
	 */

	private void listEvent() {
		//List<Event> events = new ArrayList<Event>();	
		//events.add(Event); // I AM HERE I AM HERE I AM HERE I AM HERE I AM HERE I AM HERE I AM HERE I AM HERE I AM HERE
		//System.out.println(events);
		//System.out.println("TODO");
		//TODO
	}


}


