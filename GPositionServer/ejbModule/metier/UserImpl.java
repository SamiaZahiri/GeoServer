package ma.metier;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.entites.Chart;
import ma.entites.Utilisateur;

@Stateless
public class UserImpl implements UserLocal, UserRemote {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@PermitAll
	public boolean create(Utilisateur o) {
		em.persist(o);
		return false;
	}

	@Override
	public boolean delete(Utilisateur o) {
		em.remove(em.contains(o)?o: em.merge(o));
		return false;
	}

	@Override
	public boolean update(Utilisateur o) {
		em.remove(em.contains(o)?o: em.merge(o));
		
		return false;
	}

	@Override
	@PermitAll
	public Utilisateur findById(int id) {
		return em.find(Utilisateur.class, id);
		
	}

	@Override
	@PermitAll
	public List<Utilisateur> findAll() {
		Query query= em.createQuery("from Utilisateur");
		return query.getResultList();
	}
	
	public List<Chart> chartBySmartPhone(){
        String sql="SELECT COUNT(p.id),s.imei FROM Prosition p,SmartPhone s WHERE p.smartphone_id=s.id GROUP BY smartphone_id";

        Query query=em.createNativeQuery(sql);
                      List<Chart> charts = new java.util.ArrayList<>();
                      System.out.println(query.getResultList());
                      
		return charts;
    }
	
	
	
}
