package ATIV_FIX_HERANCA_01_LUCASDESOUSASANTOS;

public class Veiculo {
	//Declara��o de objetos
	private String Cor;
	private String Ano;
	private String Modelo;
	private String Placa;
	
	//M�todos set
	public void setCor(String Cor) {
		this.Cor = Cor;
	}
	public void setAno(String Ano) {
		this.Ano = Ano;
	}
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}
	public void setPlaca(String Placa) {
		this.Placa = Placa;
	}
	
	//M�todos get
	public String getCor() {
		return Cor;
	}
	public String getAno() {
		return Ano;
	}
	public String getModelo() {
		return Modelo;
	}
	public String getPlaca() {
		return Placa;
	}

}
