package javaCalendar;

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
		System.out.println("1 -> Créer un événement");
		System.out.println("2 -> Lister les événements");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1 : 
			createEvent();
			break;
		case 2 : 
			listEvent();
			break;
		default:
			throw new IllegalArgumentException("Ce choix n'est pas présent sur le menu : " + "'" + choice + "'" +". Veuillez choisir un chiffre présent ci-dessus.");
		}
	}
	
	/**
	 * method to create a new event 
	 * @param 
	 * @return toString of the event 
	 * @throws
	 * 
	 */

	private void createEvent() {
		System.out.println("Précisez le type de l'événement : Meeting - PhoneCall");
		Event event = eventfactory.create(scanner.next()); //j'ai du mal avec cette ligne 
		System.out.println("Entrez le nom de l'événement : ");
		String name = scanner.next();
		event.setName(name);
		System.out.println("Ajoutez une description à cet événement : ");
		String description = scanner.next();
		event.setDescription(description);
		System.out.println("Indiquez la date de l'événementte (JJ/MM/AAAA HH:MM) :");
		String date = scanner.next();
		date += " " + scanner.next();
		event.setDate(DateConversion.StringToLDT(date));
		System.out.println("******************************************");
		System.out.println("Votre événement a été ajouté avec succès !");
		System.out.println(event.toString());

	}


	/**
	 * method to list event
	 * @param 
	 * @return 
	 * @throws 
	 */

	private void listEvent() {
		System.out.println("TODO");
		//TODO
	}


}


