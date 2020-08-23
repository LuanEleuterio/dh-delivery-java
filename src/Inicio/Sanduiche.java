package Inicio;

import java.util.ArrayList;
import java.util.List;

public class Sanduiche extends Lanche{
	List<Integer> arrIngredientes = new ArrayList<>();
	String listaIngredientes[] = {"Pão Brioche","Hamburger", "Bacon","Alface","Barbercue","Mostarda","Ketchup","Queijo suiço","Azeitona","Parmesão",};
	
	public Sanduiche(List<Integer> arrIngredientes, List<Double> dadosPedido) {
		this.arrIngredientes = arrIngredientes;
		super.setDistRest(dadosPedido.get(1));
		super.setTempoDePreparo(15);
		super.setQuantidade(dadosPedido.get(0));
		super.setPreco(15.60);
	}

	@Override
	public void calculaTempo() {
		System.out.println("O tempo estimado para a entrega é: "+ ((10 * super.getDistRest()) + super.getTempoDePreparo()) +" min");		
	}

	@Override
	public void calculaPreco() {
		System.out.println("O Preço total do pedido é de: R$"+ super.getQuantidade() * super.getPreco() );	
	}

	@Override
	public void detalhesPedido() {
		System.out.println("");	
		System.out.println("Lanche: Sanduiche");
		System.out.println("Preço: R$" + super.getPreco());
		System.out.println("Quantidade: " + super.getQuantidade());
		System.out.println("Ingredientes: " + arrIngredientes.toString());
		for(int i = 0 ; i < arrIngredientes.size(); i++) {
			System.out.print(listaIngredientes[i]);
			if(i < arrIngredientes.size() ) {System.out.print(", ");}
		}	
		System.out.println("\n");
	}
}
