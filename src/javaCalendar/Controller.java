package javaCalendar;

import java.util.Scanner;

public class Controller {
	Scanner scanner = new Scanner(System.in);

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
			throw new IllegalArgumentException("Ce choix n'est pas présent sur le menu : " + choice +". Veuillez un autre chiffre.");
		}
	}

	/**
	 * method to create a new user  
	 * @param 
	 * @return 
	 * @throws 
	 */
	/*public static void createUserAccount() {
		System.out.println("Entrez votre prénom : "); 
		System.out.println("Entrez votre nom : ");
		System.out.println("Entrez votre adresse email : ");
		System.out.println("Entrez votre mot de passe : ");


}*/

	/*********************************************************************/	
	/**
	 * method to connect user by using login credentials
	 * @param 
	 * @return 
	 * @throws 
	 */

	/*public static void connectUser() {



}*/


	/*********************************************************************/	
	/**
	 * method to create a new event 
	 * @param 
	 * @return 
	 * @throws 
	 */

	private void createEvent() {
		System.out.println("Entrez le nom de l'événement : ");
		Event.setName(scanner.next());
		System.out.println("Ajoutez une description à cet événement : ");
		Event.setDescription(scanner.next());
		System.out.println("Précisez le type de l'événement : Réunion - Appel Téléphonique");
		System.out.println("Indiquez la date de l'événement :");
		System.out.println("Votre événement a été ajouté avec succès !");
		

	}


	/*********************************************************************/	
	/**
	 * method to list event
	 * @param 
	 * @return 
	 * @throws 
	 */

	private void listEvent() {
		System.out.println("TODO");

	}


}


