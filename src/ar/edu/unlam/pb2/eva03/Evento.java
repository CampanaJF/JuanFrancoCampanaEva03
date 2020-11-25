package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private String descripcion;
	private Map<Integer, Deportista> participantes;
	
	
public Evento (TipoDeEvento tipo,String descripcion) {
	this.numeroDeInscripcion=0;
	this.tipo=tipo;
	this.participantes=new TreeMap<Integer,Deportista>();
}


public TipoDeEvento getTipo() {
	return tipo;
}

public Integer getNumeroDeInscripcion() {
	return this.numeroDeInscripcion;
}

public String getDescripcion() {
	return this.descripcion;
}

public void agregarParticipante(Deportista deportista) {
	this.participantes.put(this.numeroDeInscripcion++, deportista);
}


}
