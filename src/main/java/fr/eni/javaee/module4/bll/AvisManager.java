package fr.eni.javaee.module4.bll;

import fr.eni.javaee.module4.BusinessException;
import fr.eni.javaee.module4.bo.Avis;
import fr.eni.javaee.module4.dal.AvisDAO;
import fr.eni.javaee.module4.dal.DAOFactory;

/**
 * 
 * @author Administrator
 *
 * Cette classe permet d'effectuer les traitements attendus sur la classe Avis
 */
public class AvisManager {
	
	private AvisDAO avisDAO;
	
	/**
	 * Le constructeur permet d'initialiser la variable membre avisDAO pour 
	 * permettre une communication avec la base de données. 
	 */
	public AvisManager() {
		this.avisDAO=DAOFactory.getAvisDAO();
	}
	/**
	 * @param description
	 * @param note
	 * @return un objet Avis en cas de succcès
	 * @throws BusinessException 
	 */
	public Avis ajouter(String description, int note) throws BusinessException
	{
		BusinessException exception = new BusinessException();
		
		Avis avis = new Avis(description, note);
		
		this.validerNote(avis,exception);
		this.validerDescription(avis,exception);

		if(!exception.hasErreurs())
		{
			this.avisDAO.insert(avis);
		}
		
		if(exception.hasErreurs())
		{
			throw exception;
		}
		return avis;
	}
	
	/**
	 * Cette méthode permet de vérifier les règles à respecter sur la variable membre note.
	 * En cas d'erreur, le code d'erreur est enregistré dans l'objet businessException.
	 * @param avis
	 * @param businessException 
	 */
	private void validerNote(Avis avis, BusinessException businessException)
	{
		if(avis.getNote()<1 || avis.getNote()>5)
		{
			businessException.ajouterErreur(CodesResultatBLL.REGLE_AVIS_NOTE_ERREUR);
		}
	}
	
	/**
	 * Cette méthode permet de vérifier les règles à respecter sur la variable membre description.
	 * En cas d'erreur, le code d'erreur est enregistré dans l'objet businessException.
	 * @param avis
	 * @param businessException
	 */
	private void validerDescription(Avis avis, BusinessException businessException)
	{
		if(avis.getDescription()==null  || avis.getDescription().equals("")|| avis.getDescription().length()>150)
		{
			businessException.ajouterErreur(CodesResultatBLL.REGLE_AVIS_DESCRIPTION_ERREUR);
		}
	}
}
