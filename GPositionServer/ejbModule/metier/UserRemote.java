package ma.metier;

import java.util.List;

import javax.ejb.Remote;

import ma.entites.SmartPhone;
import ma.entites.Utilisateur;

@Remote
public interface UserRemote {
	boolean create(Utilisateur o);

	boolean delete(Utilisateur o);

	boolean update(Utilisateur o);

	Utilisateur findById(int id);

	List<Utilisateur> findAll();

}
