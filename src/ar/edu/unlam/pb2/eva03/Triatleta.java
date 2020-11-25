package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;


public class Triatleta extends Deportista implements ICiclista {

	private String distanciaPreferida;
	
	
	
	public Triatleta(Integer numero, String nombre, String distanciaPreferida, TipoDeBicicleta bici) {
		super(numero, nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.tipoBici=bici;
		
	}

	

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return this.tipoBici;
	}

	
	public String getDistanciaPreferida() {
	
		return this.distanciaPreferida;
	}

	
}
