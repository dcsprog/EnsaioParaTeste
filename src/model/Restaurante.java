package model;

public class Restaurante {
	
	private int idRest;
	private String nomeRest;
	private String moradaRest;
	private String contactoRest;
	private String especialidade;
	
	
	public Restaurante(int idRest, String nomeRest, String moradaRest, String contactoRest, String especialidade) {
		super();
		this.idRest = idRest;
		this.nomeRest = nomeRest;
		this.moradaRest = moradaRest;
		this.contactoRest = contactoRest;
		this.especialidade = especialidade;
	}


	public int getIdRest() {
		return idRest;
	}


	public void setIdRest(int idRest) {
		this.idRest = idRest;
	}


	public String getNomeRest() {
		return nomeRest;
	}


	public void setNomeRest(String nomeRest) {
		this.nomeRest = nomeRest;
	}


	public String getMoradaRest() {
		return moradaRest;
	}


	public void setMoradaRest(String moradaRest) {
		this.moradaRest = moradaRest;
	}


	public String getContactoRest() {
		return contactoRest;
	}


	public void setContactoRest(String contactoRest) {
		this.contactoRest = contactoRest;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
}
