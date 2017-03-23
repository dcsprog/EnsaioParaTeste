package application;

import java.util.Scanner;

import view.Interface;

public class App {

	static Interface i = new Interface();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		
		i.menu();
		int opc;
		opc = n.nextInt();
		
		
		
	}

}
