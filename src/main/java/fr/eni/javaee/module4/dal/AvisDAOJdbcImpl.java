package fr.eni.javaee.module4.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.eni.javaee.module4.BusinessException;
import fr.eni.javaee.module4.bo.Avis;

class AvisDAOJdbcImpl implements AvisDAO {

	private static final String INSERT="INSERT INTO AVIS(description, note) VALUES(?,?);";
	
	@Override
	public void insert(Avis avis) throws BusinessException {
		if(avis==null)
		{
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_NULL);
			throw businessException;
		}
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, avis.getDescription());
			pstmt.setInt(2, avis.getNote());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next())
			{
				avis.setIdentifiant(rs.getInt(1));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			if(e.getMessage().contains("CK_AVIS_note"))
			{
				businessException.ajouterErreur(CodesResultatDAL.INSERT_AVIS_NOTE_ECHEC);
			}
			else
			{
				businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_ECHEC);
			}
			throw businessException;
		}	
	}

}
