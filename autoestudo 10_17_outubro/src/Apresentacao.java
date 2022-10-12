import java.time.LocalDate;

public class Apresentacao {

	public static void main(String[] args) {
		Camara c = new Camara();
		
		Partido p1 = new Partido("Micael", 122);
		
		Vereador v1 = new Vereador("Micael", p1);
		
		ProjetoDeLei prj1 = new ProjetoDeLei("projeto teste", LocalDate.parse("2022-10-05"), v1.qtdProjApres() + 1);
		
		v1.addProjetoDeLei(prj1);
		
		c.addPartido(p1);

	}

}
