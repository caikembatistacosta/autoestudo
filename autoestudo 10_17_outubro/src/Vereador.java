import java.util.ArrayList;

public class Vereador {

	private String nome;
	private Partido partido;
	
	public ArrayList<ProjetoDeLei> projetosDeLei = new ArrayList<ProjetoDeLei>();


	public int qtdProjApres() {
		return this.projetosDeLei.size();
	}
	
	
	public int qtdsProjAprov() {
		int pa = 0;
		for(ProjetoDeLei p : projetosDeLei) {
			if(p.isAprovado()) {
				pa += pa;
			}
		}
		return pa;
	}
	
	public void addProjetoDeLei(ProjetoDeLei p) {
		this.projetosDeLei.add(p);
	}
	
	public Vereador() {
	}

	public Vereador(String nome, Partido partido) {
		this.setNome(nome);
		this.setPartido(partido);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
		partido.addVereador(this);  // para vincular em ambos os lados da relação
	}


	public double calculaIndiceTrabalho() {
		if (this.qtdProjApres() >= 1 && this.qtdProjApres() <= 5) {
			return 0.8;
		} else if (this.qtdProjApres() >= 6 && this.qtdProjApres() <= 10) {
			return 1;
		} else if (this.qtdProjApres() >= 11 && this.qtdProjApres() <= 17) {
			return 1.08;
		} else if (this.qtdProjApres() > 17) {
			return 1.22;
		}

		return 0;
	}

	public double calculaDesempenho() {
		return (this.qtdsProjAprov() / this.qtdProjApres()) * this.calculaIndiceTrabalho();
	}
	
}