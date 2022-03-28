package fr.eni.javaee.module4.dal;

public abstract class DAOFactory {
	
	public static AvisDAO getAvisDAO()
	{
		return new AvisDAOJdbcImpl();
	}
}
