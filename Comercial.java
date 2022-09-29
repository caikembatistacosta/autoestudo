import java.time.LocalDate;

public class Comercial extends Telefone {
	
	private String ramoAtividade;
	
	public Comercial() {}
	
	public Comercial(String ramoAtividade,String nomeUsuario, String enderecoInsta, LocalDate dataInsta, String numero) {
		super(nomeUsuario,enderecoInsta,dataInsta,numero);
		this.ramoAtividade = ramoAtividade;
	}
	
	public double getValor() {
		if(this.getDataInsta().isBefore(LocalDate.parse("2019-01-01"))) {
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
	
}
