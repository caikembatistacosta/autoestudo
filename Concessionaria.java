import java.util.HashMap;

public class Concessionaria {
	HashMap<String, Telefone> telefones = new HashMap<String, Telefone>();
	
	public void addTelefone(Telefone t){
		if(!this.telefones.containsKey(t.getNumero())) {
			this.telefones.put(t.getNumero(), t);
		}
	}
	
	public Telefone procuraTelefone(String numero) {
		return this.telefones.get(numero);
	}
}
