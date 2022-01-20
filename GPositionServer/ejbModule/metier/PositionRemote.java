package ma.metier;

import java.util.List;

import javax.ejb.Remote;

import ma.entites.Position;

@Remote
public interface PositionRemote {
	boolean create(Position o);

	boolean delete(Position o);

	boolean update(Position o);

	Position findById(int id);

	List<Position> findAll();

}
