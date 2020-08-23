package Inicio;

import java.util.List;

public class Massa extends Lanche {
	String molho;
	String tipoMassa;
	String arrMassa[] = {"Pizza","Macarrão","Lasanha"};
	
	public Massa(List<Integer> ingredientes, List<Double> dadosPedido) {
		this.tipoMassa = this.arrMassa[ingredientes.get(0)];
		super.setDistRest(dadosPedido.get(0));
		super.setTempoDePreparo(30);
		super.setQuantidade(dadosPedido.get(1));
		super.setPreco(21.50);
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
		System.out.println("Lanche: Massa tipo " + this.tipoMassa);
		System.out.println("Preço da Unidade: R$" + super.getPreco());
		System.out.println("Quantidade: " + super.getQuantidade());
	}
}
