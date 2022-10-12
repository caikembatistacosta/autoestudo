import java.time.LocalDate;

public class ProjetoDeLei {
	protected String titulo;
	protected LocalDate dataApresentacao;
	protected LocalDate dataAprovacao;
	protected int numeroProjeto;
	
	public ProjetoDeLei(String titulo, LocalDate dataApresentacao, LocalDate dataAprovacao, int numeroProjeto) {
		super();
		this.setTitulo(titulo);
		this.setDataApresentacao(dataApresentacao);
		this.setDataAprovacao(dataAprovacao);
		this.setNumeroProjeto(numeroProjeto);
	}
	
	public ProjetoDeLei(String titulo, LocalDate dataApresentacao, int numeroProjeto) {
		super();
		this.setTitulo(titulo);
		this.setDataApresentacao(dataApresentacao);
		this.setNumeroProjeto(numeroProjeto);
	}
	
	public boolean isAprovado() {
		if(this.getDataAprovacao() != null) {
			return true;
		} return false;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDate getDataApresentacao() {
		return dataApresentacao;
	}
	public void setDataApresentacao(LocalDate dataApresentacao) {
		this.dataApresentacao = dataApresentacao;
	}
	public LocalDate getDataAprovacao() {
		return dataAprovacao;
	}
	public void setDataAprovacao(LocalDate dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}
	public int getNumeroProjeto() {
		return numeroProjeto;
	}
	public void setNumeroProjeto(int numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}
	
	public String mostrar() {
		String str = "Projeto de lei " + this.getTitulo() +" de número "+this.getNumeroProjeto() + " e com data de apresentação: " +this.getDataApresentacao() + " e data de aprovação: " + this.getDataAprovacao();
		return str;
	}
	
	
}
