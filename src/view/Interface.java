package view;

import java.util.Scanner;

import controller.GestaoCliente;

public class Interface {

	static Scanner n=new Scanner(System.in);
	static GestaoCliente g = new GestaoCliente();
	public Interface(){
		
	}
	
	public void menu(){
		System.out.println("BEM VINDO AO BOOKINGMEAL");
		System.out.println();
		System.out.println(" 1 - REGISTAR CLIENTE   ");
		System.out.println();
		System.out.println(" 2 - REGISTAR RESERVA");
		System.out.println();
		System.out.println(" 3 - SAIR");
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
}
