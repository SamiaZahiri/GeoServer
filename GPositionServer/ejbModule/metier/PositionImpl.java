package ma.metier;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import javafx.scene.chart.Chart;
import ma.entites.Position;

@Stateless
public class PositionImpl implements PositionLocal, PositionRemote {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@PermitAll
	public boolean create(Position o) {
		em.persist(o);
		return false;
	}

	@Override
	public boolean delete(Position o) {
		em.remove(em.contains(o)?o: em.merge(o));
		return false;
	}

	@Override
	public boolean update(Position o) {
		em.remove(em.contains(o)?o: em.merge(o));
		
		return false;
	}

	@Override
	@PermitAll
	public Position findById(int id) {
		return em.find(Position.class, id);
		
	}

	@Override
	@PermitAll
	public List<Position> findAll() {
		Query query= em.createQuery("from Position");
		return query.getResultList();
	}
	
	
	public List<ma.entites.Chart> chartBySmartPhone() { 
        List<ma.entites.Chart> charts = new ArrayList<>();
        return charts;
	}
	
	
	
}
