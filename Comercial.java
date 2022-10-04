// Caike Batista, Guilherme Moll, Micael Luan

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Comercial extends Telefone {
	
	private String ramoAtividade;
	
	public Comercial() {}
	
	public Comercial(String ramoAtividade,String nomeUsuario, String enderecoInsta, LocalDate dataInsta, String numero) {
		super(nomeUsuario,enderecoInsta,dataInsta,numero);
		this.ramoAtividade = ramoAtividade;
	}
	@Override
	public double getValor() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		if(this.getDataInsta().isBefore(LocalDate.parse("01-01-2019", formatter))) {
			return 25.00;
		}else {
			return 37.50;
		}
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	
	}
	
	@Override
	public String imprimir() {

		String info = "";
		info += " Nome: "+getNomeUsuario();
		info += "\n Endere�o: "+ getEnderecoInsta();
		info += "\n Data: "+ getDataInsta();
		info += "\n Numero: " + getNumero();
		info += "\n Ramo de atividade: "+ getRamoAtividade();
		info += "\n Valor b�sico a pagar: "+ getValor();
	
	return info;
	}
	
}
