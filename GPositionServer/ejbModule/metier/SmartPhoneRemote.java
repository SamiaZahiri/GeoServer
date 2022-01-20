package ma.metier;

import java.util.List;

import javax.ejb.Remote;

import ma.entites.SmartPhone;

@Remote
public interface SmartPhoneRemote {
	boolean create(SmartPhone o);

	boolean delete(SmartPhone o);

	boolean update(SmartPhone o);

	SmartPhone findById(int id);

	List<SmartPhone> findAll();

}
