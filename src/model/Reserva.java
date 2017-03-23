package model;

public class Reserva {

	
	private int idReserva;
	private Cliente cliente;
	private String resPrato;
	private String data;
	
	public Reserva(){
		
	}
	
	public Reserva(int idReserva, Cliente cliente, String resPrato, String data) {
		super();
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.resPrato = resPrato;
		this.data = data;
	}


	public int getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getResPrato() {
		return resPrato;
	}


	public void setResPrato(String resPrato) {
		this.resPrato = resPrato;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
	
	
}
