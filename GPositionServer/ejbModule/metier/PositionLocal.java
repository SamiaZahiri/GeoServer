package ma.metier;

import java.util.List;

import javax.ejb.Local;

import ma.entites.Position;

@Local
public interface PositionLocal {
	boolean create(Position o);

	boolean delete(Position o);

	boolean update(Position o);

	Position findById(int id);

	List<Position> findAll();

}
