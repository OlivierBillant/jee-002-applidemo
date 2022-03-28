package fr.eni.javaee.module9;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/couleurs")
public class GestionCouleurs {
	private static List<String> listeCouleurs;
	
	static
	{
		listeCouleurs= new ArrayList<String>();
		listeCouleurs.add("bleu");
		listeCouleurs.add("vert");
		listeCouleurs.add("jaune");
		listeCouleurs.add("rouge");
	}
	
	@GET
	public String getCouleurs()
	{
		return listeCouleurs.toString();
	}
	
	@GET
	@Path("/rouge")
	public String getCouleurRouge()
	{
		return "rouge";
	}
	
	@GET
	@Path("/{id : \\d+}")
	public String getCouleur(@PathParam("id") int id)
	{
		return "La couleur de l'id " + id + " est " + listeCouleurs.get(id);
	}
}





