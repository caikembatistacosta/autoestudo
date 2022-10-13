import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate;
public class Vereador { // contribui��o do Carlos
	private DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private String nome;
	private Partido partido;
	private int qtdProjApres;
	private int qtdProjAprov;
	private LocalDate localdate1;
	private ArrayList<ProjetoDeLei> projetos = new ArrayList<>();
	
	public Vereador() {
	}

	
	public Vereador(String nome, Partido partido) {
		this.setNome(nome);
		this.setPartido(partido);
	}

	public ArrayList<ProjetoDeLei> getProjetos() {
		return projetos;
	}
// aqui eu fiz (caso seja null, adicione),  testei com a  data n�o � null e adicionou
	public void addProjeto(ProjetoDeLei p) {
		qtdProjApres++;
		if(p.getDataAprovacao() != null) {
			qtdProjAprov++;
		} 
		projetos.add(p);
	    
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
		partido.addVereador(this);  // para vincular em ambos os lados da rela��o
	}

	public int getQtdProjApres () {
		return qtdProjApres;
	}

	public int getQtdProjAprov() {
		return qtdProjAprov;
	}


	public double calculaIndiceTrabalho() {
		if (this.qtdProjApres >= 1 && this.qtdProjApres <= 5) {
			return 0.8;
		} else if (this.qtdProjApres >= 6 && this.qtdProjApres <= 10) {
			return 1;
		} else if (this.qtdProjApres >= 11 && this.qtdProjApres <= 17) {
			return 1.08;
		} else if (this.qtdProjApres > 17) {
			return 1.22;
		}

		return 0;
	}

	public double calculaDesempenho() {
		
		return ((double)this.qtdProjAprov / (double)this.qtdProjApres) * this.calculaIndiceTrabalho();
	}

	public String toString() {
		return this.nome;

	}
	
public String getAllProjetos() {
String desc = "";
for(ProjetoDeLei p : projetos) {
desc += p.mostrar();
}
return desc;}
}
