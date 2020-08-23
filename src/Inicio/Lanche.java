package Inicio;

public abstract class Lanche {
	private double tempoDePreparo;
	private double preco;
	private double distRest;
	private int quantidade;
	
	public void calculaTempo() {
		System.out.println("O tempo estimado para a entrega é: "+ ((10 * this.distRest) + this.tempoDePreparo) +" min");		
	}

	
	public abstract void calculaPreco();
	
	public abstract void detalhesPedido();
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(double tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public double getDistRest() {
		return distRest;
	}

	public void setDistRest(double distRest) {
		this.distRest = distRest;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = (int) quantidade;
	}
}
