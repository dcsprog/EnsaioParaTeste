package application;

import java.util.Scanner;

import controller.GestaoCliente;
import misc.MockupData;
import view.Interface;

public class App {

	static Interface i = new Interface();
	static GestaoCliente g = new GestaoCliente();
	MockupData bd = new MockupData();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		boolean verf=true;
		
		do{
			
			i.menu();
			int opc;
			opc = n.nextInt();
			switch(opc){
			case 1:
				i.regCli();
				break;
			case 2:
				i.listCli();
				break;
			case 3:
				verf=false;
			default:
				break;
			}
		}while(verf);
		
		
	}	
	

}
