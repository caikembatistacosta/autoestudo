import java.time.LocalDate;

public class Telefone {
	private String nomeUsuario;
	private String enderecoInsta;
	private LocalDate dataInsta;
	private String numero;
	
	public Telefone() {}
	
	public Telefone(String nomeUsuario, String enderecoInsta, LocalDate dataInsta, String numero) {
		this.nomeUsuario = nomeUsuario;
		this.enderecoInsta = enderecoInsta;
		this.dataInsta = dataInsta;
		this.numero = numero;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getEnderecoInsta() {
		return enderecoInsta;
	}
	public void setEnderecoInsta(String enderecoInsta) {
		this.enderecoInsta = enderecoInsta;
	}
	public LocalDate getDataInsta() {
		return dataInsta;
	}
	public void setDataInsta(LocalDate dataInsta) {
		this.dataInsta = dataInsta;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if(numero.length() == 10) {
			this.numero = numero;
		}else 
			throw new IllegalArgumentException("O n�mero deve conter pelo menos 10 caracteres");
	}
	
}
