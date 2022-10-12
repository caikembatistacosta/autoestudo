import java.time.LocalDate;

public class ProjetoDeLeiComplementar extends ProjetoDeLei {
	private String artigoLO;
	private int qtdVotosFavoraveis;
	public ProjetoDeLeiComplementar(String titulo, LocalDate dataApresentacao, LocalDate dataAprovacao,
			int numeroProjeto, String artigoLO, int qtdVotosFavoraveis) {
		super(titulo, dataApresentacao, dataAprovacao, numeroProjeto);
		this.setArtigoLO(artigoLO);
		this.setQtdVotosFavoraveis(qtdVotosFavoraveis);
	}
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
	public String mostrar(){
		String str = "Projeto de lei complementar " + this.getTitulo() +" de número "+this.getNumeroProjeto() + " e com data de apresentação: " +this.getDataApresentacao() + " e data de aprovação: " + this.getDataAprovacao() + " e artigo da Lei Orgânica " + this.getArtigoLO() + " e com " + this.getQtdVotosFavoraveis() + "votos favoráveis";
		return str;
	}
}
