package Inicio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Programa {
	static Scanner ler = new Scanner(System.in);
	
	static List<Double> dadosPedido = new ArrayList<>();
	static List<Integer> ingredientes  = new ArrayList<>();
	
	public static void main(String[] args) throws InterruptedException {
		int tipoLanche;
		
		do{
			System.out.println("\n************ Bem-vindo a Lanchonete DH-T2 ************");
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
	
	public static void menuSanduiche() throws InterruptedException {
		int controlLoop = 0;
		System.out.println("Informe os 10 ingredientes do Lanche:");
		for(int i = 1 ; i <= 10; i++) {
			System.out.println("[0]P�o Brioche, [1]Hamburger, [2]Bacon, [3]Alface, [4]Barbercue, [5]Mostarda, [6]Ketchup, [7]Queijo sui�o [8]Azeitona, [9]Parmes�o,"
					+ " [10] - SAIR");
			System.out.print("==> ");
			
			controlLoop = ler.nextInt();
			
			if(controlLoop == 10) {break;}
			
			ingredientes.add(controlLoop);
		}
		
		System.out.println("Informe a quantidade de Lanche: ");
		dadosPedido.add(ler.nextDouble());
		
		System.out.println("Informe a sua distancia em KM: ");
		dadosPedido.add(ler.nextDouble());
		
		Lanche lancheSanduiche = new Sanduiche(ingredientes, dadosPedido);
		
		processaPedido();
		System.out.println("##### Ordem de Pedido #####");
		System.out.println(dataPedido());
		lancheSanduiche.detalhesPedido();
		lancheSanduiche.calculaPreco();
		lancheSanduiche.calculaTempo();
	}
	
	public static void menuMassa() throws InterruptedException {
		System.out.println("Escolha a massa: Pizza, Macarr�o ou Lasanha ");
		System.out.println("[0] - Pizza");
		System.out.println("[1] - Macarr�o");
		System.out.println("[2] - Lasanha");
		ingredientes.add(ler.nextInt());
		
		System.out.println("Informe a sua distancia em KM: ");
		dadosPedido.add(ler.nextDouble());
		
		System.out.println("Informe a quantidade: ");
		dadosPedido.add(ler.nextDouble());

		Lanche lancheMassa = new Massa(ingredientes, dadosPedido);
		
		processaPedido();
		System.out.println("##### Ordem de Pedido #####");
		System.out.println(dataPedido());
		lancheMassa.detalhesPedido();
		lancheMassa.calculaPreco();
		lancheMassa.calculaTempo();
	}
	
	public static void menuBolo() throws InterruptedException {
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
		
		processaPedido();
		System.out.println("##### Ordem de Pedido #####");
		System.out.println(dataPedido());
		lancheBolo.detalhesPedido();
		lancheBolo.calculaPreco();
		lancheBolo.calculaTempo();
	}
	
	public static String dataPedido() {
		LocalDateTime dataNow = LocalDateTime.now();
		DateTimeFormatter format = 	DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatHour = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String data = format.format(dataNow);
		String hora = formatHour.format(dataNow);
		return "Data: " +data + " Hora: "+hora;
	}
	
	public static void processaPedido() throws InterruptedException {
		String progress = "#";
		Integer temp;
		
		Random gerador = new Random();
		
		/* Gero um tempo rand�mico entre 0 e 200 para o processamento */
		temp =  (int) (gerador.nextDouble() * 200);
		
		System.out.print("\n");
		System.out.print("\n");		
		System.out.print("Processando Ordem de Pedido....");
		System.out.print("\n");
		System.out.print("0% ");
		
		try {
			for(int i = 0; i <= 15; i++) {
				System.out.print(progress);
				progress.concat("#");
				Thread.sleep(temp);
			}
		}catch(InterruptedException ex) {
			System.out.println("Ops..... Ocorreu um probleminha!");
		}
		
		System.out.print(" 100%");
		System.out.print("\n");
		System.out.print("\n");
	}

}
