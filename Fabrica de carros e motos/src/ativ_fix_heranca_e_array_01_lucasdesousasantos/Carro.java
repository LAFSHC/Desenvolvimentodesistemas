package ativ_fix_heranca_e_array_01_lucasdesousasantos;

public class Carro extends Veiculo {
	//Declara��o de objetos
	private String Marca;	
	private Double Valor;
	
	//M�todos set
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	public void setValor(Double Valor) {
		this.Valor = Valor;
	}
	
	//M�todos get
	public Double getValor() {
		return Valor;
	}
	public String getMarca() {
		return Marca;
	}

}
