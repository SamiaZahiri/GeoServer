package dao;

import java.util.List;

import javax.ejb.Remote;

import entities.Utilisateur;



@Remote

public interface IDaoRemote<T> {
	boolean create(T u);
	boolean delete (T u);
	boolean update (T u);
	T getById(int id);
	List<T> getAll();

}
