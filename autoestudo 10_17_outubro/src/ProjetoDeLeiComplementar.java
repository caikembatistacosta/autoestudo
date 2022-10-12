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
		String str = "Projeto de lei complementar " + this.getTitulo() +" de n�mero "+this.getNumeroProjeto() + " e com data de apresenta��o: " +this.getDataApresentacao() + " e data de aprova��o: " + this.getDataAprovacao() + " e artigo da Lei Org�nica " + this.getArtigoLO() + " e com " + this.getQtdVotosFavoraveis() + "votos favor�veis";
		return str;
	}
}
