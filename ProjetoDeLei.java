import java.time.LocalDate;
import java.util.ArrayList;

public class ProjetoDeLei {

	private Vereador vereador;
	private String titulo;
	private LocalDate dataApresentacao;
	private LocalDate dataAprovacao = null;
	private  int numeroProjeto;
	private static int proximoProjeto = 0;

	
	// projeto aprovado
 public ProjetoDeLei(String titulo, LocalDate dataApresentacao, int numeroProjeto) {
		super();
		this.titulo = titulo;
		this.dataApresentacao = dataApresentacao;
		this.numeroProjeto = numeroProjeto;	
		
 }

 public ProjetoDeLei(){}
 
// projeto n�o aprovado
public ProjetoDeLei(String titulo, LocalDate dataApresentacao, LocalDate dataAprovacao, int numeroProjeto) {
		super();
		this.titulo = titulo;
		this.dataApresentacao = dataApresentacao;
		this.dataAprovacao = dataAprovacao;
		this.numeroProjeto = numeroProjeto;
	}


public String mostrar() {
	 String descricao ="\n Titulo: ";
	 descricao += getTitulo()+" Data de apresentacao: ";
	 descricao += getDataApresentacao(); 
	 if(getDataAprovacao() != null) {
		 descricao += " Data de aprovacao: "+ getDataApresentacao();
	 }
	 descricao += "Numero do projeto: ";
	 descricao += getNumeroProjeto();
	
	return descricao;
 }


public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public void setNumeroProjeto(int quantiaProjetos) {
	this.numeroProjeto = this.numeroProjeto + 1;
}

public int getNumeroProjeto() {
	return this.numeroProjeto;
}


public LocalDate getDataApresentacao() {
	return dataApresentacao;
}


public void setDataApresentacao(LocalDate dataApresentacao) {
	this.dataApresentacao = dataApresentacao;
}


public LocalDate getDataAprovacao() {
	if (this.dataAprovacao == null) {
		return null;}
	
	return dataAprovacao;
}


public void setDataAprovacao(LocalDate dataAprovacao) {
	this.dataAprovacao = dataAprovacao;
}



}
