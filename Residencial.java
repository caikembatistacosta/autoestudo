package autoestudo;

import java.time.LocalDate;

public class Residencial extends Telefone {
	private boolean conexaoInternet;

	public Residencial() {
	}

	public Residencial(Boolean conexaoInternet, String nomeUsuario, String enderecoInsta, LocalDate dataInsta,
			String numero) {
		super(nomeUsuario, enderecoInsta, dataInsta, numero);
		this.conexaoInternet = conexaoInternet;
	}
	@Override
	public double getValor() {
		return 15.00;
	}

	public boolean isConexaoInternet() {
		return conexaoInternet;
	}

	public void setConexaoInternet(boolean conexaoInternet) {
		this.conexaoInternet = conexaoInternet;
	}
	
	@Override
	public String imprimir() {

		String info = "";
		info += " Nome: "+getNomeUsuario();
		info += "\n Endereço: "+ getEnderecoInsta();
		info += "\n Data: "+ getDataInsta();
		info += "\n Numero: " + getNumero();
		info += "\n Possui Internet? ";
		if (isConexaoInternet() == true) {
			info+= "sim";
		} else info += "nao";
		info += "\n Valor básico a pagar: R$ 15,00";
		
		return info;

	}

}