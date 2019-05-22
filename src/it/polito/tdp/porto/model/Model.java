package it.polito.tdp.porto.model;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;

import it.polito.tdp.porto.db.PortoDAO;

public class Model {
	
	Graph grafo <Author,DefaultEdge> = new SimpleGraph<Author,DefaultEdge>();
	Map<Integer,Author> mappaAutori = new HashMap<Integer,Author>();
	
	
	public void creaGrafo() {
		PortoDAO dao = new PortoDAO();
		
		//creo i vertici del grafo prendendo tutti gli autori dal db con il metodo getALLAuthor
		Graphs.addAllVertices(grafo, dao.getAllAutore());
		
		//aggiungo alla mappa tutti gli autori creati così da non crearli più..
		for(Author a : grafo.vertexSet()) {
			mappaAutori.put(a.getId(), a);
			
			
		}
		
		
		
		//ora devo creare gli archi del grafo che sarebbero i co autori degli autori....
		
		
		
		
	}

}
