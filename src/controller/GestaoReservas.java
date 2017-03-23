package controller;

import java.util.Scanner;

import misc.MockupData;
import model.Cliente;
import model.Reserva;

public class GestaoReservas {
	
	Scanner n = new Scanner(System.in);
	MockupData bd = new MockupData();
	
	
	public GestaoReservas(){
		
	}
	
	public void addReserva(int idReserva, Cliente c, String prato, String data){
		
		Reserva r= new Reserva(bd.reserva.size(),c,prato,data);
		bd.reserva.add(r);
		
	}
	
	public void listarReserva(int idReserva,int idCliente) throws InterruptedException{
		
		idReserva-=1;
		idCliente-=1;
		for(int i=0;i<bd.reserva.size();i++){
			if(idReserva==bd.reserva.get(i).getIdReserva()){
				for(int j=0;j<bd.cliente.size();j++){
					if(idCliente==bd.cliente.get(j).getIdCliente()){
						System.out.println("NUMERO DE RESERVA: "+bd.reserva.get(i).getIdReserva());
						System.out.println("PRATO RESERVADO: "+bd.reserva.get(i).getResPrato());
						System.out.println("RESERVA EM NOME DE: "+bd.cliente.get(j).getNomeCliente());
						System.out.println("EMAIL DO CLIENTE: "+bd.cliente.get(j).getEmailCliente());
						System.out.println("CONTACTO DO CLIENTE: "+bd.cliente.get(j).getContactoCliente());
						Thread.sleep(1000);
					}
				}
				
			}
			
		}
	}
	
}
