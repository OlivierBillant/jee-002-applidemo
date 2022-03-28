package fr.eni.javaee.module4.dal;

import fr.eni.javaee.module4.BusinessException;
import fr.eni.javaee.module4.bo.Avis;

public interface AvisDAO {
	/**
	 * En cas d'erreur, le code d'erreur est enregistré dans l'objet businessException.
	 * @param avis
	 * @throws BusinessException
	 */
	public void insert(Avis avis) throws BusinessException;
}
