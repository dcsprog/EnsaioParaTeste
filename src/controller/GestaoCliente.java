package controller;

import java.util.Scanner;

import misc.MockupData;
import model.Cliente;


public class GestaoCliente {
	
	Scanner n = new Scanner(System.in);
	MockupData bd = new MockupData();
	
	public GestaoCliente(){
		
		
		
	}
	
	public void addCli(String nome, String morada,String email, String telefone){
		
		Cliente c = new Cliente(bd.cliente.size(),nome,morada,email,telefone);
		bd.cliente.add(c);
		
	}
	
	public void listarCliId(int idCli) throws InterruptedException{
		idCli-=1;
		for(int i=0;i<bd.cliente.size();i++){
				if(idCli==bd.cliente.get(i).getIdCliente()){
					System.out.println("NUMERO DE CLIENTE: "+bd.cliente.get(i).getIdCliente());
					System.out.println("NOME DO CLIENTE: "+bd.cliente.get(i).getNomeCliente());
					System.out.println("MORADA DO CLIENTE: "+bd.cliente.get(i).getMoradaCliente());
					System.out.println("EMAIL DO CLIENTE: "+bd.cliente.get(i).getEmailCliente());
					System.out.println("CONTACTO DO CLIENTE: "+bd.cliente.get(i).getContactoCliente());
					System.out.println("\n\n\n\n");
					Thread.sleep(1000);
				}
		}
		
	}

	
}
