package EJBLOCAL;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Utilisateur;

/**
 * Session Bean implementation class UtilisateurDao
 */
@Stateless
@LocalBean
public class UtilisateurDao implements UtilisateurDaoLocal {
 
	@PersistenceContext(unitName="Myecommerce")
	 private EntityManager em; 


 

@Override
public Utilisateur getUserInfo(int idUser){
	return em.find(Utilisateur.class, idUser);
}
    
    
    
}
