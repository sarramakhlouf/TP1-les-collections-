package TP1;

import java.util.Scanner;

public class MainPart2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Annuaire annuaire = new Annuaire();
	        
	        while (true) {
	            System.out.print("Entrez une commande : ");
	            String commande = scanner.nextLine().trim();
	            
	            if (commande.equals(".")) {
	                System.out.println("Fin du programme.");
	                break;
	            } else if (commande.startsWith("+")) {
	                String nom = commande.substring(1);
	                System.out.print("Entrez le numéro : ");
	                String numero = scanner.nextLine();
	                System.out.print("Entrez l'adresse : ");
	                String adresse = scanner.nextLine();
	                annuaire.ajouterFiche(nom, numero, adresse);
	            } else if (commande.startsWith("?")) {
	                String nom = commande.substring(1);
	                annuaire.rechercheFiche(nom);
	            }else if (commande.equals("!")) {
	                annuaire.afficherFiches();
	            } else {
	                System.out.println("Commande inconnue.");
	            }
	        }
	 }
}
