package javaCalendar;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
	
public class Controller {
	Scanner scanner = new Scanner(System.in);
	EventFactory eventfactory = new EventFactory();
	
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
		System.out.println("1 -> Cr�er un �v�nement");
		System.out.println("2 -> Lister les �v�nements");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1 : 
			createEvent();
			break;
		case 2 : 
			listEvent();
			break;
		default:
			throw new IllegalArgumentException("Ce choix n'est pas pr�sent sur le menu : " + "'" + choice + "'" +". Veuillez choisir un chiffre pr�sent ci-dessus.");
		}
	}
	
	/**
	 * method to create a new event 
	 * @param ?????
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
		int minutes = scanner.nextInt();
		LocalDateTime date = LocalDateTime.now().withDayOfMonth(day).withMonth(month).withYear(year).withHour(hour).withMinute(minutes).truncatedTo(ChronoUnit.MINUTES);
		event.setDate(date);
		System.out.println("*********************************************************");
		System.out.println("Votre �v�nement a �t� ajout� avec succ�s !");
		System.out.println(event.toString());

	}

	
	/**
	 * method to list event
	 * @param 
	 * @return 
	 * @throws 
	 */

	private void listEvent() {

		//System.out.println("TODO");
		//TODO
	}


}


