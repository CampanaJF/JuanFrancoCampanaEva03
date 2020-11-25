package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;


public abstract class Deportista implements Comparable<Deportista> {
	
	protected Integer numeroDeSocio;
	protected String nombre;
	protected String estilo;
	protected TipoDeBicicleta tipoBici;
	protected Integer cantidadDeKilometrosEntrenados;

	
public Deportista(Integer numero,String nombre) {
	this.numeroDeSocio=numero;
	this.nombre=nombre;
}


public Integer getNumeroDeSocio() {
	return numeroDeSocio;
}


public String getNombre() {
	return nombre;
}

@Override
public int compareTo(Deportista o) {
	int numero = numeroDeSocio.compareTo(o.getNumeroDeSocio());

	return numero;
}




}
