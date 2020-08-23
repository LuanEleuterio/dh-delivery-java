package Inicio;

import java.util.List;

public class Bolo extends Lanche{
	String massa;
	String recheio;
	String cobertura;
	
	public Bolo(List<String> ingredientes, List<Double> dadosPedido) {
		this.massa = ingredientes.get(0);
		this.recheio = ingredientes.get(1);
		this.cobertura = ingredientes.get(2);
		super.setDistRest(dadosPedido.get(0));
		super.setTempoDePreparo(10);
		super.setQuantidade(dadosPedido.get(1));
		super.setPreco(39.90);
	}
	
	@Override
	public void calculaTempo() {
		System.out.println("O tempo estimado para a entrega é de: "+ ((10 * super.getDistRest()) + super.getTempoDePreparo()) +" min");			
	}

	@Override
	public void calculaPreco() {
		System.out.println("O Preço total do pedido é de: R$"+ super.getQuantidade() * super.getPreco() );
		
	}

	@Override
	public void detalhesPedido() {
		System.out.println("");	
		System.out.println("Lanche: Bolo");
		System.out.println("Massa: "+this.massa);
		System.out.println("Recheio: " + this.recheio);
		System.out.println("Cobertura: "+this.cobertura);	
		System.out.println("Preço: R$" + super.getPreco());
		System.out.println("Quantidade: " + super.getQuantidade());
	}
}
