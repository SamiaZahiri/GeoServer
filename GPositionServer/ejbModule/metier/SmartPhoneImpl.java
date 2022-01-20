package ma.metier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.entites.SmartPhone;

@Stateless
public class SmartPhoneImpl implements SmartPhoneLocal, SmartPhoneRemote {

	@PersistenceContext
	private EntityManager em;
	
	private UserImpl us;
	
	
	@Override
	@PermitAll
	public boolean create(SmartPhone o) {
		em.persist(o);
		return false;
	}

	@Override
	public boolean delete(SmartPhone o) {
		em.remove(em.contains(o)?o: em.merge(o));
		return false;
	}

	@Override
	public boolean update(SmartPhone o) {
		em.remove(em.contains(o)?o: em.merge(o));
		
		return false;
	}

	@Override
	@PermitAll
	public SmartPhone findById(int id) {
		return em.find(SmartPhone.class, id);
		
	}

	@Override
	@PermitAll
	public List<SmartPhone> findAll() {
		Query query= em.createQuery("from SmartPhone");
		return query.getResultList();
	}
	
	

	
	
	
}
