package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {

      private Integer distanciaPreferida;
	
	
	public Corredor(Integer numero, String nombre,Integer distanciaPreferida) {
		super(numero, nombre);
		this.distanciaPreferida=distanciaPreferida;
		
	}
	
	

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}


	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados=km;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
	
		return this.cantidadDeKilometrosEntrenados;
	}

}
