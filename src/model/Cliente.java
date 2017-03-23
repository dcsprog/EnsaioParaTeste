package model;

public class Cliente {
	
	

	private int idCliente;
	private String nomeCliente;
	private String moradaCliente;
	private String emailCliente;
	private String contactoCliente;
	
	public Cliente(){
		
	}
	
	public Cliente(int idCliente, String nomeCliente, String moradaCliente, String emailCliente,
			String contactoCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.moradaCliente = moradaCliente;
		this.emailCliente = emailCliente;
		this.contactoCliente = contactoCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getMoradaCliente() {
		return moradaCliente;
	}

	public void setMoradaCliente(String moradaCliente) {
		this.moradaCliente = moradaCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getContactoCliente() {
		return contactoCliente;
	}

	public void setContactoCliente(String contactoCliente) {
		this.contactoCliente = contactoCliente;
	}
	
	
	
	
}
