package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SmartPhone
 *
 */
@Entity
public class SmartPhone implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String imei;
	@ManyToOne
	private Utilisateur utilisateur;
	private static final long serialVersionUID = 1L;

	public SmartPhone() {
		super();
	}  
	
	
	public SmartPhone(String imei, Utilisateur utilisateur) {
		super();
		this.imei = imei;
		this.utilisateur = utilisateur;
	}


	public SmartPhone(int id, String imei, Utilisateur utilisateur) {
		super();
		this.id = id;
		this.imei = imei;
		this.utilisateur = utilisateur;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	
   
}
