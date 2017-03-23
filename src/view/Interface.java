package view;

import java.util.Scanner;

import controller.GestaoCliente;
import controller.GestaoReservas;
import misc.MockupData;
import model.Cliente;

public class Interface {

	static Scanner n=new Scanner(System.in);
	static GestaoCliente g = new GestaoCliente();
	static GestaoReservas r = new GestaoReservas();
	static MockupData bd = new MockupData();
	
	public Interface(){
		
	}
	
	public void menu(){
		System.out.println("BEM VINDO AO BOOKINGMEAL");
		System.out.println(" 1 - REGISTAR CLIENTE   ");
		System.out.println(" 2 - LISTAR CLIENTE   ");
		System.out.println(" 3 - REGISTAR RESERVA");
		System.out.println(" 4 - LISTAR RESERVA   ");
		System.out.println(" 5 - SAIR");
		System.out.println();
		System.out.println("    ESCOLHA UMA OPCAO");
	}
	
	public void regCli(){
		
		System.out.println("INSIRA O NOME DO CLIENTE: ");
		String nome = n.nextLine();
		System.out.println("INSIRA A MORADA DO CLIENTE: ");
		String morada = n.nextLine();
		System.out.println("INSIRA O EMAIL DO CLIENTE: ");
		String email = n.nextLine();
		System.out.println("INSIRA O CONTACTO DO CLIENTE: ");
		String contacto = n.nextLine();
		g.addCli(nome, morada, email, contacto);
		
	}

	public void listCli() throws InterruptedException{
		
		System.out.println("INSIRA O ID DO CLIENTE: ");
		int id = n.nextInt();
		g.listarCliId(id);
		
	}
	
	public void regRev(){
		
		System.out.println("INSIRA O ID DO CLIENTE: ");
		/*n.nextLine();*/
		int id=n.nextInt();
		id-=1;
		for(int i=0;i<bd.cliente.size();i++){
			if(id==bd.cliente.get(i).getIdCliente()){
				Cliente c=new Cliente(bd.cliente.get(i).getIdCliente(),bd.cliente.get(i).getNomeCliente(),
						bd.cliente.get(i).getMoradaCliente(),bd.cliente.get(i).getEmailCliente(),bd.cliente.get(i).getContactoCliente());
				n.nextLine();
				System.out.println("INSIRA O PRATO DA RESERVA: ");
				String prato = n.nextLine();
				System.out.println("INSIRA A DATA DA RESERVA: ");
				String data = n.nextLine();
				r.addReserva(bd.reserva.size()+1, c, prato, data);
				
			}
		}
	}
	
	public void listRes() throws InterruptedException{
		System.out.println("INSIRA O ID DA RESERVA: ");
		int idR = n.nextInt();
		System.out.println("INSIRA O ID DO CLIENTE: ");
		int idC = n.nextInt();
		r.listarReserva(idR, idC);
	}
	
	
}
