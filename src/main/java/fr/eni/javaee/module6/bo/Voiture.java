package fr.eni.javaee.module6.bo;

import java.io.Serializable;
/**
 * La classe Voiture respecte les règles d'un JavaBean:
 * -Implémente l'interface Serializable
 * -Respecte la nomenclature des getters et setters
 * -L'existence d'un contructeur sans paramètre
 * @author Administrator
 *
 */
public class Voiture implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String marque;
	private String modele;
	private String immatriculation;
	private int kilometrage;
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
		
	public Voiture() {

	}
	public Voiture(String marque, String modele, String immatriculation, int kilometrage) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.immatriculation = immatriculation;
		this.kilometrage = kilometrage;
	}
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", immatriculation=" + immatriculation
				+ ", kilometrage=" + kilometrage + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((immatriculation == null) ? 0 : immatriculation.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		if (immatriculation == null) {
			if (other.immatriculation != null)
				return false;
		} else if (!immatriculation.equals(other.immatriculation))
			return false;
		return true;
	}
	
	
}
