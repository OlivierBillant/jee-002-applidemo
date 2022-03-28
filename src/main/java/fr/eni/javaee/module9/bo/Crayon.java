package fr.eni.javaee.module9.bo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="crayon")
public class Crayon implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String type;
	private String couleur;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public Crayon() {
	}
	public Crayon(String type, String couleur) {
		super();
		this.type = type;
		this.couleur = couleur;
	}
	public Crayon(int id, String type, String couleur) {
		super();
		this.id = id;
		this.type = type;
		this.couleur = couleur;
	}
	@Override
	public String toString() {
		return "Crayon [id=" + id + ", type=" + type + ", couleur=" + couleur + "]";
	}
	
}
