package com.adaming.collections.metiers;

public class Salle {

	private int id;
	private int code;
	private String libelle;
	private static int compteurId = 0;
	
	
	
	public Salle(int code, String libelle) {
		super();
		
		this.id = compteurId++;
		this.code = code;
		this.libelle = libelle;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Salle [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}




	public int getId() {
		return id;
	}
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
