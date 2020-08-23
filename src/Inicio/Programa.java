package Inicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	static Scanner ler = new Scanner(System.in);
	
	static List<Double> dadosPedido = new ArrayList<>();
	static List<Integer> ingredientes  = new ArrayList<>();
	
	public static void main(String[] args) {
		int tipoLanche;
		
		do {
		System.out.println("Bem-vindo a Lanchonete DH-T2");
		System.out.println("****************************");
		System.out.println("Escola seu tipo de lanche :");
		System.out.println("[0] - Sanduiches");
		System.out.println("[1] - Massas");
		System.out.println("[2] - Bolos");
		System.out.println("[3] - Sair");
		System.out.print("==>");
		tipoLanche = ler.nextInt();
		
		switch(tipoLanche) {
		case 0:
			 menuSanduiche();
			break;
		case 1:
			menuMassa();
			break;
		case 2:
			menuBolo();
			break;
		}
		}while(tipoLanche != 3);
		
	}
	
	public static void menuSanduiche() {
		int controlLoop = 0;
		System.out.println("Informe os 10 ingredientes do Lanche:");
		for(int i = 1 ; i <= 10; i++) {
			System.out.println("[0]Pão Brioche, [1]Hamburger, [2]Bacon, [3]Alface, [4]Barbercue, [5]Mostarda, [6]Ketchup, [7]Queijo suiço [8]Azeitona, [9]Parmesão,"
					+ " [10] - SAIR");
			System.out.print("==> ");
			
			controlLoop = ler.nextInt();
			
			if(controlLoop == 10) {break;}
			
			ingredientes.add(controlLoop);
			System.out.println();
		}
		
		System.out.println("Informe a quantidade de Lanche: ");
		dadosPedido.add(ler.nextDouble());
		
		System.out.println("Informe a sua distancia em KM: ");
		dadosPedido.add(ler.nextDouble());
		
		Lanche lancheSanduiche = new Sanduiche(ingredientes, dadosPedido);
		
		lancheSanduiche.detalhesPedido();
		lancheSanduiche.calculaPreco();
		lancheSanduiche.calculaTempo();
	}
	
	public static void menuMassa() {
		System.out.println("Escolha a massa: Pizza, Macarrão ou Lasanha ");
		System.out.println("[0] - Pizza");
		System.out.println("[1] - Macarrão");
		System.out.println("[2] - Lasanha");
		ingredientes.add(ler.nextInt());
		
		System.out.println("Informe a sua distancia em KM: ");
		dadosPedido.add(ler.nextDouble());
		
		System.out.println("Informe a quantidade: ");
		dadosPedido.add(ler.nextDouble());

		Lanche lancheMassa = new Massa(ingredientes, dadosPedido);
		
		lancheMassa.detalhesPedido();
		lancheMassa.calculaPreco();
		lancheMassa.calculaTempo();
	}
	
	public static void menuBolo() {
		List<String> ingredientesBolo  = new ArrayList<>();
		System.out.println("Escolha a massa do Bolo: ");
		ingredientesBolo.add(ler.next());
		System.out.println("Escolha o recheio do Bolo: ");
		ingredientesBolo.add(ler.next());
		System.out.println("Escolha a cobertura do Bolo: ");
		ingredientesBolo.add(ler.next());
		
		System.out.println("Informe a sua distancia em KM: ");
		dadosPedido.add(ler.nextDouble());
		
		System.out.println("Informe a quantidade: ");
		dadosPedido.add(ler.nextDouble());

		Lanche lancheBolo = new Bolo(ingredientesBolo, dadosPedido);
		
		lancheBolo.detalhesPedido();
		lancheBolo.calculaPreco();
		lancheBolo.calculaTempo();
	}

}
