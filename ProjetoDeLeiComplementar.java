import java.time.LocalDate;

public class ProjetoDeLeiComplementar extends ProjetoDeLei {
	private String artigoLO;
	private int qtdVotosFavoraveis;
	public ProjetoDeLeiComplementar(String titulo, LocalDate dataApresentacao, int numeroProjeto, String artigoLO,
			int qtdVotosFavoraveis) {
		super(titulo, dataApresentacao, numeroProjeto);
		this.artigoLO = artigoLO;
		this.qtdVotosFavoraveis = qtdVotosFavoraveis;
	}
	
	public ProjetoDeLeiComplementar() {}
	
	public String getArtigoLO() {
		return artigoLO;
	}
	public void setArtigoLO(String artigoLO) {
		this.artigoLO = artigoLO;
	}
	public int getQtdVotosFavoraveis() {
		return qtdVotosFavoraveis;
	}
	public void setQtdVotosFavoraveis(int qtdVotosFavoraveis) {
		this.qtdVotosFavoraveis = qtdVotosFavoraveis;
	}
	@Override
	public String mostrar() {
		 String descricao ="\n Titulo: ";
		 descricao += getTitulo()+"Data de apresentacao: ";
		 descricao += getDataApresentacao(); 
		 if(getDataAprovacao() != null) {
			 descricao += "Data de aprovacao: "+ getDataApresentacao();
		 }
		 descricao += "Numero do projeto: ";
		 descricao += getNumeroProjeto()+" Artigo LO: " ;
		 descricao += getArtigoLO()+" Quantia de votos favoraveis: ";
		 descricao += getQtdVotosFavoraveis();
		 return descricao;
	}
	
}

