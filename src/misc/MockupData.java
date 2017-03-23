package misc;

import java.util.ArrayList;

import model.Cliente;

import model.Reserva;
import model.Restaurante;

public class MockupData {

	public static ArrayList<Cliente> cliente;
	public static ArrayList<Restaurante> restaurante;
	public static ArrayList<Reserva> reserva;

	
	public MockupData(){
		
		cliente = new ArrayList<>();
		restaurante = new ArrayList<>();
		reserva = new ArrayList<>();
		
	}
}
