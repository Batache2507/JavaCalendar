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
			throw new IllegalArgumentException("Ce choix n'est pas pr�sent sur le menu : " + choice +". Veuillez un autre chiffre.");
		}
	}

	/**
	 * method to create a new user  
	 * @param 
	 * @return 
	 * @throws 
	 */
	/*public static void createUserAccount() {
		System.out.println("Entrez votre pr�nom : "); 
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
		System.out.println("Entrez le nom de l'�v�nement : ");
		Event.setName(scanner.next());
		System.out.println("Ajoutez une description � cet �v�nement : ");
		Event.setDescription(scanner.next());
		System.out.println("Pr�cisez le type de l'�v�nement : R�union - Appel T�l�phonique");
		System.out.println("Indiquez la date de l'�v�nement :");
		System.out.println("Votre �v�nement a �t� ajout� avec succ�s !");
		

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


