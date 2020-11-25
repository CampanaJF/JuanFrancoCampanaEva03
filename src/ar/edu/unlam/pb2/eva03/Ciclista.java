package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista {

	
	
	
	
	public Ciclista(Integer numero, String nombre,TipoDeBicicleta bici) {
		super(numero, nombre);
		this.tipoBici=bici;
		
	}



	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		return this.tipoBici;
	}
	
	

}
