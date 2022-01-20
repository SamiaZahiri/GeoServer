package ma.metier;

import java.util.List;

import javax.ejb.Local;

import ma.entites.SmartPhone;
import ma.entites.Utilisateur;

@Local
public interface UserLocal {
	boolean create(Utilisateur o);

	boolean delete(Utilisateur o);

	boolean update(Utilisateur o);

	Utilisateur findById(int id);

	List<Utilisateur> findAll();

}
