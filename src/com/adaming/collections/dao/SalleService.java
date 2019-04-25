package com.adaming.collections.dao;

import java.util.ArrayList;
import java.util.List;

import com.adaming.collections.metiers.Salle;

public class SalleService implements IDao<Salle> {

	/*
	2.	Cr�er la classe SalleService qui impl�mente l'interface IDao. 
	Dans cette classe les donn�es seront stock�s dans une collection de type List.
	*/
	List<Salle> salles = new ArrayList<Salle>();
	
	@Override
	public boolean create(Salle s) {
		
		return salles.add(s);
	
	}

	@Override
	public boolean delete(Salle s) {
		
		return salles.remove(s);
	}
	/*	if (s.getId()<salles.size())
		{
			salles.remove(s);
			return true;
		}
		else
		{
		return false;
	} */

	@Override
	public boolean update(Salle s) {
		
		for (Salle maSalle : salles) {
			if (maSalle.getId() == s.getId()) {
				maSalle.setCode(s.getCode());
				maSalle.setLibelle(s.getLibelle());
				return true;
			}
		}
		return false;
	}

	//M�thode permettant de renvoyer un objet dont id est pass� en param�tre.
	
	@Override
	public Salle findById(int id) {
		for (Salle maSalle : salles) {
			if (maSalle.getId() == id) {
				return maSalle;
			}
		}
		return null;
	}

	@Override
	public List findAll() {
		
		return salles;
		
	}

	public static void afficherSalles(List<Salle> salles) {
		for (Salle maSalle : salles) {
			System.out.println(maSalle.toString());  /* Le toString est optionnel ici*/
		}
	}
	
}
