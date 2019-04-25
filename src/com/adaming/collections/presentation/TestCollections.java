package com.adaming.collections.presentation;

import java.util.List;

import com.adaming.collections.dao.SalleService;
import com.adaming.collections.metiers.Salle;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* o	
		 * Créer cinq salles.
o	Afficher la liste des salles.
o	Supprimer une salle.
o	Modifier les informations d'une salle.
o	Afficher la liste des salles.
		 */
		System.out.println("Je crée mes salles");
		System.out.println("  ");
		Salle salle1 = new Salle(01, "math");
		Salle salle2 = new Salle(02, "français");
		Salle salle3 = new Salle(03, "chinois");
		Salle salle4 = new Salle(04, "théâtre");
		Salle salle5 = new Salle(05, "danse classique");

		/*	Ici on affiche les listes sous forme de salle mais ce n'est pas la consigne
		 * System.out.println("J'affiche la liste de mes salles");
		System.out.println(salle1.toString());
		System.out.println(salle2.toString());
		System.out.println(salle3.toString());
		System.out.println(salle4.toString());
		System.out.println(salle5.toString());   */

		SalleService monService = new SalleService();
		monService.create(salle1);
		monService.create(salle2);
		monService.create(salle3);
		monService.create(salle4);
		monService.create(salle5);

		/* J'affiche la liste de mes salles 

		List<Salle> salles = monService.findAll();
		for (Salle maSalle : salles) {
			System.out.println(maSalle.toString());  /* Le toString est optionnel ici
		} */

		System.out.println("J'affiche mes salles");
		System.out.println("  ");
		
		List<Salle> salles = monService.findAll();
		SalleService.afficherSalles(salles);
		
		/* Je supprime une salle */
		
		System.out.println("  ");
		System.out.println("Je supprime la salle 5");
		
		
		monService.delete(salle5);

		/* J'affiche la liste de mes salles */
		System.out.println("  ");
		System.out.println("J'affiche la liste de mes salles après suppression");
		
		
		monService.afficherSalles(salles);
		

		/* Modifier les informations d'une salle. */
		System.out.println("  ");
		System.out.println("Je modifie ma salle 2");
		
		salle2.setCode(555);
		salle2.setLibelle("Allemand");
		monService.update(salle2);

		
		 
		/* o	Afficher la liste des salles. */

		System.out.println("  ");
		System.out.println("J'affiche la liste de mes salles après modification");
		monService.afficherSalles(salles);
	}

}
