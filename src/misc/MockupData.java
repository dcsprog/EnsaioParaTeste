package misc;

import java.util.ArrayList;

import model.Cliente;

import model.Reserva;
import model.Restaurante;

public class MockupData {

	public ArrayList<Cliente> cliente;
	public ArrayList<Restaurante> restaurante;
	public ArrayList<Reserva> reserva;

	
	public MockupData(){
		
		cliente = new ArrayList<>();
		restaurante = new ArrayList<>();
		reserva = new ArrayList<>();
		
	}
}
