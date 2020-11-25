package ar.edu.unlam.pb2.eva03;

public class Deportista {
	
	protected Integer numeroDeSocio;
	protected String nombre;

	
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





}
