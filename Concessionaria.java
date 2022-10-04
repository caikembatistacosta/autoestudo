// Caike Batista, Guilherme Moll, Micael Luan

import java.util.HashMap;
import java.util.Map;

public class Concessionaria {
	HashMap<String, Telefone> telefones = new HashMap<String, Telefone>();

	public void addTelefone(Telefone t) {
		if (!this.telefones.containsKey(t.getNumero())) {
			this.telefones.put(t.getNumero(), t);
		}
	}

	public Telefone procuraTelefone(String numero) {
		if (this.telefones.containsKey(numero)) {
			return this.telefones.get(numero);
		} else {
			return	null;
		}
//	}
	

		
//public double faturamento() {
	//double faturamento = 0;
//	for (Map.Entry<String, Telefone> e : telefones.entrySet()) {
		
	}
	 public Telefone getTelefone(Telefone t) {
		 if (this.telefones.containsValue(t)) {
				return this.telefones.get(t);
			} else {
				return	null;
			}
	 }		
	
	
	 public double explorarTelefone() {
		 double resultado = 0;
		 for (Map.Entry<String, Telefone> entry : telefones.entrySet()) {
			    String key = entry.getKey();
			    Telefone telefone = entry.getValue();
			    // do something with key and/or tab
			    resultado += telefone.getValor();
			}
		 return resultado;
	 }
}
	
//}
