package fr.eni.javaee.module4.bo;

import java.io.Serializable;

public class Avis implements Serializable {

	private static final long serialVersionUID = 1L;
	private int identifiant;
	private String description;
	private int note;
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	
	public Avis() {

	}
	public Avis(String description, int note) {
		super();
		this.description = description;
		this.note = note;
	}
	public Avis(int identifiant, String description, int note) {
		super();
		this.identifiant = identifiant;
		this.description = description;
		this.note = note;
	}
	@Override
	public String toString() {
		return "Avis [identifiant=" + identifiant + ", description=" + description + ", note=" + note + "]";
	}
	
	
}
