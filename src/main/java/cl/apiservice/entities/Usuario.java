package cl.apiservice.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="alias")
	private String alias;

	@Column(name="clave")
	private String clave;
	
	public Usuario(){
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getAlias(){
		return alias;
	}

	public void setAlias(String alias){
		this.alias = alias;
	}

	public String getClave(){
		return clave;
	}

	public void setClave(String clave){
		this.clave = clave;
	}
}