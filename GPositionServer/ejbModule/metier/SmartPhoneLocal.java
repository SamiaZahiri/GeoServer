package ma.metier;

import java.util.List;

import javax.ejb.Local;

import ma.entites.SmartPhone;
@Local
public interface SmartPhoneLocal {
	boolean create(SmartPhone o);

	boolean delete(SmartPhone o);

	boolean update(SmartPhone o);

	SmartPhone findById(int id);

	List<SmartPhone> findAll();

}
