package autoestudo;

import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

public class Especializado extends Telefone {
	private int qtdDeOcorr;
	
	public Especializado() {}
	
	public Especializado(int qtdDeOcorr,String nomeUsuario, String enderecoInsta, LocalDate dataInsta, String numero) {
		super(nomeUsuario,enderecoInsta,dataInsta,numero);
		this.qtdDeOcorr = qtdDeOcorr;
	}
	@Override
	public double getValor() {
		if(this.qtdDeOcorr >0) {
			if (this.qtdDeOcorr > 0 && this.qtdDeOcorr < 1001 ) {
				return 50.00;
			} if (this.qtdDeOcorr > 1000 && this.qtdDeOcorr < 5001) {
				return 67.80;
			} if (this.qtdDeOcorr > 5000 && this.qtdDeOcorr < 10001) {
				return 98.50;
			} if (this.qtdDeOcorr > 10000 && this.qtdDeOcorr < 50001) {
				return 123.90;
			} return 187.82;
		} else 
			throw new IllegalArgumentException("Quantidade de ocorrências menor ou igual a 0");

	}

	public int getQtdDeOcorr() {
		return qtdDeOcorr;
	}

	public void setQtdDeOcorr(int qtdDeOcorr) {
		this.qtdDeOcorr = qtdDeOcorr;
	}

	
	@Override
	public String imprimir() {

		String info = "";
		info += " Nome: "+getNomeUsuario();
		info += "\n Endereço: "+ getEnderecoInsta();
		info += "\n Data: "+ getDataInsta();
		info += "\n Numero: " + getNumero();
		info += "\n Quantidade de ocorrencias: "+ getQtdDeOcorr();
		info += "\n Valor básico a pagar: "+ getValor();
		return info;
	}
	
}
